package ManejoArchivos;
import java.io.*;
import ClasesPersonas.*;

public class ArchivoProfesores {
    private static File archivo = new File("ManejoArchivos/Recursos/Profesores.txt");

    public static void guardar(Profesor profesor) {
        try {
            if(!archivo.exists()){
                archivo.createNewFile();
            }
            OutputStream os = new FileOutputStream(archivo, true);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(profesor);
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
            Profesor profesor = (Profesor) ois.readObject();
            profesor.mostrar();
        } catch (FileNotFoundException e) {
            System.out.println("Error 1: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error 2: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error 3: " + e.getMessage());
        }
    }
}