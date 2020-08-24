package ManejoArchivos;

import java.io.*;
import ClasesPersonas.Estudiante;
import ClasesPersonas.Persona;

public class ArchivoEstudiantes {
    private static File archivo = new File("../Recursos/Estudiantes.txt");

    public static boolean guardar(Persona persona) {
        boolean bandera = false;
        try {
            final FileOutputStream fos = new FileOutputStream(archivo);
            final ObjectOutputStream oss = new ObjectOutputStream(fos);
            oss.writeObject(persona);
            bandera = true;
        } catch (final FileNotFoundException e) {
            try {
                archivo.createNewFile();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        } catch (final IOException e) {
            e.printStackTrace();
        }
        return bandera;
    }

    public static Estudiante buscar(String codigo) {
        Estudiante estudiante = new Estudiante();
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);
            while (codigo != estudiante.getCodigo()) {
                estudiante = (Estudiante) ois.readObject();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return estudiante;
    }
}