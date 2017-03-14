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
public class Area {
    private int id; 
    private String tipo; 
    private String nombre; 
    private boolean beneficio_cooperativa; 

    public Area(int id, String tipo, String nombre, boolean beneficio_cooperativa) {
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
        this.beneficio_cooperativa = beneficio_cooperativa;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isBeneficio_cooperativa() {
        return beneficio_cooperativa;
    }

    public void setBeneficio_cooperativa(boolean beneficio_cooperativa) {
        this.beneficio_cooperativa = beneficio_cooperativa;
    }
    
             @Override
    public int hashCode() {
        return id; 
    }

    
    // el método equals es utilizado por los Set para determinar cuando un objeto es igual a otro. 
    @Override
    public boolean equals(Object obj) {
        Area area=(Area)obj;      
        if(area.id==this.id){
            // son iguales
            return true;
        }
        else{
            return false; 
        }
    }
    
    
}
