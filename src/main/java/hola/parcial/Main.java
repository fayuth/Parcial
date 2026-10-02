package hola.parcial;

import hola.parcial.classes.RegistroEstudiantes;

import java.util.Scanner;

public class Main {

    Main self = new Main();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sendmenu();
        try {

            if (sc.hasNextLine()) {
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        RegistroEstudiantes registro = new RegistroEstudiantes();
                        buscarestudiante(registro);
                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                }


            }

        } catch (Exception e) {
            sendmenu();

        }
    }


    public static void sendmenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Agregar estudiante");
        System.out.println("2 - Listar estudiantes");
        System.out.println("3 - Buscar estudiante");
        System.out.println("0 - Salir");


    }


    private static void buscarestudiante(RegistroEstudiantes registro) {
        Scanner sc = new Scanner(System.in);


    }
}