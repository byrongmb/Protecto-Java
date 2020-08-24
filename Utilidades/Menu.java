package Utilidades;

import java.io.IOException;
import java.util.Scanner;
import ClasesPersonas.Secretario;
import ManejoArchivos.ArchivoCarrera;
import ManejoArchivos.ArchivoEstudiantes;
import ManejoArchivos.ArchivoProfesores;

public class Menu {
    private String opcion;
    private Scanner teclado = new Scanner(System.in);

    public void start() {
        cleanConsole();
        System.out.println("|------Bienvenido al Menu Inicial-------|");
        System.out.println("1. Soy Estudiante");
        System.out.println("2. Soy Profesor");
        System.out.println("3. Soy Secretario(a)");
        System.out.println("4. Salir..");
        System.out.print("\nPor favor, seleccione una opcion:");
        opcion = teclado.nextLine();

        seleccionInicial(opcion);
    }

    private void seleccionInicial(String opcion) {
        switch (opcion) {
            case "1":
                menuEstudiante();
                break;
            case "2":
                menuProfesor();
                break;
            case "3":
                menuSecretario();
                break;
            case "4":
                System.exit(0);
                break;
            default:
                start();
                break;
        }
    }

    private void menuEstudiante() {
        cleanConsole();
        System.out.println("|------Menu Estudiante-------|");
        System.out.println("1. Consultar Notas");
        System.out.println("2. Atras");
        System.out.println("3. Salir..");
        System.out.print("\nPor favor, seleccione una opcion: ");
        opcion = teclado.nextLine();
        seleccionEstudiante(opcion);
    }

    private void seleccionEstudiante(String opcion) {
        switch (opcion) {
            case "1":
                cleanConsole();
                System.out.print("Ingrese su ID: ");
                break;
            case "2":
                start();
                break;
            case "3":
                System.exit(0);
                break;
            default:
                menuEstudiante();
                break;
        }
    }

    private void menuProfesor() {
        cleanConsole();
        System.out.println("|------Menu Profesor-------|");
        System.out.println("1. Ingresar Notas");
        System.out.println("2. Modificar Notas");
        System.out.println("3. Consultar Notas");
        System.out.println("4. Cierre de Notas");
        System.out.println("5. Atras");
        System.out.println("6. Salir");
        System.out.print("\nPor favor, seleccione una opcion: ");
        opcion = teclado.nextLine();
        seleccionProfesor(opcion);
    }
    private void seleccionProfesor(String opcion) {
        switch (opcion) {
            case "1":
                cleanConsole();
                System.out.print("Ingrese su ID: ");
                break;
            case "5":
                start();
                break;
            case "6":
                System.exit(0);
                break;
            default:
                menuProfesor();
                break;
        }
    }


/*Secretario*/
    private void menuSecretario() {
        cleanConsole();
        System.out.println("|------Menu Secretario(a)-------|");
        System.out.println("1. Eliminar");
        System.out.println("2. Consultar");
        System.out.println("3. Registrar");
        System.out.println("4. Atras");
        System.out.println("5. Salir");
        System.out.print("\nPor favor, seleccione una opcion: ");
        opcion = teclado.nextLine();
        seleccionSecretario(opcion);
    }

    private void menuEliminar() {
        Secretario secretario = new Secretario();
        String ID;
        cleanConsole();
        System.out.println("|------Eliminar-------|");
        System.out.println("1. Estudiante");
        System.out.println("2. Profesor");
        System.out.println("3. Atras");
        System.out.println("4. Salir");
        System.out.print("\nPor favor, seleccione una opcion: ");
        opcion = teclado.nextLine();
        switch (opcion) {
            case "1":
                System.out.print("\nIngrese el ID del Estudiante: ");
                ID = teclado.nextLine();
                secretario.elimiarEstudiante(ID);
                menuEliminar();
                break;
            case "2":
                System.out.print("\nIngrese el ID del Profesor: ");
                ID = teclado.nextLine();
                secretario.elimiarEstudiante(ID);
                menuEliminar();
                break;
            case "3":
                menuSecretario();
                break;
            case "4":
                System.exit(0);
                break;
            default:
                menuEliminar();
                break;
        }
    }

    private void menuConsultar() {
        Secretario secretario = new Secretario();
        String ID;
        cleanConsole();
        System.out.println("|------Consultar-------|");
        System.out.println("1. Estudiantes Registrados");
        System.out.println("2. Profesores Registrados");
        System.out.println("3. Carreras");
        System.out.println("4. Atras");
        System.out.println("5. Salir..");
        System.out.print("\nPor favor, seleccione una opcion: ");
        opcion = teclado.nextLine();
        switch (opcion) {
            case "1":
                ArchivoEstudiantes.mostrar();
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            menuConsultar();
                break;
            case "2":
            ArchivoProfesores.mostrar();
            menuConsultar();
                break;
            case "3":
            ArchivoCarrera.mostrar();
                break;
            case "4":
            menuConsultar();
                break;
            case "5":
            System.exit(0);
                break;
            default:
            menuConsultar();
                break;
        }
    }
    private void menuRegistrar(){
        Secretario secretario = new Secretario();
        String ID;
        cleanConsole();
        System.out.println("|------Registrar-------|");
        System.out.println("1. Estudiantes");
        System.out.println("2. Profesores");
        System.out.println("3. Carreras");
        System.out.println("4. Atras");
        System.out.println("5. Salir..");
        System.out.print("\nPor favor, seleccione una opcion: ");
        opcion = teclado.nextLine();
        switch (opcion) {
            case "1":
            secretario.registrarEstudiante();
            menuEliminar();
                break;
            case "2":
            secretario.registrarProfesor();
            menuEliminar();
                    break;
            case "3":
            secretario.registrarCarreras();
            menuEliminar();
                break;
            case "4":
            menuSecretario();
                break;
            case "5":
            System.exit(0);
                break;
            default:
            menuEliminar();
                break;
        }
    }
    private void seleccionSecretario(String opcion){
        switch (opcion) {
            case "1":
            menuEliminar();
                break;
            case "2":
            menuConsultar();
                break;
            case "3":
            menuRegistrar();
                break;
            case "4":
            start();
                break;
            case "5":
            System.exit(0);
                break;
            default:
            menuProfesor();
                break;
        }
    }

    private void cleanConsole() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}