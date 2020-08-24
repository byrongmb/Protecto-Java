package ClasesPersonas;
import java.util.Scanner;

import ClasesCarrera.Carrera;
import ClasesCarrera.Turno;
import ManejoArchivos.ArchivoEstudiantes;
import Utilidades.Fecha;

public class Secretario extends Persona{
    private Carrera carrera = new Carrera();
    private Fecha fechaInicio = new Fecha();
    private int anioServicio;
    private Turno[] turnos = new Turno[2];

    public void registrarEstudiante(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("LLenar el siguiente formulario");
        System.out.print("Codigo: ");
        String codigo = teclado.nextLine();

        System.out.print("Cedula: ");
        String cedula = teclado.nextLine();

        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Apellido: ");
        String apellido = teclado.nextLine();

        System.out.println("Fecha de Nacimiento");
        System.out.print("Dia: ");
        int dia = teclado.nextInt();
        System.out.print("Mes: ");
        int mes = teclado.nextInt();
        System.out.print("Anio: ");
        int anio = teclado.nextInt();
        Fecha fechaNacimiento = new Fecha(dia, mes, anio);

        System.out.print("Telefono: ");
        String telefono = teclado.nextLine();

        System.out.print("Direccion: ");
        String direccion = teclado.nextLine();

        System.out.print("Carrera (Codigo): ");
        String codigoCarrera = teclado.nextLine();
        Carrera carrera = new Carrera();
        carrera.setCodigoCarrera(codigoCarrera);

        System.out.print("Semestre: ");
        int semestre = teclado.nextInt();

        System.out.println("Fecha de Inicio");
        System.out.print("Dia: ");
        dia = teclado.nextInt();
        System.out.print("Mes: ");
        mes = teclado.nextInt();
        System.out.print("Anio: ");
        anio = teclado.nextInt();
        Fecha fechaInicio = new Fecha(dia, mes, anio);

        System.out.println("Fecha de Finalizacion");
        System.out.print("Dia: ");
        dia = teclado.nextInt();
        System.out.print("Mes: ");
        mes = teclado.nextInt();
        System.out.print("Anio: ");
        anio = teclado.nextInt();
        Fecha fechaFinalizacion = new Fecha(dia, mes, anio);
        
        System.out.print("Materia por semestre: ");
        int materaPorSemestres = teclado.nextInt();

        Estudiante estudiante = new Estudiante(codigo, cedula, nombre, apellido, fechaNacimiento, telefono,
         direccion, carrera, semestre, fechaInicio, fechaFinalizacion, materaPorSemestres);
        
        ArchivoEstudiantes.guardar(estudiante);
    }

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