/**
 *
 */
package com.loxasmart.wicket.rdd.modelo.mineduc;

import com.loxasmart.wicket.rdd.modelo.ICrudTable;

/**
 *
 */
public class MinParametros implements ICrudTable {

    private Integer parCodigo = null;
    private String parDescripcion = null;
    private Integer estCodigo = null;

    /**
     *
     */
    public MinParametros() {
        // TODO Auto-generated constructor stub
    }

    public Integer getParCodigo() {
        return parCodigo;
    }

    public void setParCodigo(Integer parCodigo) {
        this.parCodigo = parCodigo;
    }

    public String getParDescripcion() {
        return parDescripcion;
    }

    public void setParDescripcion(String parDescripcion) {
        this.parDescripcion = parDescripcion;
    }

    public Integer getEstCodigo() {
        return estCodigo;
    }

    public void setEstCodigo(Integer estCodigo) {
        this.estCodigo = estCodigo;
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
