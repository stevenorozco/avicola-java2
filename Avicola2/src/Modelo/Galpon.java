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
public class Galpon {
    private int id; 
    private int codigo; 
    private String tipo_zona;
    private int capacidad_max_gallinas;
    private Granja granja; 
    private Empleado responsable; 
    private HashSet lotes; 
    private HashSet eventosGalpon; 

    public Galpon(int id, int codigo, String tipo_zona, int capacidad_max_gallinas, Granja granja, Empleado responsable, HashSet lotes, HashSet eventosGalpon) {
        this.id = id;
        this.codigo = codigo;
        this.tipo_zona = tipo_zona;
        this.capacidad_max_gallinas = capacidad_max_gallinas;
        this.granja = granja;
        this.responsable = responsable;
        this.lotes = lotes;
        this.eventosGalpon = eventosGalpon;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo_zona() {
        return tipo_zona;
    }

    public void setTipo_zona(String tipo_zona) {
        this.tipo_zona = tipo_zona;
    }

    public int getCapacidad_max_gallinas() {
        return capacidad_max_gallinas;
    }

    public void setCapacidad_max_gallinas(int capacidad_max_gallinas) {
        this.capacidad_max_gallinas = capacidad_max_gallinas;
    }

    public Granja getGranja() {
        return this.granja;
    }

    public void setGranja(Granja granja) {
        this.granja = granja;
    }

    public Empleado getResponsable() {
        return this.responsable;
    }

    public void setResponsable(Empleado responsable) {
        this.responsable = responsable;
    }
    
    public boolean adicionarLote(Lote lote){
        return this.lotes.add(lote);
    }
    
     public boolean adicionarEventoGalpon(EventoGalpon eventoGalpon){
        return this.eventosGalpon.add(eventoGalpon);
    }
             @Override
    public int hashCode() {
        return id; 
    }

    
    // el método equals es utilizado por los Set para determinar cuando un objeto es igual a otro. 
    @Override
    public boolean equals(Object obj) {
        Galpon galpon=(Galpon)obj;      
        if(galpon.id==this.id){
            // son iguales
            return true;
        }
        else{
            return false; 
        }
    }
    
}
