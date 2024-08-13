/**
 *
 */
package com.loxasmart.wicket.rdd.modelo;

import java.util.ArrayList;

import com.loxasmart.wicket.rdd.modelo.system.SysIdioma;

/**
 *
 */
public class CpiPruebaHead implements ICrudTable {

    private Integer pruCodigo = null;
    private SysIdioma sysLugar = null;
    private String pruNombre = null;
    private String pruNota = null;
    private String pruClase = null;

    private ArrayList<CpiPruebaItem> cpiPruebaItems = null;

    public CpiPruebaHead() {

    }

    public Integer getPruCodigo() {
        return pruCodigo;
    }

    public void setPruCodigo(Integer pruCodigo) {
        this.pruCodigo = pruCodigo;
    }

    public SysIdioma getSysLugar() {
        return sysLugar;
    }

    public void setSysLugar(SysIdioma sysLugar) {
        this.sysLugar = sysLugar;
    }

    public String getPruNombre() {
        return pruNombre;
    }

    public void setPruNombre(String pruNombre) {
        this.pruNombre = pruNombre;
    }

    public String getPruNota() {
        return pruNota;
    }

    public void setPruNota(String pruNota) {
        this.pruNota = pruNota;
    }

    public String getPruClase() {
        return pruClase;
    }

    public void setPruClase(String pruClase) {
        this.pruClase = pruClase;
    }

    public ArrayList<CpiPruebaItem> getCpiPruebaItems() {
        // Candidato a lanzar un error
        if (this.getPruCodigo() != null) {
            if (this.cpiPruebaItems == null) {
                this.setCpiPruebaItems(CpiPruebaItem.readByConsigna(this));
            }
        }
        return cpiPruebaItems;
    }

    public void setCpiPruebaItems(ArrayList<CpiPruebaItem> cpiPruebaItems) {
        this.cpiPruebaItems = cpiPruebaItems;
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
