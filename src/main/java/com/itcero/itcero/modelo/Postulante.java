package com.itcero.itcero.modelo;

import javax.persistence.*;

@Entity
@Table(name = "postulante")
public class Postulante {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "nombre",length = 20)
    private String nombre;
    @Column(name = "rut",length = 10)
    private String rut;
    @Column
    private String f_nacimiento;
    @Column
    private String nomCarrera;

    public Postulante(){
    }

    public Postulante(int id, String nombre, String rut, String f_nacimiento, int idCarrera) {
        this.id = id;
        this.nombre = nombre;
        this.rut = rut;
        this.f_nacimiento = f_nacimiento;
        this.nomCarrera = nomCarrera;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(String f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }

    public String getnomCarrera() {
        return nomCarrera;
    }

    public void setnomCarrera(String nomCarrera) {
        this.nomCarrera = nomCarrera;
    }
}
