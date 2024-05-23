import domain.PersonaBean;

public class TetstExepciones {
    public static void main(String[] args) {

        PersonaBean persona = new PersonaBean();
        persona.setNombre("Luis");
        persona.setApellido("Perez");
        System.out.println(persona);

    }
}