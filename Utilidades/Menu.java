package Utilidades;

import java.io.IOException;
import java.util.Scanner;

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

    private void menuEstudiante(){
        cleanConsole();
        System.out.println("|------Menu Estudiante-------|");
        System.out.println("1. Consultar Notas");
        System.out.println("2. Atras");
        System.out.println("3. Salir..");
        System.out.print("\nPor favor, seleccione una opcion: ");
        opcion = teclado.nextLine();
        seleccionEstudiante(opcion);
    }

    private void seleccionEstudiante(String opcion){
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

    private void menuProfesor(){
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
    private void seleccionProfesor(String opcion){
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

    private void menuSecretario(){
        cleanConsole();
        System.out.println("|------Menu Secretario(a)-------|");
        System.out.println("1. Eliminar Notas");
        System.out.println("2. Consultar Notas");
        System.out.println("3. Registrar");
        System.out.println("4. Atras");
        System.out.println("5. Salir");
        System.out.print("\nPor favor, seleccione una opcion: ");
        opcion = teclado.nextLine();
        seleccionSecretario(opcion);
    }
    private void seleccionSecretario(String opcion){
        switch (opcion) {
            case "1":
            cleanConsole();
            System.out.print("Ingrese su ID: ");
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