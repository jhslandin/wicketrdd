package com.loxasmart.wicket.rdd.vista;

import org.apache.wicket.request.mapper.parameter.PageParameters;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.image.Image;

public class A01Page extends WebPage implements IA01Page {

    private static final long serialVersionUID = 1L;

    private Label lbUsername;
    private TextField tfUsername;
    private Label lbDatos;
    private Label lbPassword;
    private PasswordTextField tfPassword;
    private Button btLogin;
    private Image imgFoto;

    public A01Page(final PageParameters parameters) {
        super(parameters);
        
        this.makeComponents();
        this.addComponents();
        this.setHandlers();
    }

    private void makeComponents() {
        this.lbUsername = new Label(ID_LABEL_USERNAME, "Usuario:");
        this.tfUsername = new TextField(ID_TEXT_USERNAME);
        this.lbDatos = new Label(ID_DATOS, "");
        this.lbPassword = new Label(ID_LABEL_PASSWORD, "Contraseña:");
        this.tfPassword = new PasswordTextField(ID_TEXT_PASSWORD);
        this.btLogin = new Button(ID_LOGIN);
        this.imgFoto = new Image(ID_FOTO, "");
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
    }
}
