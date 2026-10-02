package hola.parcial.classes;

import hola.parcial.interfaces.Describible;
import hola.parcial.interfaces.Identificable;

public class Estudiante implements Identificable, Describible {
    private String codigo;
    private String nombre;
    private Direccion direccion;

    public Estudiante(String codigo, String nombre, Direccion direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String getCodigo() { return codigo; }

    public String getNombre() { return nombre; }
    public Direccion getDireccion() { return direccion; }

    @Override
    public String describir() {
        return "Codigo: " + codigo + " | Nombre: " + nombre + " | Direccion: " + direccion.toString();
    }

    @Override
    public String toString() {
        return describir();
    }
}
