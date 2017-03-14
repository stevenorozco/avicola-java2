/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Modelo.Area;
import Modelo.Cargo;
import Modelo.Empresa;

/**
 *
 * @author luissalamanca
 */
public class BaseDatos {
    public Empresa empresa = new Empresa(1, "Avicola");
    
    public BaseDatos(){
        crearAreasYCargos();
    }
    
    
    public void crearAreasYCargos(){
        Area area_granja = new Area(1,"produccion", "Granja",false, empresa);
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
    }
}
