package com.itcero.itcero.modelo;

import javax.persistence.*;

@Entity
@Table(name = "carrera")
public class Carrera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreCarrera;
    private int codigo;

    public Carrera (){

    }

    public Carrera(int id, String nombreCarrera, int codigo) {
        super();
        this.id = id;
        this.nombreCarrera = nombreCarrera;
        this.codigo = codigo;
    }

    public int getId() {
        return id;
    }

    public void setId(int idC) {
        this.id = id;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
