/*
-1 Mañana
-2 Tarde
-3 Noche
*/

package ClasesCarrera;

public class Turno {
    private int codigoTurno;

    public String getToString(){
        if (codigoTurno == 1) {
            return "Mañana";
        }
        else if (codigoTurno == 2) {
            return "Tarde";
        }
        return "Noche";
    }

    public int getCodigoTurno() {
        return codigoTurno;
    }

    public void setCodigoTurno(int codigoTurno) {
        this.codigoTurno = codigoTurno;
    }

    public Turno(int codigoTurno) {
        this.codigoTurno = codigoTurno;
    }

}