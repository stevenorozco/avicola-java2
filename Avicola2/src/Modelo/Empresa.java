/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.HashSet;

/**
 *
 * @author Steven
 */
public class Empresa {
    private int id; 
    private String nombre; 
    private HashSet areas; 

    public Empresa(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.areas = new HashSet();
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

    public HashSet getAreas() {
        return areas;
    }

    public void setAreas(HashSet areas) {
        this.areas = areas;
    }

    
            @Override
    public int hashCode() {
        return id; 
    }

    
    // el método equals es utilizado por los Set para determinar cuando un objeto es igual a otro. 
    @Override
    public boolean equals(Object obj) {
        Empresa empresa=(Empresa)obj;      
        if(empresa.id==this.id){
            // son iguales
            return true;
        }
        else{
            return false; 
        }
    }
    
    public boolean adicionarArea(Area area){
        return this.areas.add(area);
    }
    
}
