package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersona;

    //bloque estatico -> ejecuta UNA VEZ
    //se ejecuta antes del constructor
    //ejecuta SOLO la primera vez que se cargue en memoria
    static{
        System.out.println("ejecucion bloque estatio");
        //no se puede utilizar el this -> contexto estatico
        ++Persona.contadorPersona;
        //idpersona no puede ser utiliada xq estoy en un contexto estatico
    }

    //coontexo NO estatico /contexto dinamico -> ejecuta N veces
    //ejecuta entes del constructor de la clase -> cada vezx que creemos un nuevo objeto
    {
        System.out.println("Ejecucion bloque NO estatico");
        this.idPersona = Persona.contadorPersona++;

    }

    public Persona(){
        System.out.println("ejecucion del contructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                '}';
    }
}
