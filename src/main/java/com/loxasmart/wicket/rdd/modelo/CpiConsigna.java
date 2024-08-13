/**
 *
 */
package com.loxasmart.wicket.rdd.modelo;

import java.util.ArrayList;

import com.loxasmart.wicket.rdd.modelo.system.SysIdioma;

/**
 *
 */
public class CpiConsigna implements ICrudTable {

    private Integer conCodigo = null;
    private String conUuid = null;
    private SysIdioma sysLugar = null;
    private String conContenido = null;

    private ArrayList<CpiAlternativa> alternativas = null;

    public CpiConsigna() {

    }

    /**
     * @return the conCodigo
     */
    public Integer getConCodigo() {
        return conCodigo;
    }

    /**
     * @param conCodigo the conCodigo to set
     */
    public void setConCodigo(Integer conCodigo) {
        this.conCodigo = conCodigo;
    }

    public String getConUuid() {
        return conUuid;
    }

    public void setConUuid(String conUuid) {
        this.conUuid = conUuid;
    }

    public SysIdioma getSysLugar() {
        return sysLugar;
    }

    public void setSysLugar(SysIdioma sysLugar) {
        this.sysLugar = sysLugar;
    }

    public ArrayList<CpiAlternativa> getAlternativas() {
        // Candidato a lanzar un error
        if (this.getConCodigo() != null) {
            if (this.alternativas == null) {
                this.setAlternativas(CpiAlternativa.readByConsigna(this));
            }
        }
        return alternativas;
    }

    public void setAlternativas(ArrayList<CpiAlternativa> alternativas) {
        this.alternativas = alternativas;
    }

    public String getConContenido() {
        return conContenido;
    }

    public void setConContenido(String conContenido) {
        this.conContenido = conContenido;
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
