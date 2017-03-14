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
public class Gallina {
    private int id;
    private int codigo; 
    private String raza;
    private int fecha_nacimiento; 
    private String proceso; 
    private Galpon galpon; 
    private Lote lote; 
    private HashSet tratamientos; 
    private HashSet vacunas; 
    
    Map<String,String> RAZAS = new HashMap<String, String>(){{
        put("black_rock", "Black Rock");
        put("speckledy", "Speckledy");
    }};

    public Gallina(int id, int codigo, String raza, int fecha_nacimiento, String proceso, Lote lote) {
        this.id = id;
        this.codigo = codigo;
        this.raza = raza;
        this.fecha_nacimiento = fecha_nacimiento;
        this.proceso = proceso;
        this.lote = lote;
        
        this.tratamientos = new HashSet();
        this.vacunas = new HashSet();
        
        this.lote.adicionarGallina(this);
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(int fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getProceso() {
        return proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }

    public Galpon getGalpon() {
        return this.galpon;
    }

    public void setGalpon(Galpon galpon) {
        this.galpon = galpon;
        this.galpon.adicionarGallina(this);
    }

    public Lote getLote() {
        return this.lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
        this.lote.adicionarGallina(this);
    }

    public HashSet getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(HashSet tratamientos) {
        this.tratamientos = tratamientos;
    }

    public HashSet getVacunas() {
        return vacunas;
    }

    public void setVacunas(HashSet vacunas) {
        this.vacunas = vacunas;
    }
    
    public boolean adicionarVacuna(Vacuna vacuna){
        return this.vacunas.add(vacuna);
    }
    
    public boolean adicionarTratamiento(Tratamiento tratamiento){
        return this.tratamientos.add(tratamiento);
    }
    
             @Override
    public int hashCode() {
        return id; 
    }

    
    // el método equals es utilizado por los Set para determinar cuando un objeto es igual a otro. 
    @Override
    public boolean equals(Object obj) {
        Gallina gallina=(Gallina)obj;      
        if(gallina.id==this.id){
            // son iguales
            return true;
        }
        else{
            return false; 
        }
    }
    
    public String toString(){
        return Integer.toString(this.codigo); 
    }
}
