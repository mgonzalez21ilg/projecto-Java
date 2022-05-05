package ilgg;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {

        //profeSubstitut.iniciarSubstitucio(dataInici, dataFi);


        Institut ins = new Institut();
        ins.canviarNom("Institut La Guineueta");

        String cole = ins.obtenirDades();
        System.out.println(cole);



        Persona p1 = new Persona();
        Persona p2 = new Persona();

        p1.canviarNom("Manu");
        p2.assignarDni("41548342N");

        String dades = p1.obtenirDades();
        String Dni = p2.canviarDni();
        System.out.println(dades + Dni);
        System.out.println(Dni);


        p1.canviarNom("Pepe");
        ProfessorSubstiut profe2 = new ProfessorSubstiut();
        profe2.canviarNom("Antonio");
        Date dataInici = new Date(2021, 11, 1);
        Date dataFi = new Date(2022, 6, 30);
        profe2.assignarDni("11");
        dades = profe2.obtenirDades();

        System.out.println( dades +  " , " +
                dataInici.getDate() + "/" + dataInici.getMonth() + "/" + dataInici.getYear() +" al " +
                dataFi.getDate() + "/" + dataFi.getMonth() + "/" + dataFi.getYear() + ")" );

        Estudiant e = new Estudiant();
        e.posarNota(9.9);
        e.canviarNom("Ash");
        e.assignarDni("48931468L");
        dades = e.obtenirDades();
        System.out.println(dades);

        Professor p = new Professor();
        p.canviarNom("Pep");

        p.canviarSou(150.55);
        p.assignarDni("42342534H");
        dades = p.obtenirDades();
        System.out.println(dades);


    }
}
