/**
 *
 */
package com.loxasmart.wicket.rdd.modelo;

/**
 *
 */
public class CpiMediaContent extends CpiMedia implements ICrudTable {

    private byte[] mcoContenido = null;

    /**
     *
     */
    public CpiMediaContent() {
        // TODO Auto-generated constructor stub
    }

    public byte[] getMcoContenido() {
        return mcoContenido;
    }

    public void setMcoContenido(byte[] mcoContenido) {
        this.mcoContenido = mcoContenido;
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
