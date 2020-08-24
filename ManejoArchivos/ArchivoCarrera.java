package ManejoArchivos;

import java.io.*;
import java.util.ArrayList;

import ClasesCarrera.Carrera;

public class ArchivoCarrera {
    private static File archivo = new File("ManejoArchivos/Recursos/Carreras.txt");

    public static void guardar(Carrera carrera) {
        try {
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
            FileOutputStream os = new FileOutputStream(archivo, true);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.close();
            oos.writeObject(carrera);
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void mostrar() {
        try {
            InputStream is = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(is);
            Carrera carrera = (Carrera) ois.readObject();
            System.out.println("Nombre Carrera: " + carrera.getNombreCarrera());
            System.out.println("Codigo Carrera: " + carrera.getCodigoCarrera());
        } catch (FileNotFoundException e) {
            System.out.println("Error 1: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error 2: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error 3: " + e.getMessage());
        }
    }
}