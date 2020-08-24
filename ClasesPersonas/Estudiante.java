/*Estudiante --> Persona*/
package ClasesPersonas;
import java.io.Serializable;

import ClasesCarrera.*;
import Utilidades.Fecha;

public class Estudiante extends Persona implements Serializable{
    private Carrera carrera = new Carrera();
    private int semestre;
    private Fecha fechaInicio;
    private Fecha fechaFinalizacion;
    private int materaPorSemestres;

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

    public Estudiante(String codigo, String cedula, String nombre, String apellido, Fecha fechaNacimiento,
            String telefono, String direccion, Carrera carrera, int semestre, Fecha fechaInicio,
            Fecha fechaFinalizacion, int materaPorSemestres) {
        super(codigo, cedula, nombre, apellido, fechaNacimiento, telefono, direccion);
        this.carrera = carrera;
        this.semestre = semestre;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.materaPorSemestres = materaPorSemestres;
    }
    public Estudiante(){
        
    }
    
}