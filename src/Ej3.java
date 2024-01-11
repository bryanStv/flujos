import java.util.ArrayList;

public class Ej3 {
    public static void main(String[] args) {
        ArrayList<Person> personas = new ArrayList<>();
        personas.add(new Person("Ana","Apellido1",1969));
        Person persona = new Person("Pepe", "García", 1968);
        personas.add(persona);
        persona = new Person("María", "García", 1998);
        personas.add(persona);
        persona = new Person("Alejandro", "Martínez", 1968);
        personas.add(persona);
        persona = new Person("Alejandro", "Martínez2", 1968);
        personas.add(persona);

        personas.stream()
                .map(Person::getFirstName)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
