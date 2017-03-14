/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Modelo.*;
import java.util.HashSet;
/**
 *
 * @author Steven
 */
public class Controlador {
    Empresa empresa; 
    Area area; 
    Empleado empleado; 
    Cargo cargo; 
    Veterinario veterinario; 
    Curso curso; 
    Granja granja; 
    Galpon galpon;
    EventoGalpon eventoGalpon; 
    Lote lote; 
    Gallina gallina; 
    Vacuna vacuna; 
    Tratamiento tratamiento; 

public Controlador(){
    empresa = new Empresa( 1, "avicola");
    
}   



public boolean adicionarArea(int id, String tipo, String nombre, boolean beneficio_cooperativa, Empresa empresa, HashSet cargos){
    Area area = new Area(id, tipo, nombre, beneficio_cooperativa, empresa, cargos);
    return empresa.adicionarArea(area); 
}

public Empresa getEmpresa(){
    return this.empresa; 
}

    
    
    
}
