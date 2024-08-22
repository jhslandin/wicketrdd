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

import org.apache.wicket.ajax.AjaxEventBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.basic.Label;

import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.image.Image;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.Model;

/**
 *
 * @author jhsla
 */
public class LoginPanel extends Panel implements ILoginPanel {

    private static final long serialVersionUID = 1L;

    private String modelUsername = "johnny";
    
    private Label lbUsername;
    private TextField tfUsername;
    private Label lbDatos;
    private Label lbPassword;
    private PasswordTextField tfPassword;
    private Button btLogin;
    private Image imgFoto;

    public LoginPanel(String id) {
        super(id);

        this.makeComponents();
        this.addComponents();
        this.setHandlers();
    }

    private void makeComponents() {
        this.lbUsername = new Label(ID_LABEL_USERNAME, "Usuario:");
        this.tfUsername = new TextField(ID_TEXT_USERNAME, new Model(modelUsername));
        this.lbDatos = new Label(ID_DATOS, "");
        this.lbPassword = new Label(ID_LABEL_PASSWORD, "Contraseña:");
        this.tfPassword = new PasswordTextField(ID_TEXT_PASSWORD);
        this.btLogin = new Button(ID_LOGIN);
        this.imgFoto = new Image(ID_FOTO, "com.jhslandin.persona.guest.png");
    }

    private void addComponents() {
        add(lbUsername);
        add(tfUsername);
        add(lbDatos);
        add(lbPassword);
        add(tfPassword);
        add(btLogin);
        add(imgFoto);
    }

    private void setHandlers() {
        System.out.println("Wicket");
        
        this.tfUsername.add(new AjaxTextField(tfUsername, "change") {
            @Override
            protected void onEvent(AjaxRequestTarget target) {
                System.out.println(tfUsername.getDefaultModel().toString());
            }

        });

        this.tfPassword.add(new AjaxEventBehavior("change") {
            @Override
            protected void onEvent(AjaxRequestTarget target) {
                System.out.println(target.getLastFocusedElementId());
            }

        });
        
        btLogin.add(new AjaxEventBehavior("click") {
            @Override
            protected void onEvent(AjaxRequestTarget target) {
                info("Click procesa el login");
            }
        });
    }
}
