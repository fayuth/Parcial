package hola.parcial.classes;


import hola.parcial.exception.EstudianteNoEncontrado;
import java.util.HashMap;

public class RegistroEstudiantes {
    private final HashMap<String, Estudiante> estudiantes = new HashMap<>();

    public RegistroEstudiantes(Codigo codigo, String nombre, String apellido, String edad, String describir) {
    }

    public void agregar(String codigo, String nombre, Direccion d) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El codigo no puede ser vacio");
        }
        if (estudiantes.containsKey(codigo)) {
            throw new IllegalArgumentException("Codigo duplicado: " + codigo);
        }
        Estudiante e = new Estudiante(codigo, nombre, d);
        estudiantes.put(codigo, e);
    }

    public void agregar(Estudiante e) {
        agregar(e.getCodigo(), e.getNombre(), e.getDireccion());
    }

    public void listar() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados");
            return;
        }
        for (Estudiante e : estudiantes.values()) {
            System.out.println(e);
        }
    }

    public Estudiante buscar(String codigo) throws EstudianteNoEncontrado {
        if (!estudiantes.containsKey(codigo)) {
            throw new EstudianteNoEncontrado("No existe estudiante con codigo: " + codigo);
        }
        return estudiantes.get(codigo);
    }
}
