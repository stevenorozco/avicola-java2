/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Steven
 */
public class Cargo {
    private int id; 
    private String nombre; 
    private Area area; 
    private HashSet<Empleado> empleados; 

    public Cargo(int id, String nombre, Area area) {
        this.id = id;
        this.nombre = nombre;
        this.area = area;
        this.empleados = new HashSet();
        this.area.adicionarCargo(this);
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

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
        this.area.adicionarCargo(this);
    }

    public HashSet getEmpleados() {
        return empleados;
    }

    public void setEmpleados(HashSet empleados) {
        this.empleados = empleados;
    }
    
    public boolean adicionarEmpleado(Empleado empleado){
        return this.empleados.add(empleado);
    }
     
    public boolean eliminarEmpleadoPorId(int id){
        boolean eliminado=false;
        Iterator i = this.empleados.iterator();
        while(i.hasNext()){
            Empleado empleado = (Empleado)i.next();
            if(empleado.getId() == id){
                eliminado = this.empleados.remove(empleado);
                empleado.setCargo(null);
            }
        }
        return eliminado;
    }
    
    
    public String toString(){
        return this.nombre; 
    }
    
}
