import java.util.ArrayList;

public class Ej2 {
    public static void main(String[] args) {
        ArrayList<Person> personas = new ArrayList<>();
        personas.add(new Person("Ana","Apellido1",1969));
        Person persona = new Person("Pepe", "García", 1968);
        personas.add(persona);
        persona = new Person("María", "García", 1998);
        personas.add(persona);
        persona = new Person("Alejandro", "Martínez", 1968);
        personas.add(persona);

        long empiezanPorA = personas.stream()
                .filter(p -> p.getFirstName().startsWith("A"))
                .count();
        System.out.printf("Las personas que empiezan por una A son %d",empiezanPorA);
    }
}
