import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RegistroEstudiantes registro = new RegistroEstudiantes();
        Scanner sc = new Scanner(System.in);

        // Demostracion de sobrecarga y polimorfismo exigida en el punto b
        Direccion d1 = new Direccion("Barranquilla", "Calle 64 # 52-62");
        registro.agregar("001", "Juan Perez", d1); // usa version 1

        Direccion d2 = new Direccion("Soledad", "Calle 30 # 18-10");
        Estudiante e2 = new Estudiante("002", "Ana Gomez", d2);
        registro.agregar(e2); // usa version 2

        // Polimorfismo: invocar describir() desde referencia Describible
        Describible ref = e2;
        System.out.println("Demo polimorfismo: " + ref.describir());

        int opcion = -1;
        do {
            System.out.println("\n--- MENU REGISTRO ESTUDIANTES ---");
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
                        System.out.println("Estudiante agregado OK");
                        break;
                    case 2:
                        registro.listar();
                        break;
                    case 3:
                        System.out.print("Codigo a buscar: ");
                        String codBus = sc.nextLine();
                        Estudiante encontrado = registro.buscar(codBus);
                        // Usando Describible
                        Describible desc = encontrado;
                        System.out.println(desc.describir());
                        break;
                    case 0:
                        System.out.println("Saliendo...");
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
        } while (opcion!= 0);

        sc.close();
    }
}