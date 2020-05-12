package com.itcero.itcero.modelo;

import javax.persistence.*;

@Entity
@Table(name = "postulante")
public class Postulante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String rut;
    private String f_nacimiento;
    private int idCarrera;

    public Postulante(){

    }

    public Postulante(int id, String nombre, String rut, String f_nacimiento, int idCarrera) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.rut = rut;
        this.f_nacimiento = f_nacimiento;
        this.idCarrera = idCarrera;
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

    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }
}
