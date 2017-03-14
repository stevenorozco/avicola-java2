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
public class Curso {
    private int id; 
    private String nombre; 
    private String titulo; 
    private String intitucion; 
    private int fecha; 
    private int intensidad_horaria; 
    private Empleado veterinario; 
    
             @Override
    public int hashCode() {
        return id; 
    }

    
    // el método equals es utilizado por los Set para determinar cuando un objeto es igual a otro. 
    @Override
    public boolean equals(Object obj) {
        Curso curso=(Curso)obj;      
        if(curso.id==this.id){
            // son iguales
            return true;
        }
        else{
            return false; 
        }
    }
    
}

