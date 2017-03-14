/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.util.*;

/**
 *
 * @author Steven
 */
public class EventoGalpon {
    private int id; 
    private String descripcion; 
    private int fecha; 
    private Galpon galpon; 

    public EventoGalpon(int id, String descripcion, int fecha, Galpon galpon) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.galpon = galpon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public Galpon getGalpon() {
        return this.galpon;
    }

    public void setGalpon(Galpon galpon) {
        this.galpon = galpon;
    }
    
    
    
}
