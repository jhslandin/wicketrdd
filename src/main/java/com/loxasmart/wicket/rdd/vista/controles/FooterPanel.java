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
package com.loxasmart.wicket.rdd.vista.controles;

import org.apache.wicket.ajax.AjaxEventBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;

import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.panel.Panel;

/**
 *
 * @author jhsla
 */
public class FooterPanel extends Panel implements IA00Page {
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
    
    public FooterPanel(String id) {
        super(id);
        this.makeComponents();
        this.addComponents();
        this.setHandlers();
    }
    
    private void makeComponents() {
        btDragDrop = new Button(ID_DRAGDROP);
        btVideoComentado = new Button(ID_VIDEOCOMENTADO);
        btRecursoWeb = new Button(ID_RECURSOWEB);
        btRecursoNumero = new Button(ID_RECURSONUMERO);
        btRecursoPaneles = new Button(ID_RECURSOPANELES);
        btPruebaSumativa = new Button(ID_PRUEBASUMATIVA);
        btPalabra = new Button(ID_PALABRA);
        btRecursoSonido = new Button(ID_RECURSOSONIDO);
        btPilasEngine = new Button(ID_PILASENGINE);
        btFichaPedagogica = new Button(ID_FICHAPEDAGOGICA);
        btProyecto = new Button(ID_PROYECTO);
        btPlan = new Button(ID_PLAN);
        btSound = new Button(ID_SOUND);
        bt2D = new Button(ID_2D);
        cbIdioma = new Button(ID_IDIOMA);
    }
    
    private void addComponents() {
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
    
    public Button getBtDragDrop() {
        return btDragDrop;
    }

    public Button getBtVideoComentado() {
        return btVideoComentado;
    }

    public Button getBtRecursoWeb() {
        return btRecursoWeb;
    }

    public Button getBtRecursoNumero() {
        return btRecursoNumero;
    }

    public Button getBtRecursoPaneles() {
        return btRecursoPaneles;
    }

    public Button getBtPruebaSumativa() {
        return btPruebaSumativa;
    }

    public Button getBtPalabra() {
        return btPalabra;
    }

    public Button getBtRecursoSonido() {
        return btRecursoSonido;
    }

    public Button getBtPilasEngine() {
        return btPilasEngine;
    }

    public Button getBtFichaPedagogica() {
        return btFichaPedagogica;
    }

    public Button getBtProyecto() {
        return btProyecto;
    }

    public Button getBtPlan() {
        return btPlan;
    }

    public Button getBtSound() {
        return btSound;
    }

    public Button getBt2D() {
        return bt2D;
    }

    public Button getCbIdioma() {
        return cbIdioma;
    }   
}
