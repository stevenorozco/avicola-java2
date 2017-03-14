/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import Modelo.*;
import java.util.HashSet;

/**
 *
 * @author luissalamanca
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Worldsss!");
        
        Empresa empresa = new Empresa(1, "Avicola");
        
        Area area1 = new Area(1,"Administrativo", "Recursos Humanos",false, empresa);
        
        Cargo cargo1 = new Cargo(1, "Jefe de Recursos H", area1);
        
        Empleado empleado1 = new Empleado(1, 1113650449, "Luis Salamanca", 3123212, cargo1, "Profesional", 3000000);
        Veterinario veterinario1 = new Veterinario("", 10,1, 1113650449, "Luis Salamanca", 3123212, cargo1, "Profesional", 3000000);
        Curso curso1 = new Curso(1, "Manejo de Gallinas", "Manejador de gallinas","Instituto", 1,20,veterinario1);
        
        Granja granja1 = new Granja(1, 30, area1, empleado1);
        Galpon galpon1 = new Galpon(1, 123456, "levante", 20, granja1, empleado1);
        Lote lote1 = new Lote(1, 1234, 30, 32323);
        
        Gallina gallina1 = new Gallina(1, 1234, "Black rock", 1,"", lote1);
        Gallina gallina2 = new Gallina(2, 1235, "Black rock", 1,"", lote1);
        Gallina gallina3 = new Gallina(3, 1236, "Black rock", 1,"", lote1);
        
        System.out.println(lote1.getGallinas().size());
        //System.out.println(cargo1.getEmpleados().size());
        HashSet<Empleado> as = cargo1.getEmpleados();
        for (Empleado obj : as) {
            System.out.println(obj.getNombre());
        } 
    }
}
