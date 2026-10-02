package hola.parcial;


//asfdasdsada


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    Main self = new Main();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sendmenu();

        if (sc.hasNextInt()) {
            int opcion = sc.nextInt();
            try {
                switch (opcion) {
                    case 1:
                        System.out.println("Test");
                }

            } catch (Exception e) {
                sendmenu();

            }

        }

    }


     public static void sendmenu() {
         Scanner sc = new Scanner(System.in);

        System.out.println("1 - Agregar estudiante");
        System.out.println("2 - Listar estudiantes");
        System.out.println("3 - Buscar estudiante");
        System.out.println("0 - Salir");

    }



    private static void buscarestudiante() {
        Scanner sc = new Scanner(System.in);





    }
}