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
    private String institucion; 
    private int fecha; 
    private int intensidad_horaria; 
    private Veterinario veterinario; 

    public Curso(int id, String nombre, String titulo, String institucion, int fecha, int intensidad_horaria, Veterinario veterinario) {
        this.id = id;
        this.nombre = nombre;
        this.titulo = titulo;
        this.institucion = institucion;
        this.fecha = fecha;
        this.intensidad_horaria = intensidad_horaria;
        this.veterinario = veterinario;
        this.veterinario.adicionarCurso(this);
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String intitucion) {
        this.institucion = intitucion;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getIntensidad_horaria() {
        return intensidad_horaria;
    }

    public void setIntensidad_horaria(int intensidad_horaria) {
        this.intensidad_horaria = intensidad_horaria;
    }

    public Empleado getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
        this.veterinario.adicionarCurso(this);
    }
    
    
    
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
    
    public String toString(){
        return this.nombre; 
    }
    
}

