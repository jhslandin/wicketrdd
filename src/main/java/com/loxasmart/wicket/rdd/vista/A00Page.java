package com.loxasmart.wicket.rdd.vista;

import org.apache.wicket.ajax.AjaxEventBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.form.Button;

import org.apache.wicket.markup.html.WebPage;

public class A00Page extends WebPage implements IE10Page {

    private static final long serialVersionUID = 1L;

    private final Button btDragDrop;
    private final Button btVideoComentado;
    private final Button btRecursoWeb;
    private final Button btRecursoNumero;
    private final Button btRecursoPaneles;
    private final Button btPruebaSumativa;
    private final Button btPalabra;
    private final Button btRecursoSonido;
    private final Button btPilasEngine;
    private final Button btFichaPedagogica;
    private final Button btProyecto;
    private final Button btPlan;
    private final Button btSound;
    private final Button bt2D;
    private final Button cbIdioma;

    public A00Page(final PageParameters parameters) {
        super(parameters);

        btDragDrop = new Button("a");
        btVideoComentado = new Button("a");
        btRecursoWeb = new Button("");
        btRecursoNumero = new Button("a");
        btRecursoPaneles = new Button("a");
        btPruebaSumativa = new Button("a");
        btPalabra = new Button("a");
        btRecursoSonido = new Button("a");
        btPilasEngine = new Button("a");
        btFichaPedagogica = new Button("a");
        btProyecto = new Button("a");
        btPlan = new Button("a");
        btSound = new Button("a");
        bt2D = new Button("a");
        cbIdioma = new Button("a");

        this.setHandlers();
        
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
        btDragDrop.add(new AjaxEventBehavior("click") {
            @Override
            protected void onEvent(AjaxRequestTarget target) {
                info("Click on btDragDrop");
            }
        });

        btVideoComentado.add(new AjaxEventBehavior("click") {
            @Override
            protected void onEvent(AjaxRequestTarget target) {
                info("Click on btVideoComentado");
            }
        });
        
        btRecursoWeb.add(new AjaxEventBehavior("click") {
            @Override
            protected void onEvent(AjaxRequestTarget target) {
                info("Click on btRecursoWeb");
            }
        });
        
        btRecursoNumero.add(new AjaxEventBehavior("click") {
            @Override
            protected void onEvent(AjaxRequestTarget target) {
                info("Click on btRecursoNumero");
            }
        });
        
        btRecursoPaneles.add(new AjaxEventBehavior("click") {
            @Override
            protected void onEvent(AjaxRequestTarget target) {
                info("Click on btRecursoPaneles");
            }
        });
        
        btPruebaSumativa.add(new AjaxEventBehavior("click") {
            @Override
            protected void onEvent(AjaxRequestTarget target) {
                info("Click on btPruebaSumativa");
            }
        });
        
        btPalabra.add(new AjaxEventBehavior("click") {
            @Override
            protected void onEvent(AjaxRequestTarget target) {
                info("Click on btPalabra");
            }
        });
        
        btRecursoSonido.add(new AjaxEventBehavior("click") {
            @Override
            protected void onEvent(AjaxRequestTarget target) {
                info("Click on btRecursoSonido");
            }
        });
        
        btPilasEngine.add(new AjaxEventBehavior("click") {
            @Override
            protected void onEvent(AjaxRequestTarget target) {
                info("Click on btPilasEngine");
            }
        });
        
        btFichaPedagogica.add(new AjaxEventBehavior("click") {
            @Override
            protected void onEvent(AjaxRequestTarget target) {
                info("Click on btFichaPedagogica");
            }
        });
        
        btProyecto.add(new AjaxEventBehavior("click") {
            @Override
            protected void onEvent(AjaxRequestTarget target) {
                info("Click on btProyecto");
            }
        });
        
        btPlan.add(new AjaxEventBehavior("click") {
            @Override
            protected void onEvent(AjaxRequestTarget target) {
                info("Click on btPlan");
            }
        });
        
        btSound.add(new AjaxEventBehavior("click") {
            @Override
            protected void onEvent(AjaxRequestTarget target) {
                info("Click on btSound");
            }
        });
        
        bt2D.add(new AjaxEventBehavior("click") {
            @Override
            protected void onEvent(AjaxRequestTarget target) {
                info("Click on bt2D");
            }
        });
        
        cbIdioma.add(new AjaxEventBehavior("click") {
            @Override
            protected void onEvent(AjaxRequestTarget target) {
                info("Click on cbIdioma");
            }
        });
    }
}
