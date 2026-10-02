package hola.parcial.classes;

public class Direccion {

    private final String ciudad;
    private final String calle;

    public Direccion(String ciudad, String calle) {
        this.ciudad = ciudad;
        this.calle = calle;
    }
    public String getCiudad() {
        return ciudad;
    }
    public String getCalle() {
        return calle;
    }

    @Override
    public String toString() {
        return ciudad + ", " + calle;
    }
}
