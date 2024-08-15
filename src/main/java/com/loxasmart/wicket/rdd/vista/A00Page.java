package com.loxasmart.wicket.rdd.vista;

import com.loxasmart.wicket.rdd.vista.controles.FooterPanel;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import org.apache.wicket.markup.html.WebPage;

public class A00Page extends WebPage {

    private static final long serialVersionUID = 1L;

    private final FooterPanel footerBar;

    public A00Page(final PageParameters parameters) {
        super(parameters);

        footerBar = new FooterPanel("footerBar");
        add(footerBar);
        
        this.setHandlers();
    }

    private void setHandlers() {
        System.out.println("Wicket");
    }
}
