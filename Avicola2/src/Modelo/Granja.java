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
public class Granja {
    private int id; 
    private int capacidad_max_gallinas;
    private  Area area; 
    private Empleado jefe; 

    public Granja(int id, int capacidad_max_gallinas, Area area, Empleado jefe) {
        this.id = id;
        this.capacidad_max_gallinas = capacidad_max_gallinas;
        this.area = area;
        this.jefe = jefe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidad_max_gallinas() {
        return capacidad_max_gallinas;
    }

    public void setCapacidad_max_gallinas(int capacidad_max_gallinas) {
        this.capacidad_max_gallinas = capacidad_max_gallinas;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Empleado getJefe() {
        return jefe;
    }

    public void setJefe(Empleado jefe) {
        this.jefe = jefe;
    }
    
         @Override
    public int hashCode() {
        return id; 
    }

    
    // el método equals es utilizado por los Set para determinar cuando un objeto es igual a otro. 
    @Override
    public boolean equals(Object obj) {
        Granja granja=(Granja)obj;      
        if(granja.id==this.id){
            // son iguales
            return true;
        }
        else{
            return false; 
        }
    }
    
}
