/*Profesore --> Persona*/
package ClasesPersonas;
import java.util.ArrayList;
import ClasesCarrera.*;
import Utilidades.Fecha;

public class Profesor extends Persona {
    private ArrayList<Carrera> carreras = new ArrayList<>();
    private ArrayList<Materia> materias = new ArrayList<>();

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<Carrera> carreras) {
        this.carreras = carreras;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public Profesor(String codigo, String cedula, String nombre, String apellido, Fecha fechaNacimiento,
            String telefono, String direccion, ArrayList<Carrera> carreras, ArrayList<Materia> materias) {
        super(codigo, cedula, nombre, apellido, fechaNacimiento, telefono, direccion);
        this.carreras = carreras;
        this.materias = materias;
    }
}