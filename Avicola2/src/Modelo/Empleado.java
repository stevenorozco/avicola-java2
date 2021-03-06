/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Steven
 */
public class Empleado {
    
   private int id; 
   protected int cedula; 
   protected String nombre; 
   private int tel; 
   private Cargo cargo; 
   private String nivel_profesional; 
   private int salario;
   
   public static Map<String,String> NIVELES_PROFESIONALES = new HashMap<String, String>(){{
        put("tecnico", "Tecnico");
        put("tecnologo", "Tecnologo");
        put("profesional", "Profesional");
        put("maestria", "Maestria");
        put("doctorado", "Doctorado");
    }};


    public Empleado(int id, int cedula, String nombre, int tel, Cargo cargo, String nivel_profesional, int salario) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.tel = tel;
        this.cargo = cargo;
        this.nivel_profesional = nivel_profesional;
        this.salario = salario;
        this.cargo.adicionarEmpleado(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
        this.cargo.adicionarEmpleado(this);
    }


    public String getNivel_profesional() {
        return nivel_profesional;
    }

    public void setNivel_profesional(String nivel_profesional) {
        this.nivel_profesional = nivel_profesional;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
   
            @Override
    public int hashCode() {
        return id; 
    }

    
    
    // el método equals es utilizado por los Set para determinar cuando un objeto es igual a otro. 
    @Override
    public boolean equals(Object obj) {
        Empleado empleado=(Empleado)obj;      
        if(empleado.id==this.id){
            // son iguales
            return true;
        }
        else{
            return false; 
        }
    }
    
    public String toString(){
        return this.nombre + this.cedula; 
    }
    
    
     public String getInfoEmpleado(){
        String info_empleado;
        
        info_empleado = "Id: "+ this.getId() +
                    "\n" + "Cedula: " + this.getCedula() +
                    "\n" + "Nombre: " + this.getNombre() +
                    "\n" + "Telefono: " + this.getTel() +
                    "\n" + "Cargo: " + this.getCargo() +
                    "\n" + "Nivel Profesional: " + this.getNivel_profesional() +
                    "\n" + "Salario: " + this.getSalario();
        
        return info_empleado;       
    }
    
}
