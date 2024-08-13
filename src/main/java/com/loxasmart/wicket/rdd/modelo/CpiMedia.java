/**
 *
 */
package com.loxasmart.wicket.rdd.modelo;

/**
 *
 */
public class CpiMedia implements ICrudTable {

    private String recUUID = null;
    private String recNombre = null;
    private CpiMediaTipo cpiMediaTipo = null;
    private String recFormato = null;
    private String recDestripcion = null;

    /**
     *
     */
    public CpiMedia() {
        // TODO Auto-generated constructor stub
    }

    public String getRecUUID() {
        return recUUID;
    }

    public void setRecUUID(String recUUID) {
        this.recUUID = recUUID;
    }

    public String getRecNombre() {
        return recNombre;
    }

    public void setRecNombre(String recNombre) {
        this.recNombre = recNombre;
    }

    public CpiMediaTipo getCpiMediaTipo() {
        return cpiMediaTipo;
    }

    public void setCpiMediaTipo(CpiMediaTipo cpiMediaTipo) {
        this.cpiMediaTipo = cpiMediaTipo;
    }

    public String getRecFormato() {
        return recFormato;
    }

    public void setRecFormato(String recFormato) {
        this.recFormato = recFormato;
    }

    public String getRecDestripcion() {
        return recDestripcion;
    }

    public void setRecDestripcion(String recDestripcion) {
        this.recDestripcion = recDestripcion;
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
