package app;

import util.Util;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String eleccion = "";
        boolean salir = false;
        Adaptador adaptador = new Adaptador();

        System.out.println("Base de datos inmoviliaria");

        do {
            System.out.println("\n\n¿que accion desea realizar? \n(1)consultar datos\n(2)añadir transaccion\n(3)salir");
            eleccion = Util.sc.nextLine();

            if (eleccion.equals("1")) {
                System.out.println("cosulta");
                adaptador.consulta();
            } else if (eleccion.equals("2")) {
                System.out.println("Añadir");
                adaptador.añadir();
            } else if (eleccion.equals("3")) {
                System.out.println("saliendo");
                salir = true;
            } else {
                System.out.println("\n---Por favor introduzca una de las obiones proporcionadas---\n");
            }

        } while (salir == false);


    }
}
