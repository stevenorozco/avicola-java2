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
    private Gallina gallina; 

    public Tratamiento(int id, String descripcion, int fecha, Gallina gallina) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.gallina = gallina;
        
        this.gallina.adicionarTratamiento(this);
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

    public Gallina getGallina() {
        return this.gallina;
    }

    public void setGallina(Gallina gallina) {
        this.gallina = gallina;
        this.gallina.adicionarTratamiento(this);
    }
    
             @Override
    public int hashCode() {
        return id; 
    }

    
    // el método equals es utilizado por los Set para determinar cuando un objeto es igual a otro. 
    @Override
    public boolean equals(Object obj) {
        Tratamiento tratamiento=(Tratamiento)obj;      
        if(tratamiento.id==this.id){
            // son iguales
            return true;
        }
        else{
            return false; 
        }
    }
    
    public String toString(){
        return this.descripcion; 
    }
    
}
