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
    private  HashSet area; 
    private HashSet jefe; 

    public Granja(int id, int capacidad_max_gallinas, HashSet area, HashSet jefe) {
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

    public HashSet getArea() {
        return area;
    }

    public void setArea(HashSet area) {
        this.area = area;
    }

    public HashSet getJefe() {
        return jefe;
    }

    public void setJefe(HashSet jefe) {
        this.jefe = jefe;
    }
    

    
}
