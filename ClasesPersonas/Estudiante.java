/*Estudiante --> Persona*/
package ClasesPersonas;
import ClasesCarrera.*;
import Utilidades.Fecha;

public class Estudiante extends Persona{
    private Carrera carrera = new Carrera();
    private int semestre;
    private Fecha fechaInicio;
    private Fecha fechaFinalizacion;
    private int materaPorSemestres;
    
    /* Getters and Setters */
    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Fecha getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Fecha fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Fecha getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Fecha fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public int getMateraPorSemestres() {
        return materaPorSemestres;
    }

    public void setMateraPorSemestres(int materaPorSemestres) {
        this.materaPorSemestres = materaPorSemestres;
    }

    public Estudiante(String nombre, String apellido, String cedula, Fecha fechaNacimiento, String telefono,
            String direccion, Carrera carrera, int semestre, Fecha fechaInicio, Fecha fechaFinalizacion,
            int materaPorSemestres) {
        super(nombre, apellido, cedula, fechaNacimiento, telefono, direccion);
        this.carrera = carrera;
        this.semestre = semestre;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.materaPorSemestres = materaPorSemestres;
    }
}