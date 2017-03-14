/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Steven
 */
public class Empleado {
    
   private int id; 
   private int cedula; 
   private String nombre; 
   private int tel; 
   private String cargo; 
   private String nivel_profesional; 
   private int salario;

    public Empleado(int id, int cedula, String nombre, int tel, String cargo, String nivel_profesional, int salario) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.tel = tel;
        this.cargo = cargo;
        this.nivel_profesional = nivel_profesional;
        this.salario = salario;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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
    
}
