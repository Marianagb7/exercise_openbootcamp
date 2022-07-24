package ejercicio_ocho.src;

public class Principal {
    public static void main(String[] args) {
        Persona persona=new Persona();
        persona.setNombre("Miguel");
        persona.setTelefono("3175986213");
        persona.setEdad(28);

        System.out.println("Nombre de la persona: "+persona.getNombre()+"\n"+"teléfono: "+persona.getTelefono()+
                "\n" +"edad: " +persona.getEdad());






    }
}
