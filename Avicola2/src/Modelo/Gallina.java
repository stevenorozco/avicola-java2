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
    private HashSet galpon; 
    private HashSet lote; 

    public Gallina(int id, int codigo, String raza, int fecha_nacimiento, String proceso, HashSet galpon, HashSet lote) {
        this.id = id;
        this.codigo = codigo;
        this.raza = raza;
        this.fecha_nacimiento = fecha_nacimiento;
        this.proceso = proceso;
        this.galpon = galpon;
        this.lote = lote;
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

    public HashSet getGalpon() {
        return galpon;
    }

    public void setGalpon(HashSet galpon) {
        this.galpon = galpon;
    }

    public HashSet getLote() {
        return lote;
    }

    public void setLote(HashSet lote) {
        this.lote = lote;
    }
    
    
    
}
