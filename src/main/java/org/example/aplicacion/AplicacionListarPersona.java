package org.example.aplicacion;

import org.example.modelo.Persona;
import java.util.*;
import static org.example.controlador.ControladorOpcionesMenú.ejecutarOperacion;
import static org.example.vista.MensajesInterfazConsola.opcionesMenu;

public class AplicacionListarPersona {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false;
        List<Persona> personas = new ArrayList<>();

        while (!salir){
            try{
                var opcion = opcionesMenu(consola);
                salir = ejecutarOperacion(opcion,consola, personas);
                System.out.println();
            }catch (Exception e){
                System.out.println("Error al digitar una opción del menú: "+e.getMessage());
            }
        }
    }
}
