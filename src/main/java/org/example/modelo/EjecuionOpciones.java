package org.example.modelo;

import java.util.List;
import java.util.Scanner;

public class EjecuionOpciones implements OpcionesMenu{

    @Override
    public void listarPersona(List<Persona> personas) {
        if(personas.size() != 0){
            System.out.println("-----------------------LISTADO DE PERSONAS---------------------|");
            for (Persona persona : personas) {
                System.out.println(persona.toString());
            }
        }else{
            System.out.println("La lista aun esta vacía debe registrar primero");
        }
    }

    @Override
    public void agregarPersona(Scanner consola, List<Persona> personas) {
        System.out.println("|---------NUEVO REGISTRO PERSONA---------|");
        System.out.print("Ingrese Nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Ingrese Teléfono: ");
        var telefono = consola.nextLine();
        System.out.print("Ingrese Email: ");
        var email = consola.nextLine();

        var persona = new Persona(nombre,telefono,email);
        personas.add(persona);
        System.out.println("|---Nueva persona registrada con éxito!--|");
    }

    @Override
    public void actualizarPersona(Scanner consola, List<Persona> personas) {

    }

    @Override
    public void EliminarPersona(Scanner consola, List<Persona> personas) {
        if(personas.size() != 0){
            System.out.println("|--------ELIMINACIÓN POR ID DE PERSONA--------|");
            System.out.print("Ingrese ID a eliminar:");
            var id = Integer.parseInt(consola.nextLine());
            for (Persona persona : personas) {
                if(persona.getId() == id){
                    personas.remove(persona);
                }
            }
            System.out.println("|--¡Persona eliminada con éxito de la Lista!--|");
        }else{
            System.out.println("La lista aun esta vacía debe registrar primero");
        }
    }
}
