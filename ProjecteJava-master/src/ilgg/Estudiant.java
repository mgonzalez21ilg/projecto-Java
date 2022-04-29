package ilgg;

public class Estudiant extends Persona{


    private double nota;

    public Estudiant() {}

    public void posarNota(double nota) {
        this.nota = nota;
    }

    public String obtenirDades() {
        return super.obtenirDades() + " DNI: " + this.dni + " (ESTUDIANT amb nota: " + this.nota +")";
    }
}
