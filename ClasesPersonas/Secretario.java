package ClasesPersonas;
import ClasesCarrera.Carrera;
import ClasesCarrera.Turno;
import Utilidades.Fecha;

public class Secretario extends Persona{
    private Carrera carrera = new Carrera();
    private Fecha fechaInicio = new Fecha();
    private int anioServicio;
    private Turno[] turnos = new Turno[2];

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Fecha getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Fecha fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getAnioServicio() {
        return anioServicio;
    }

    public void setAnioServicio(int anioServicio) {
        this.anioServicio = anioServicio;
    }

    public Turno[] getTurnos() {
        return turnos;
    }

    public void setTurnos(Turno[] turnos) {
        this.turnos = turnos;
    }

    public Secretario(String codigo, String cedula, String nombre, String apellido, Fecha fechaNacimiento,
            String telefono, String direccion, Carrera carrera, Fecha fechaInicio, int anioServicio) {
        super(codigo, cedula, nombre, apellido, fechaNacimiento, telefono, direccion);
        this.carrera = carrera;
        this.fechaInicio = fechaInicio;
        this.anioServicio = anioServicio;
        /*El secretario(a) tiene dos turnos*/
        turnos[0] = new Turno(1);
        turnos[1] = new Turno(2);
    }
}