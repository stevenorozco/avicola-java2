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
        
        Area area_granja = new Area(1,"produccion", "Granja",false, empresa);
        
        
        //System.out.println(area_granja.getEmpresa().toString());
        //System.out.println(empresa.getAreas().size());
        
        //empresa.getAreas();
        
        
        
        
        
        
        
        
        Area area_planta_alimentos = new Area(2,"produccion", "Planta de Alimentos",false, empresa);

        //Creamos las areas de administrativo
        Area area_recursos_humanos = new Area(3,"administrativo", "Recursos Humanos",false, empresa);
        Area area_compras = new Area(4,"administrativo", "Compras",false, empresa);
        Area area_financiero = new Area(5,"administrativo", "Financiero",false, empresa);
        Area area_ventas = new Area(6,"administrativo", "Ventas",false, empresa);

        //Creamos los cargos de produccion
        Cargo cargo_galponero = new Cargo(1, "Galponero", area_granja);
        Cargo cargo_jefe_granja = new Cargo(2, "Jefe Granja", area_granja);
        Cargo cargo_veterinario = new Cargo(3, "Veterinario", area_granja);
        Cargo cargo_auxliar_veterinario = new Cargo(4, "Auxiliar Veterinario", area_granja);

        Cargo cargo_jefe_planta = new Cargo(5, "Jefe de Planta", area_planta_alimentos);
        Cargo cargo_auxiliar = new Cargo(6, "Auxiliar de Planta", area_planta_alimentos);

        //Creamos los cargos de administrativo
        Cargo cargo_jefe_rrhh = new Cargo(7, "Jefe de Recursos Humanos", area_recursos_humanos);
        Cargo cargo_analista_rrhh = new Cargo(8, "Analista de Recursos Humanos", area_recursos_humanos);

        Cargo cargo_jefe_compras = new Cargo(9, "Jefe de Compras", area_compras);
        Cargo cargo_analista_compras = new Cargo(10, "Analista de Compras", area_compras);

        Cargo cargo_jefe_financiero = new Cargo(11, "Jefe Financiero", area_financiero);
        Cargo cargo_analista_financiero = new Cargo(12, "Analista Financiero", area_financiero);

        Cargo cargo_jefe_ventas = new Cargo(13, "Jefe de Ventas", area_ventas);
        Cargo cargo_analista_ventas = new Cargo(14, "Analista de Ventas", area_ventas);
        
        //Creamos las areas de produccion
        
        
        
        
        
        
        
        Empleado empleado1 = new Empleado(1, 1113650449, "Luis Salamanca", 3123212, cargo_galponero, "Profesional", 3000000);
        Veterinario veterinario1 = new Veterinario("", 10,1, 1113650449, "Luis Salamanca", 3123212, cargo_veterinario, "Profesional", 3000000);
        Curso curso1 = new Curso(1, "Manejo de Gallinas", "Manejador de gallinas","Instituto", 1,20,veterinario1);
        
        Granja granja1 = new Granja(1, 30, area_granja, empleado1);
        Galpon galpon1 = new Galpon(1, 123456, "levante", 20, granja1, empleado1);
        Lote lote1 = new Lote(1, 1234, 30, 32323);
        
        
        Gallina gallina1 = new Gallina(1, 1234, "black_rock", 1, "", lote1);
        Vacuna vacuna1_gallina1 = new Vacuna(1, "ZTH-011", "Ninguna novedad", 123, veterinario1, gallina1);
        Vacuna vacuna2_gallina1 = new Vacuna(2, "POW-011", "Ninguna novedad", 125, veterinario1, gallina1);
        Tratamiento tratamiento1_gallina1 = new Tratamiento(1, "Se aplica plan nutricional", 129, gallina1);
        
        Gallina gallina2 = new Gallina(2, 1235, "black_rock", 1, "", lote1);
        Gallina gallina3 = new Gallina(3, 1236, "black_rock", 1, "", lote1);
        Gallina gallina4 = new Gallina(4, 1236, "black_rock", 1, "", lote1);
        
        
        System.out.print(gallina2.getInfoGallina());
        galpon1.adicionarLote(lote1);
        
        //System.out.println(lote1.getGallinas().size());
        //System.out.println(granja1.getCantidadGallinas());
        //System.out.println(lote1.getCantidadGallinas());
        //System.out.println(cargo1.getEmpleados().size());
        //HashSet<Empleado> as = cargo_galponero.getEmpleados();
        //for (Empleado obj : as) {
        //    System.out.println(obj.getNombre());
        //} 
    }
}
