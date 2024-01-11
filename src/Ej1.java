import java.util.ArrayList;

public class Ej1 {
    public static void main(String[] args) {
        ArrayList<Person> personas = new ArrayList<>();
        personas.add(new Person("P1","A1",1969));
        Person persona = new Person("Pepe", "García", 1968);
        personas.add(persona);
        persona = new Person("María", "García", 1998);
        personas.add(persona);
        persona = new Person("Juan", "Martínez", 1968);
        personas.add(persona);

        long contar = personas.stream()
                .filter(person -> person.getBirthYear() < 1970)
                .count();
        System.out.println("El número de personas necidas antes de 1970 son "+contar);
    }
}
