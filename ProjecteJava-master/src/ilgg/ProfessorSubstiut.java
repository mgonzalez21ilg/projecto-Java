package ilgg;

import java.util.Date;

public class ProfessorSubstiut extends Persona {
    private Date dataInici;


    public ProfessorSubstiut() {
        Date data = new Date(2021, 11, 1);
    }

    public String obtenirDades() {
        return super.obtenirDades() + this.dni + " (PROFE amb sou: " ;
    }
}

