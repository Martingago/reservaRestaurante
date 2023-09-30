package com.utils;

import java.util.Date;

public class FormData {
    private String nombre;
    private Date fecha;
    private Date hora;
    
    public  FormData(String nombre, Date fecha, Date hora){
    this.nombre = nombre;
    this.fecha = fecha;
    this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }
    
    
    
}
