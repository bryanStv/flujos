import java.util.ArrayList;

public class EjC1Salario{
    public static void main(String[] args) {
        ArrayList<Human> humanos = new ArrayList<>();
        humanos.add(new Human("pepe",1000));
        humanos.add(new Human("ana",1600));
        humanos.add(new Human("paco",1500));
        humanos.add(new Human("pedro",1400));
        humanos.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
