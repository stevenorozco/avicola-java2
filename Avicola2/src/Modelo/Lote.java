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
public class Lote {
    private int id; 
    private int codigo; 
    private int cantidad_gallinas; 
    private int fecha_nacimiento_gallinas; 

    public Lote(int id, int codigo, int cantidad_gallinas, int fecha_nacimiento_gallinas) {
        this.id = id;
        this.codigo = codigo;
        this.cantidad_gallinas = cantidad_gallinas;
        this.fecha_nacimiento_gallinas = fecha_nacimiento_gallinas;
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

    public int getCantidad_gallinas() {
        return cantidad_gallinas;
    }

    public void setCantidad_gallinas(int cantidad_gallinas) {
        this.cantidad_gallinas = cantidad_gallinas;
    }

    public int getFecha_nacimiento_gallinas() {
        return fecha_nacimiento_gallinas;
    }

    public void setFecha_nacimiento_gallinas(int fecha_nacimiento_gallinas) {
        this.fecha_nacimiento_gallinas = fecha_nacimiento_gallinas;
    }
    
    
    
    
    
}
