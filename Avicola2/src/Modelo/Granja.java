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
    private  Area area; 
    private Empleado jefe;
    private HashSet<Galpon> galpones; 

    public Granja(int id, int capacidad_max_gallinas, Area area, Empleado jefe) {
        this.id = id;
        this.capacidad_max_gallinas = capacidad_max_gallinas;
        this.area = area;
        this.jefe = jefe;
        
        this.galpones = new HashSet();
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

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
        this.area.adicionarGranja(this);
    }

    public Empleado getJefe() {
        return jefe;
    }

    public void setJefe(Empleado jefe) {
        this.jefe = jefe;
    }

    public HashSet<Galpon> getGalpones() {
        return galpones;
    }

    public void setGalpones(HashSet galpones) {
        this.galpones = galpones;
    }

    public boolean adicionarGalpon(Galpon galpon){
        return this.galpones.add(galpon);
    }
    
    public int getCantidadGallinas(){
        int total_gallinas_granja = 0;
        for (Galpon obj : this.galpones) {
            total_gallinas_granja += obj.getCantidadGallinas();
        }
        return total_gallinas_granja;
    }
    
    public int getCantidadGalpones(){
        return this.getGalpones().size();
    }
    
    public int getPorcentajeUtilizacion(){
        return (this.getCantidadGallinas() / this.getCapacidad_max_gallinas()) * 100;
    }
    
    
    public void mostrarResumen(){
        
        for(Galpon galpon : this.getGalpones())
        {
            System.out.println("Galpon" + galpon.getId()+":"+galpon.getCantidadGallinas());
        }
    }
    

    @Override
    public int hashCode() {
        return id; 
    }

    
    // el método equals es utilizado por los Set para determinar cuando un objeto es igual a otro. 
    @Override
    public boolean equals(Object obj) {
        Granja granja=(Granja)obj;      
        if(granja.id==this.id){
            // son iguales
            return true;
        }
        else{
            return false; 
        }
    }
    
    public String toString(){
        return Integer.toString(this.id); 
    }
    
    
    public String getInfoGranja(){
        String info_granja;
        
        info_granja = "Id: "+ this.getId() +
                    "\n" + "Capacidad Maxima Gallinas: " + this.getCapacidad_max_gallinas() +
                    "\n" + "Area: " + this.getArea().toString() +
                    "\n" + "Jefe: " + this.getJefe().toString();
        
        return info_granja;     
}
    
    
}
