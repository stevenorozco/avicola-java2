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
    cargarInformacionInicial();
}  
   public  void cargarInformacionInicial() {

        Empresa empresa = new Empresa(1, "Avicola");
        
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
        
        //Creamos las areas de produccion
  
        Empleado empleado1 = new Empleado(1, 1113650449, "Luis Salamanca", 3123212, cargo_galponero, "Profesional", 3000000);
        Empleado empleado2 = new Empleado(2, 111365, "Jimito Perez", 3124221, cargo_galponero, "Tecnologo", 2000000);
        Empleado empleado3 = new Empleado(2, 11136504, "Ruben Bonilla", 3126754, cargo_jefe_ventas, "Tecnico", 1000000);
        Veterinario veterinario1 = new Veterinario("", 10,1, 1113650449, "Luis Salamanca", 3123212, cargo_veterinario, "Profesional", 3000000);
        Veterinario veterinario2 = new Veterinario("", 3,1, 1150449, "Luis Molino", 3324532, cargo_veterinario, "Tecnologo", 4000000);
        Veterinario veterinario3 = new Veterinario("", 5,1, 1113659, "Andres Perez", 3123456, cargo_veterinario, "Profesional", 1000000);
        Curso curso1 = new Curso(1, "Manejo de Gallinas", "Manejador de gallinas","Instituto", 1,20,veterinario1);
        
        
        Granja granja1 = new Granja(1, 30, area_granja, empleado1);
        Granja granja2 = new Granja(2, 40, area_granja, empleado2);
        Galpon galpon1 = new Galpon(1, 123456, "levante", 20, granja1, empleado1);
        Galpon galpon2 = new Galpon(2, 135556, "levante", 30, granja2, empleado2);
        Lote lote1 = new Lote(1, 1234, 30, 32323);
        Lote lote2 = new Lote(2, 5467, 50, 35346);
        
        
        Gallina gallina1 = new Gallina(1, 1234, "black_rock", 1, "", lote1);
        Vacuna vacuna1_gallina1 = new Vacuna(1, "ZTH-011", "Ninguna novedad", 123, veterinario1, gallina1);
        Vacuna vacuna2_gallina1 = new Vacuna(2, "POW-011", "Ninguna novedad", 125, veterinario1, gallina1);
        Tratamiento tratamiento1_gallina1 = new Tratamiento(1, "Se aplica plan nutricional", 129, gallina1);
        
        Gallina gallina2 = new Gallina(2, 1235, "black_rock", 1, "", lote1);
        Gallina gallina3 = new Gallina(3, 1236, "black_rock", 2, "", lote1);
        Gallina gallina4 = new Gallina(4, 6446, "especkledy", 2, "", lote1);
        Gallina gallina5 = new Gallina(5, 8544, "black_rock", 1, "", lote2);
        Gallina gallina6 = new Gallina(6, 6677, "speckledy", 1, "", lote1);
        Gallina gallina7 = new Gallina(7, 3455, "black_rock", 2, "", lote2);

        galpon1.adicionarLote(lote1);
  
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
   //Lote lote = new Lote(id, codigo, cantidad_gallinas, fecha_nacimiento_gallinas);
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
