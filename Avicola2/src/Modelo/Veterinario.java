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
public class Veterinario extends Empleado {
    
    String tipo; 
    int experiencia; 
    private HashSet<Curso> cursos; 
    
    Map<String,String> TIPOS_VETERINARIOS = new HashMap<String, String>(){{
        put("experto", "Experto");
        put("auxiliar", "Auxiliar");
    }};

    public Veterinario(String tipo, int experiencia, int id, int cedula, String nombre, int tel, Cargo cargo, String nivel_profesional, int salario) {
        super(id, cedula, nombre, tel, cargo, nivel_profesional, salario);
        this.tipo = tipo;
        this.experiencia = experiencia;
        this.cursos = new HashSet();
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

    public HashSet getCursos() {
        return cursos;
    }
    
    public boolean adicionarCurso(Curso curso){
        return this.cursos.add(curso);
    }

    public void setCursos(HashSet cursos) {
        this.cursos = cursos;
    }
    
    public String toString(){
        return this.nombre + this.cedula; 
    }
    
    
}