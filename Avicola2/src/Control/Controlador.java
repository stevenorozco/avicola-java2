/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Modelo.*;
import java.util.HashSet;
/**
 *
 * @author Steven
 */
public class Controlador {
    Empresa empresa; 
    Area area; 
    Empleado empleado; 
    Cargo cargo; 
    Veterinario veterinario; 
    Curso curso; 
    Granja granja; 
    Galpon galpon;
    EventoGalpon eventoGalpon; 
    Lote lote; 
    Gallina gallina; 
    Vacuna vacuna; 
    Tratamiento tratamiento; 

public Controlador(){
    empresa = new Empresa( 1, "avicola");
    
}  

public boolean adicionarArea(int id, String tipo, String nombre, boolean beneficio_cooperativa, Empresa empresa){
    Area area = new Area(id, tipo, nombre, beneficio_cooperativa, empresa);
    return empresa.adicionarArea(area); 
}

public Empresa getEmpresa(){
    return this.empresa; 
}

public boolean adicionarCargo(int id, String nombre, Area area){
    Cargo cargo = new Cargo(id, nombre, area);
    return area.adicionarCargo(cargo);
}

public boolean adicionarEmpleado(int id, int cedula, String nombre, int tel, Cargo cargo, String nivel_profesional, int salario){
    Empleado empleado = new Empleado(id, cedula, nombre, tel, cargo, nivel_profesional, salario);
    return cargo.adicionarEmpleado(empleado);
}

public boolean adicionarVeterinario(String tipo, int experiencia, int id, int cedula, String nombre, int tel, Cargo cargo, String nivel_profesional, int salario){
    Veterinario vetetinario = new Veterinario(tipo, experiencia, id, cedula, nombre, tel, cargo, nivel_profesional, salario);
    return cargo.adicionarEmpleado(veterinario);
}

public boolean adicionarCurso(int id, String nombre, String titulo, String institucion, int fecha, int intensidad_horaria, Veterinario veterinario){
    Curso curso = new Curso(id, nombre, titulo, institucion, fecha, intensidad_horaria, veterinario);
    return veterinario.adicionarCurso(curso);
}
   
    
    
}
