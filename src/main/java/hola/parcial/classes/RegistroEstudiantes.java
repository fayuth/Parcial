package hola.parcial.classes;

import hola.parcial.interfaces.Estudiante;

public class RegistroEstudiantes  implements Estudiante {

    String nombre;
    String apellido;
    String cuidad;
    String calle;
    String edad;
    String direccion;
    String Describir;


    @Override
    public void getCodigo() {

    }

    public RegistroEstudiantes(String nombre, String apellido, String cuidad, String calle, String edad, String direccion, String describir) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuidad = cuidad;
        this.calle = calle;
        this.edad = edad;
        this.direccion = direccion;
        this.Describir = describir;


    }


}
