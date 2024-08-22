package com.loxasmart.wicket.rdd.vista;

import com.loxasmart.wicket.rdd.vista.controles.login.LoginPanel;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import org.apache.wicket.markup.html.WebPage;

public class A01Page extends WebPage implements IA01Page {

    private static final long serialVersionUID = 1L;

    private LoginPanel loginPanel;

    public A01Page(final PageParameters parameters) {
        super(parameters);
        
        this.makeComponents();
        this.addComponents();
        this.setHandlers();
    }

    private void makeComponents() {
        this.loginPanel = new LoginPanel(ID_LOGIN);
    }
    
    private void addComponents() {
        add(loginPanel);
    }
    
    private void setHandlers() {
        System.out.println("Wicket");
    }
}
