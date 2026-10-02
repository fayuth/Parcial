package hola.parcial;

import hola.parcial.classes.Direccion;
import hola.parcial.classes.Estudiante;
import hola.parcial.classes.RegistroEstudiantes;
import hola.parcial.exception.EstudianteNoEncontrado;
import hola.parcial.interfaces.Describible;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        RegistroEstudiantes registro = new RegistroEstudiantes();
        Scanner sc = new Scanner(System.in);

        Direccion d1 = new Direccion("Puerto Colombia", "Cra 5 #10-46");
        registro.agregar("001", "Fayuth Rojas", d1);

        Direccion d2 = new Direccion("Galapa", "Cra 38 #38");
        Estudiante e2 = new Estudiante("002", "Cristan De la Hoz", d2);


        int opcion = -1;
        do {
            System.out.println("1. Agregar");
            System.out.println("2. Listar");
            System.out.println("3. Buscar");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.print("Codigo: ");
                        String cod = sc.nextLine();
                        System.out.print("Nombre: ");
                        String nom = sc.nextLine();
                        System.out.print("Ciudad: ");
                        String ciu = sc.nextLine();
                        System.out.print("Calle: ");
                        String cal = sc.nextLine();
                        Direccion dir = new Direccion(ciu, cal);
                        registro.agregar(cod, nom, dir);
                        System.out.println("Estudiante agregado");
                        break;
                    case 2:
                        registro.listar();
                        break;
                    case 3:
                        System.out.print("Codigo a buscar: ");
                        String codBus = sc.nextLine();
                        Estudiante encontrado = registro.buscar(codBus);
                        Describible desc = encontrado;
                        System.out.println(desc.describir());
                        break;
                    case 0:
                        System.out.println("Morido");
                        break;
                    default:
                        System.out.println("Opcion invalida");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debes ingresar un numero valido");
                opcion = -1;
            } catch (IllegalArgumentException e) {
                System.out.println("Error de validacion: " + e.getMessage());
            } catch (EstudianteNoEncontrado e) {
                System.out.println("Error de busqueda: " + e.getMessage());
            } finally {
                System.out.println("Operacion finalizada");
            }
        } while (opcion != 0);

        sc.close();
    }
}