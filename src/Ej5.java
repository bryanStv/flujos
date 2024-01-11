import java.util.ArrayList;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        int numero;
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner tc = new Scanner(System.in);
        while(true){
            System.out.print("Escribe una numero(negativo para salir): ");
            numero = tc.nextInt();
            if(numero < 0){
                tc.close();
                numeros.stream()
                        .filter(n -> n <= 5)
                        .forEach(System.out::println);
                System.exit(0);
            }
            numeros.add(numero);
        }
    }
}
