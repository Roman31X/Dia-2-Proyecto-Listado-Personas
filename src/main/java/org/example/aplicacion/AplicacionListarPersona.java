package org.example.aplicacion;

import java.util.Scanner;

import static org.example.vista.MensajesInterfazConsola.opcionesMenu;

public class AplicacionListarPersona {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false;

        while (!salir){
            try{
                var opcion = opcionesMenu(consola);

            }catch (Exception e){
                System.out.println("Error al digitar una opción del menú: "+e.getMessage());
            }
        }
    }
}
