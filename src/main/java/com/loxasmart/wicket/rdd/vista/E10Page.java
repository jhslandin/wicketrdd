package com.loxasmart.wicket.rdd.vista;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.form.Button;

import org.apache.wicket.markup.html.WebPage;

public class E10Page extends WebPage implements IE10Page {

    private static final long serialVersionUID = 1L;

    private Button btDragDrop;
    private Button btVideoComentado;
    private Button btRecursoWeb;
    private Button btRecursoNumero;
    private Button btRecursoPaneles;
    private Button btPruebaSumativa;
    private Button btPalabra;
    private Button btRecursoSonido;
    private Button btPilasEngine;
    private Button btFichaPedagogica;
    private Button btProyecto;
    private Button btPlan;
    private Button btSound;
    private Button bt2D;
    private Button cbIdioma;

    public E10Page(final PageParameters parameters) {
        super(parameters);

        add(btDragDrop);
        add(btVideoComentado);
        add(btRecursoWeb);
        add(btRecursoNumero);
        add(btRecursoPaneles);
        add(btPruebaSumativa);
        add(btPalabra);
        add(btRecursoSonido);
        add(btPilasEngine);
        add(btFichaPedagogica);
        add(btProyecto);
        add(btPlan);
        add(btSound);
        add(bt2D);
        add(cbIdioma);

        this.setHandlers();
    }

    private void setHandlers() {
        System.out.println("Wicket");
    }
}
