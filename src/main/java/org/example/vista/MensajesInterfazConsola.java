package org.example.vista;

import java.util.Scanner;

public class MensajesInterfazConsola {

    public static int opcionesMenu(Scanner consola){
        System.out.print("""
                         |-------------------------|
                         |   APP LISTADO PERSONAS  |
                         |-------------------------|
                         | [1] - AGREGAR PERSONA   |
                         | [2] - LISTAR PERSONA    |
                         | [3] - SALIR APP         |
                         |-------------------------|"""+"\n");
        System.out.print("| Ingrese opción:\s");
        return Integer.parseInt(consola.nextLine());
    }
}
