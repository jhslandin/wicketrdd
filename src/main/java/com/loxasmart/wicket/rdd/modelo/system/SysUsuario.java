package com.loxasmart.wicket.rdd.modelo.system;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.loxasmart.wicket.rdd.modelo.DataBase;

public class SysUsuario extends Persona {

    private SysRoles sysRol;
    private String usrClave;
    private Date fechaDeAlta;
    private Date fechaDeBaja;
    private SysEstado sysEstado;

    public SysUsuario() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the sysRol
     */
    public SysRoles getSysRol() {
        if (sysRol == null) {
            this.setSysRol(new SysRoles());
        }
        return sysRol;
    }

    /**
     * @param sysRol the sysRol to set
     */
    public void setSysRol(SysRoles sysRol) {
        this.sysRol = sysRol;
    }

    /**
     * @return the fechaDeBaja
     */
    public Date getFechaDeBaja() {
        return fechaDeBaja;
    }

    /**
     * @param fechaDeBaja the fechaDeBaja to set
     */
    public void setFechaDeBaja(Date fechaDeBaja) {
        this.fechaDeBaja = fechaDeBaja;
    }

    /**
     * @return the fechaDeAlta
     */
    public Date getFechaDeAlta() {
        return fechaDeAlta;
    }

    /**
     * @param fechaDeAlta the fechaDeAlta to set
     */
    public void setFechaDeAlta(Date fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }

    public SysEstado getSysEstado() {
        if (sysEstado == null) {
            this.setSysEstado(new SysEstado());
        }
        return sysEstado;
    }

    public void setSysEstado(SysEstado sysEstado) {
        this.sysEstado = sysEstado;
    }

    /**
     * @return the usrClave
     */
    public String getUsrClave() {
        return usrClave;
    }

    /**
     * @param usrClave the usrClave to set
     */
    public void setUsrClave(String usrClave) {
        this.usrClave = usrClave;
    }

    public boolean findByCedula() {
        String query;
        boolean result = false;

        try {
            query = String.format(QUERY_SYSUSUARIOS_BY_CEDULA, this.getCedula());
            Statement stmt = DataBase.conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                result = true;

                this.setNombres(rs.getString("nombres"));
                this.setApellidos(rs.getString("apellidos"));
                this.setGenero(rs.getString("genero"));
                this.setCorreoInstitucional(rs.getString("correo_institucional"));
                this.setCorreoPersonal(rs.getString("correo_personal"));
                this.setCelular(rs.getString("celular"));
                this.setEstadoCivil(rs.getString("estado_civil"));
                this.setEtnia(rs.getString("etnia"));
                this.setFechaNacimiento(rs.getString("fecha_nacimiento"));
                this.setNacionalidad(rs.getString("nacionalidad"));
                this.setProvinciaActual(rs.getString("provincia_actual"));
                this.setCantonActual(rs.getString("canton_actual"));
                this.setPorroquiaActual(rs.getString("parroquia_actual"));
                this.setDireccionActual(rs.getString("direccion_actual"));

                this.getSysRol().setRolCodigo(rs.getInt("rol_codigo"));
                this.getSysRol().read();

                this.setUsrClave(rs.getString("usr_clave"));

                this.setFechaDeAlta(Date.valueOf(rs.getString("fecha_de_alta")));
                this.setFechaDeBaja(Date.valueOf(rs.getString("fecha_de_baja")));

                this.getSysEstado().setStaCodigo(rs.getInt("sta_codigo"));
                this.getSysEstado().read();
            }
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
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
