/**
 *
 */
package com.loxasmart.wicket.rdd.modelo.system;

import java.sql.Date;

import com.loxasmart.wicket.rdd.modelo.ICrudTable;
import com.loxasmart.wicket.rdd.modelo.IDataBase;

/**
 *
 */
public class SysAcceso extends SysUsuario implements IDataBase, ICrudTable {

    private Integer accCodigo = null;
    private Date fechaDeIngreso = null;
    private Date fechaDeSalida = null;

    /**
     *
     */
    public SysAcceso() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the accCodigo
     */
    public Integer getAccCodigo() {
        return accCodigo;
    }

    /**
     * @param accCodigo the accCodigo to set
     */
    public void setAccCodigo(Integer accCodigo) {
        this.accCodigo = accCodigo;
    }

    /**
     * @return the fechaDeIngreso
     */
    public Date getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    /**
     * @param fechaDeIngreso the fechaDeIngreso to set
     */
    public void setFechaDeIngreso(Date fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    /**
     * @return the fechaDeSalida
     */
    public Date getFechaDeSalida() {
        return fechaDeSalida;
    }

    /**
     * @param fechaDeSalida the fechaDeSalida to set
     */
    public void setFechaDeSalida(Date fechaDeSalida) {
        this.fechaDeSalida = fechaDeSalida;
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
