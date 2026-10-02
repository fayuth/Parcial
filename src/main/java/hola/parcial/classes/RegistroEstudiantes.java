package hola.parcial.classes;

import hola.parcial.interfaces.Estudiante;

public class RegistroEstudiantes {

    String codigo;
    String nombre;
    String apellido;
    String edad;
    String Describir;

    public RegistroEstudiantes(Codigo codigo, String nombre, String apellido,String edad, String describir) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.Describir = describir;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDescribir() {
        return Describir;
    }

    public void setDescribir(String describir) {
        Describir = describir;
    }


}
