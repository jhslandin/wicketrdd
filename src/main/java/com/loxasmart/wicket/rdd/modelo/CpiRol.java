/**
 *
 */
package com.loxasmart.wicket.rdd.modelo;

/**
 *
 */
public class CpiRol implements ICrudTable {

    private Integer rolCodigo = null;
    private String rolSiglas = null;
    private String rolNombre = null;

    /**
     *
     */
    public CpiRol() {
        // TODO Auto-generated constructor stub
    }

    public Integer getRolCodigo() {
        return rolCodigo;
    }

    public void setRolCodigo(Integer rolCodigo) {
        this.rolCodigo = rolCodigo;
    }

    public String getRolSiglas() {
        return rolSiglas;
    }

    public void setRolSiglas(String rolSiglas) {
        this.rolSiglas = rolSiglas;
    }

    public String getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(String rolNombre) {
        this.rolNombre = rolNombre;
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
