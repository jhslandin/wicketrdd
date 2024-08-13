/**
 *
 */
package com.loxasmart.wicket.rdd.modelo;

/**
 *
 */
public class CpiMediaTipo implements ICrudTable {

    private Integer treCodigo = null;
    private String treNombre = null;

    /**
     *
     */
    public CpiMediaTipo() {
        // TODO Auto-generated constructor stub
    }

    public Integer getTreCodigo() {
        return treCodigo;
    }

    public void setTreCodigo(Integer treCodigo) {
        this.treCodigo = treCodigo;
    }

    public String getTreNombre() {
        return treNombre;
    }

    public void setTreNombre(String treNombre) {
        this.treNombre = treNombre;
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
