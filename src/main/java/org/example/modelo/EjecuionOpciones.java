package org.example.modelo;

import java.util.List;
import java.util.Scanner;

public class EjecuionOpciones implements OpcionesMenu{

    @Override
    public void listarPersona(List<Persona> personas) {
        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }
    }

    @Override
    public void agregarPersona(Scanner consola) {

    }

    @Override
    public void actualizarPersona(Scanner consola, List<Persona> personas) {

    }

    @Override
    public void EliminarPersona(Scanner consola, List<Persona> personas) {

    }
}
