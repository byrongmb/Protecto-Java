/*Una carrera tiene muchos estudiantes, un estudiante puede estar en 
una sola carrera; Tipo relación 1:N*/
package ClasesCarrera;

public class Carrera {
    private String nombreCarrera;
    private String codigoCarrera;

    public Carrera() {
        /* Constructor Vacio */
    }

    public String getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(String codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    /* Getters and Setters */
    public Carrera(String nombreCarString){
        setNombreCarrera(nombreCarrera);
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public Carrera(String nombreCarrera, String codigoCarrera) {
        this.nombreCarrera = nombreCarrera;
        this.codigoCarrera = codigoCarrera;
    }

    
}