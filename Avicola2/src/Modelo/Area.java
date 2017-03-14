/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author Steven
 */
public class Area {
    private int id; 
    private String tipo; 
    private String nombre; 
    private boolean beneficio_cooperativa; 
    private Empresa empresa; 
    private HashSet cargos;
    private HashSet granjas;
    
    Map<String,String> TIPOS_AREAS = new HashMap<String, String>(){{
        put("administrativo", "Administrativo");
        put("produccion", "Produccion");
    }};

    public Area(int id, String tipo, String nombre, boolean beneficio_cooperativa, Empresa empresa) {
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
        this.beneficio_cooperativa = beneficio_cooperativa;
        this.empresa = empresa; 
        this.cargos = new HashSet();
        this.granjas = new HashSet();
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

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
        this.empresa.adicionarArea(this);
    }

    public HashSet getCargos() {
        return cargos;
    }

    public void setCargos(HashSet cargos) {
        this.cargos = cargos;
    }

    public HashSet getGranjas() {
        return granjas;
    }

    public void setGranjas(HashSet granjas) {
        this.granjas = granjas;
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
    
    public boolean adicionarCargo(Cargo cargo){
        return this.cargos.add(cargo);
    }
    
    public boolean adicionarGranja(Granja granja){
        return this.granjas.add(granja);
    }
    
    public String toString(){
        return this.nombre; 
    }
}
