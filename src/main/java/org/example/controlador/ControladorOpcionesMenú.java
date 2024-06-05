package org.example.controlador;

import org.example.modelo.EjecuionOpciones;
import org.example.modelo.Persona;
import java.util.List;
import java.util.Scanner;

public class ControladorOpcionesMenú {

    private static final EjecuionOpciones accion = new EjecuionOpciones();

    public static boolean ejecutarOperacion(int opcion, Scanner consola, List<Persona> personas) {
        switch (opcion){
            case 1 ->{
                accion.listarPersona(personas);
            }
            case 2 -> {
                accion.agregarPersona(consola,personas);
            }
            case 3 -> {
                accion.actualizarPersona(consola, personas);
            }
            case 4 -> {
                accion.eliminarPersona(consola,personas);
            }
            case 5 -> {
                return true;
            }
            default -> System.out.println("Opción ingresada fuera del menú: "+opcion);
        }
        return false;
    }
}
