/**
 *
 */
package com.loxasmart.wicket.rdd.modelo.system;

import com.loxasmart.wicket.rdd.modelo.ICrudTable;
import com.loxasmart.wicket.rdd.modelo.IDataBase;

/**
 *
 */
public class SysRoles implements IDataBase, ICrudTable {

    private Integer rolCodigo = null;
    private String rolSiglas = null;
    private String rolNombre = null;

    /**
     *
     */
    public SysRoles() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the rolCodigo
     */
    public Integer getRolCodigo() {
        return rolCodigo;
    }

    /**
     * @param rolCodigo the rolCodigo to set
     */
    public void setRolCodigo(Integer rolCodigo) {
        this.rolCodigo = rolCodigo;
    }

    /**
     * @return the rolSiglas
     */
    public String getRolSiglas() {
        return rolSiglas;
    }

    /**
     * @param rolSiglas the rolSiglas to set
     */
    public void setRolSiglas(String rolSiglas) {
        this.rolSiglas = rolSiglas;
    }

    /**
     * @return the rolNombre
     */
    public String getRolNombre() {
        return rolNombre;
    }

    /**
     * @param rolNombre the rolNombre to set
     */
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
