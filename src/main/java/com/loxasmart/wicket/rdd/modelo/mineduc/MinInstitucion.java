/**
 *
 */
package com.loxasmart.wicket.rdd.modelo.mineduc;

import com.loxasmart.wicket.rdd.modelo.ICrudTable;

/**
 *
 */
public class MinInstitucion implements ICrudTable {

    private Integer insCodigo = null;
    private String insDenominacion = null;
    private String insCodigoInstitucionEducativa = null;
    private String insHomePage = null;

    /**
     *
     */
    public MinInstitucion() {
        // TODO Auto-generated constructor stub
    }

    public Integer getInsCodigo() {
        return insCodigo;
    }

    public void setInsCodigo(Integer insCodigo) {
        this.insCodigo = insCodigo;
    }

    public String getInsDenominacion() {
        return insDenominacion;
    }

    public void setInsDenominacion(String insDenominacion) {
        this.insDenominacion = insDenominacion;
    }

    public String getInsCodigoInstitucionEsucativa() {
        return insCodigoInstitucionEducativa;
    }

    public void setInsCodigoInstitucionEsucativa(String insCodigoInstitucionEsucativa) {
        this.insCodigoInstitucionEducativa = insCodigoInstitucionEsucativa;
    }

    public String getInsHomePage() {
        return insHomePage;
    }

    public void setInsHomePage(String insHomePage) {
        this.insHomePage = insHomePage;
    }

    @Override
    public void read() {
        // TODO Auto-generated method stub

    }

    @Override
    public void update() {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete() {
        // TODO Auto-generated method stub

    }

    @Override
    public void insert() {
        // TODO Auto-generated method stub

    }

}
