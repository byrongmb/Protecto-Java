package ManejoArchivos;

import java.io.*;
import ClasesPersonas.Estudiante;

public class ArchivoEstudiantes {
    private static File archivo = new File("ManejoArchivos/Recursos/Estudiantes.txt");

    public static void guardar(Estudiante estudiante) {
        try {
            if(!archivo.exists()){
                archivo.createNewFile();
            }
            System.out.println("Nombre: " + estudiante.getNombre());
            OutputStream os = new FileOutputStream(archivo, true);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(estudiante);
            oos.close();
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
            Estudiante estudiante = (Estudiante) ois.readObject();
            System.out.println("Nombre Estudiante: " + estudiante.getNombre());
            System.out.println("Apellido Estudiante: " + estudiante.getApellido());
            System.out.println("Codigo: " + estudiante.getCodigo());
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}