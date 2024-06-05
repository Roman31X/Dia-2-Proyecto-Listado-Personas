package org.example.vista;

import java.util.Scanner;

public class MensajesInterfazConsola {

    public static int opcionesMenu(Scanner consola){
        System.out.print("|-------------------------|"+"\n"+
                         "|   APP LISTADO PERSONAS  |"+"\n"+
                         "|-------------------------|"+"\n"+
                         "| [1] - AGREGAR PERSONA   |"+"\n"+
                         "| [2] - LISTAR PERSONA    |"+"\n"+
                         "| [3] - SALIR APP         |"+"\n"+
                         "|-------------------------|");
        System.out.print("| Ingrese opción:\s");
        return Integer.parseInt(consola.nextLine());
    }
}
