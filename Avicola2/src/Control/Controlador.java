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

public boolean adicionarArea(int id, String tipo, String nombre, boolean beneficio_cooperativa, Empresa empresa){
    Area area = new Area(id, tipo, nombre, beneficio_cooperativa, empresa);
    return empresa.adicionarArea(area); 
}

public Empresa getEmpresa(){
    return this.empresa; 
}

public boolean adicionarCargo(int id, String nombre, Area area){
    Cargo cargo = new Cargo(id, nombre, area);
    return area.adicionarCargo(cargo);
}

public boolean adicionarEmpleado(int id, int cedula, String nombre, int tel, Cargo cargo, String nivel_profesional, int salario){
    Empleado empleado = new Empleado(id, cedula, nombre, tel, cargo, nivel_profesional, salario);
    return cargo.adicionarEmpleado(empleado);
}

public boolean adicionarVeterinario(String tipo, int experiencia, int id, int cedula, String nombre, int tel, Cargo cargo, String nivel_profesional, int salario){
    Veterinario vetetinario = new Veterinario(tipo, experiencia, id, cedula, nombre, tel, cargo, nivel_profesional, salario);
    return cargo.adicionarEmpleado(veterinario);
}

public boolean adicionarCurso(int id, String nombre, String titulo, String institucion, int fecha, int intensidad_horaria, Veterinario veterinario){
    Curso curso = new Curso(id, nombre, titulo, institucion, fecha, intensidad_horaria, veterinario);
    return veterinario.adicionarCurso(curso);
}

public boolean adicionarGranja(int id, int capacidad_max_gallinas, Area area, Empleado jefe){
    Granja granja = new Granja(id, capacidad_max_gallinas, area, jefe);
    return area.adicionarGranja(granja);
}

public boolean adicionarGalpon(int id, int codigo, String tipo_zona, int capacidad_max_gallinas, Granja granja, Empleado responsable){
    Galpon galpon = new Galpon(id, codigo, tipo_zona, capacidad_max_gallinas, granja, responsable);
    return granja.adicionarGalpon(galpon);
}

public boolean adicionarEventoGalpon(int id, String descripcion, int fecha, Galpon galpon){
    EventoGalpon eventoGalpon = new EventoGalpon(id, descripcion, fecha, galpon);
    return galpon.adicionarEventoGalpon(eventoGalpon); 
}

//public boolean adicionarLote(int id, int codigo, int cantidad_gallinas, int fecha_nacimiento_gallinas){
   // Lote lote = new Lote(id, codigo, cantidad_gallinas, fecha_nacimiento_gallinas);
   // return galpon.adicionarLote(lote);
//}

public boolean adicionarGallina(int id, int codigo, String raza, int fecha_nacimiento, String proceso, Lote lote){
    Gallina gallina = new Gallina(id, codigo, raza, fecha_nacimiento, proceso, lote); 
    return galpon.adicionarGallina(gallina);
}

public boolean adicionarVacuna(int id, String nombre, String novedad, int fecha, Veterinario asistente, Gallina gallina){
    Vacuna vacuna = new Vacuna(id, nombre, novedad, fecha, asistente, gallina);
    return gallina.adicionarVacuna(vacuna);
}

public boolean adicionarTratamiento(int id, String descripcion, int fecha, Gallina gallina){
    Tratamiento tratamiento = new Tratamiento(id, descripcion, fecha, gallina);
    return gallina.adicionarTratamiento(tratamiento);
}


}
