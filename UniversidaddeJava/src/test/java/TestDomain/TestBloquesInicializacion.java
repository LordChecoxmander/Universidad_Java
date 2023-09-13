package TestDomain;

import domain.Persona;

public class TestBloquesInicializacion {
    public static void main(String[] args) {
        Persona personal = new Persona();
        System.out.println("personal = "+personal.toString());
        Persona persona2 = new Persona();
        System.out.println("persona2 = "+persona2.toString());
    }
}
