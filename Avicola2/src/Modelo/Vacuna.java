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
public class Vacuna {
    private int id; 
    private String nombre; 
    private String novedad; 
    private int fecha; 
    private HashSet asistente; 
    private HashSet gallina; 

    public Vacuna(int id, String nombre, String novedad, int fecha, HashSet asistente, HashSet gallina) {
        this.id = id;
        this.nombre = nombre;
        this.novedad = novedad;
        this.fecha = fecha;
        this.asistente = asistente;
        this.gallina = gallina;
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

    public String getNovedad() {
        return novedad;
    }

    public void setNovedad(String novedad) {
        this.novedad = novedad;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public HashSet getAsistente() {
        return asistente;
    }

    public void setAsistente(HashSet asistente) {
        this.asistente = asistente;
    }

    public HashSet getGallina() {
        return gallina;
    }

    public void setGallina(HashSet gallina) {
        this.gallina = gallina;
    }
    
             @Override
    public int hashCode() {
        return id; 
    }

    
    // el método equals es utilizado por los Set para determinar cuando un objeto es igual a otro. 
    @Override
    public boolean equals(Object obj) {
        Vacuna vacuna=(Vacuna)obj;      
        if(vacuna.id==this.id){
            // son iguales
            return true;
        }
        else{
            return false; 
        }
    }
    
}
