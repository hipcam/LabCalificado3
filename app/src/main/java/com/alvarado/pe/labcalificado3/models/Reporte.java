package com.alvarado.pe.labcalificado3.models;

/**
 * Created by Alumno on 11/05/2018.
 */

public class Reporte {

    private String titulo;
    private String desc;
    private String ubicacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Reporte(String titulo, String desc, String ubicacion) {
        this.titulo = titulo;
        this.desc = desc;
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Reporte{" +
                "titulo='" + titulo + '\'' +
                ", desc='" + desc + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                '}';
    }
}
