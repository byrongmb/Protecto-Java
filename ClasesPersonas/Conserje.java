package ClasesPersonas;
import ClasesCarrera.Carrera;
import ClasesCarrera.Turno;
import Utilidades.Fecha;

public class Conserje extends Persona{
    private Carrera carrera = new Carrera();
    private Fecha fechaInicio = new Fecha();
    private int anioServicio;
    private Turno[] turnos = new Turno[3];

    /*Getters and Setters*/
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

    public Conserje(String nombre, String apellido, String cedula, Fecha fechaNacimiento, String telefono,
            String direccion, Carrera carrera, Fecha fechaInicio, int anioServicio) {
        super(nombre, apellido, cedula, fechaNacimiento, telefono, direccion);
        this.carrera = carrera;
        this.fechaInicio = fechaInicio;
        this.anioServicio = anioServicio;

        /*El conserje tiene turnos en la mañana, tarde y noche*/
        turnos[0] = new Turno(1);
        turnos[1] = new Turno(2);
        turnos[2] = new Turno(3);
    }
    
    
}