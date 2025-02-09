package org.example.modelo;

import java.util.List;
import java.util.Scanner;

public interface OpcionesMenu {
    void listarPersona(List<Persona> personas);

    void agregarPersona(Scanner consola, List<Persona> personas);

    void actualizarPersona(Scanner consola, List<Persona> personas);

    void eliminarPersona(Scanner consola, List<Persona> personas);

    void buscarPerona(Scanner consola, List<Persona> personas);
}
