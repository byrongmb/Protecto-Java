/*Un profesor dicta muchas materias, una materia puede ser dictada 
por varios profesores; Tipo relacion N:N*/
package ClasesCarrera;

public class Materia {
    private String codigoMateria;
    private String codigoCarrera;
    private String nombreMateria;
    private int semestre;
    private int[] calificaciones = new int[4];

    public Materia() {
        /* Constructor Vacio */
    }

    /*Getters and Setters*/
    public int[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(String codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public String getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(String codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public Materia(String codigoMateria, String codigoCarrera, String nombreMateria, int semestre,
            int[] calificaciones) {
        this.codigoMateria = codigoMateria;
        this.codigoCarrera = codigoCarrera;
        this.nombreMateria = nombreMateria;
        this.semestre = semestre;
        this.calificaciones = calificaciones;
    }

    
}