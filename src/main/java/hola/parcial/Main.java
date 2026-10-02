package hola.parcial;


//asfdasdsada


import hola.parcial.classes.Codigo;
import hola.parcial.classes.Direccion;
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

                        registarEstudiante();

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


    public static void registarEstudiante() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Crea tu mendigo codigo");
        String codigo = sc.nextLine();


        System.out.println("Coloca el nombre del estudiante");
        String nombre = sc.nextLine();

        System.out.println("Coloca el apellido del estudiante");
        String apellido = sc.nextLine();


        System.out.println("Coloca el edad del estudiante");
        String edad = sc.nextLine();

        System.out.println("Coloca el nombre del estudiante");
        String describir = sc.nextLine();


        new RegistroEstudiantes(new Codigo(nombre, apellido), nombre, apellido, edad, describir);


        System.out.print("Codigo: " + codigo + "\n");
        System.out.print("Nombre: " + nombre + "\n");
        System.out.print("Apellido: " + apellido + "\n");
        System.out.print("Edad: " + edad + "\n");
        System.out.print("About me: " + describir + "\n");


    }


    private static void buscarestudiante(RegistroEstudiantes registro) {
        Scanner sc = new Scanner(System.in);


    }
}