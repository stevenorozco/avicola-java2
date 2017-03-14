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
public class Veterinario {
    
    int id; 
    String tipo; 
    int experiencia; 
    private HashSet empleado; 

    public Veterinario(int id, String tipo, int experiencia, HashSet empleado) {
        this.id = id;
        this.tipo = tipo;
        this.experiencia = experiencia;
        this.empleado = empleado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public HashSet getEmpleado() {
        return empleado;
    }

    public void setEmpleado(HashSet empleado) {
        this.empleado = empleado;
    }
    
    
    
}
