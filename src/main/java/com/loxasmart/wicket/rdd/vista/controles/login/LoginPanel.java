/*
 * Copyright 2024 LoxaSmart.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.loxasmart.wicket.rdd.vista.controles.login;

import static com.loxasmart.wicket.rdd.vista.controles.login.ILoginPanel.ID_FOTO;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.form.AjaxFormComponentUpdatingBehavior;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.basic.Label;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.image.ContextImage;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.resource.PackageResourceReference;

/**
 *
 * @author jhsla
 */
public class LoginPanel extends Panel implements ILoginPanel {

    private static final long serialVersionUID = 1L;
    public final String FOTO_GUEST = "/vista/imagenes/com.jhslandin.persona.guest.png";
    public final String FOTO_WORKER = "/vista/imagenes/fotos/1102548847.jpg";

    private Form form;
    private Label lbUsername;
    private TextField tfUsername;
    private Label lbDatos;
    private Label lbPassword;
    private PasswordTextField tfPassword;
//    private Button btLogin;
    
    private FeedbackPanel feedback;
    
//    private Image imgFoto;
    private ContextImage imgFoto;

    public LoginPanel(String id) {
        super(id);

        this.makeComponents();
        this.setHandlers();
        this.addComponents();
    }

    private void makeComponents() {
        this.lbUsername = new Label(ID_LABEL_USERNAME, "Usuario:");
        this.tfUsername = new TextField(ID_TEXT_USERNAME, Model.of(""));
        this.lbDatos = new Label(ID_DATOS, "");
        this.lbPassword = new Label(ID_LABEL_PASSWORD, "Contraseña:");
        this.tfPassword = new PasswordTextField(ID_TEXT_PASSWORD, Model.of(""));
        //    this.btLogin = new Button(ID_LOGIN);
        /*
        this.imgFoto = new Image(ID_FOTO, 
            new PackageResourceReference(getClass(),"com.jhslandin.persona.guest.png"));
         */
        imgFoto = new ContextImage(ID_FOTO, this.FOTO_WORKER);

        this.form = new Form(ID_FORM)/* {
            @Override
            public void onSubmit() {
                System.out.println("(S) Username: " + tfUsername.getValue());
                System.out.println("(S) Password: " + tfPassword.getValue());
            }
        }*/;
        feedback = new FeedbackPanel("feedback");
        feedback.setOutputMarkupId(true);
        add(feedback);

    }

    private void addComponents() {
        this.form.add(lbUsername);
        this.form.add(tfUsername);
        this.form.add(lbDatos);
        this.form.add(lbPassword);
        this.form.add(tfPassword);
        //   this.form.add(btLogin);
        this.form.add(imgFoto);
        this.add(form);
    }

    private void setHandlers() {
        this.tfUsername.add(new AjaxFormComponentUpdatingBehavior("change") {
            @Override
            protected void onUpdate(AjaxRequestTarget target) {
                System.out.println(tfUsername.getValue());
            }
        });

        this.form.add(new AjaxButton(ID_LOGIN) {
            @Override
            protected void onAfterSubmit(AjaxRequestTarget target) {
                info(tfUsername.getModelObject() + " " + tfPassword.getModelObject());
                target.add(feedback);
                //ContextImage imgFoto = new ContextImage(ID_FOTO, FOTO_GUEST);
            }
        });
    }

    @Override
    public void renderHead(IHeaderResponse response) {
        PackageResourceReference cssFile
                = new PackageResourceReference(this.getClass(), "LoginPanel.css");
        CssHeaderItem cssItem = CssHeaderItem.forReference(cssFile);

        response.render(cssItem);
    }
}
