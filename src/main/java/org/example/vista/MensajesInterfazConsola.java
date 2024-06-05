package org.example.vista;

import java.util.Scanner;

public class MensajesInterfazConsola {

    public static int opcionesMenu(Scanner consola){
        System.out.print("""
                         |--------------------------|
                         |    APP LISTADO PERSONAS  |
                         |--------------------------|
                         | [1] - LISTAR PERSONA     |
                         | [2] - AGREGAR PERSONA    |
                         | [3] - ACTUALIZAR PERSONA |
                         | [4] - ELIMINAR PERSONA   |
                         | [5] - SALIR APP          |
                         |--------------------------|"""+"\n");
        System.out.print("| Ingrese opción:\s");
        return Integer.parseInt(consola.nextLine());
    }
}
