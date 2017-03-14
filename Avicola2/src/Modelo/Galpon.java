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
public class Galpon {
    private int id; 
    private int codigo; 
    private String tipo_zona;
    private int capacidad_max_gallinas;
    private HashSet granja; 
    private HashSet responsable; 

    public Galpon(int id, int codigo, String tipo_zona, int capacidad_max_gallinas, HashSet granja, HashSet responsable) {
        this.id = id;
        this.codigo = codigo;
        this.tipo_zona = tipo_zona;
        this.capacidad_max_gallinas = capacidad_max_gallinas;
        this.granja = granja;
        this.responsable = responsable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo_zona() {
        return tipo_zona;
    }

    public void setTipo_zona(String tipo_zona) {
        this.tipo_zona = tipo_zona;
    }

    public int getCapacidad_max_gallinas() {
        return capacidad_max_gallinas;
    }

    public void setCapacidad_max_gallinas(int capacidad_max_gallinas) {
        this.capacidad_max_gallinas = capacidad_max_gallinas;
    }

    public HashSet getGranja() {
        return granja;
    }

    public void setGranja(HashSet granja) {
        this.granja = granja;
    }

    public HashSet getResponsable() {
        return responsable;
    }

    public void setResponsable(HashSet responsable) {
        this.responsable = responsable;
    }
    
    
    
}
