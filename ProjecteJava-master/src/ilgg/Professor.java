package ilgg;

public class Professor extends Persona{


    private double sou;

    public Professor() {}

    public void canviarSou(double sou) {
        this.sou = sou;
    }

    public String obtenirDades() {
        return super.obtenirDades() + this.dni + " (PROFE amb sou: " + this.sou + ")";
    }

}
