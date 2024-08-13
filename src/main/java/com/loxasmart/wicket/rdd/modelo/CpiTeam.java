/**
 *
 */
package com.loxasmart.wicket.rdd.modelo;

/**
 *
 */
public class CpiTeam implements ICrudTable {

    private Integer equCodigo = null;
    private CpiPeriodoAcademico cpiPeriodoAcademico = null;
    private CpiProyecto cpiProyecto = null;
    private CpiRol cpiRol = null;
    private CpiEstudiante cpiEstudiante = null;

    /**
     *
     */
    public CpiTeam() {
        // TODO Auto-generated constructor stub
    }

    public Integer getEquCodigo() {
        return equCodigo;
    }

    public void setEquCodigo(Integer equCodigo) {
        this.equCodigo = equCodigo;
    }

    public CpiPeriodoAcademico getCpiPeriodoAcademico() {
        return cpiPeriodoAcademico;
    }

    public void setCpiPeriodoAcademico(CpiPeriodoAcademico cpiPeriodoAcademico) {
        this.cpiPeriodoAcademico = cpiPeriodoAcademico;
    }

    public CpiProyecto getCpiProyecto() {
        return cpiProyecto;
    }

    public void setCpiProyecto(CpiProyecto cpiProyecto) {
        this.cpiProyecto = cpiProyecto;
    }

    public CpiRol getCpiRol() {
        return cpiRol;
    }

    public void setCpiRol(CpiRol cpiRol) {
        this.cpiRol = cpiRol;
    }

    public CpiEstudiante getCpiEstudiante() {
        return cpiEstudiante;
    }

    public void setCpiEstudiante(CpiEstudiante cpiEstudiante) {
        this.cpiEstudiante = cpiEstudiante;
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
