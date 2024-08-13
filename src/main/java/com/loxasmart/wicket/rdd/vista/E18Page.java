package com.loxasmart.wicket.rdd.vista;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.PropertyModel;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.html.WebPage;

public class E18Page extends WebPage implements IE10Page {

    private static final long serialVersionUID = 1L;

    private Integer numero = 0;
    @SuppressWarnings("unused")
    private Integer resultado = 0;
    private Label labelResultado;
    private FeedbackPanel feedback;

    public E18Page(final PageParameters parameters) {
        super(parameters);

        feedback = new FeedbackPanel(FEEDBACK);
        feedback.setOutputMarkupId(true);
        add(feedback);

        Form<Void> formulario = new Form<Void>(FORMULARIO);
        add(formulario);

        TextField<Integer> tf = new TextField<Integer>(
                NUMERO,
                new PropertyModel<Integer>(this, NUMERO)
        );
        formulario.add(tf);

        AjaxButton calcula = new AjaxButton(CALCULA, formulario) {
            private static final long serialVersionUID = 1L;

            protected void onSubmit(AjaxRequestTarget target) {
                resultado = Integer.valueOf(numero.intValue() * 2);
                target.add(labelResultado);
                target.add(feedback);
            }

            protected void onError(AjaxRequestTarget target) {
                target.add(feedback);
            }
        };
        formulario.add(calcula);

        labelResultado = new Label(
                RESULTADO,
                new PropertyModel<Integer>(this, RESULTADO)
        );
        labelResultado.setOutputMarkupId(true);
        add(labelResultado);
    }
}
