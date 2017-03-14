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
public class Tratamiento {
    private int id;
    private String descripcion; 
    private int fecha; 
    private HashSet gallina; 

    public Tratamiento(int id, String descripcion, int fecha, HashSet gallina) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.gallina = gallina;
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

    public HashSet getGallina() {
        return gallina;
    }

    public void setGallina(HashSet gallina) {
        this.gallina = gallina;
    }
    
    
}
