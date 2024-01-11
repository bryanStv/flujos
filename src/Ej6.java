import java.util.ArrayList;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        int contador = 1,nacimiento;
        ArrayList<Person> personas = new ArrayList<>();
        Scanner tc = new Scanner(System.in);
        String nombre,apellido;
        Person persona;
        while(true){
            System.out.printf("Vamos a crear la persona %d\n",contador);
            System.out.print("Dime el nombre de la persona: ");
            nombre = tc.nextLine();
            if(nombre.isEmpty()){
                personas.stream()
                        .map(Person::getLastName)
                        .distinct()
                        .sorted()
                        .forEach(System.out::println);
            }
            System.out.print("Dime el apellido de la persona: ");
            apellido = tc.nextLine();
            System.out.print("Dime el año de nacimiento: ");
            nacimiento = Integer.parseInt(tc.nextLine());
            persona = new Person(nombre,apellido,nacimiento);
            personas.add(persona);
            contador++;
        }
    }
}
