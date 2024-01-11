import java.util.ArrayList;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        String cadena;
        ArrayList<String> cadenas = new ArrayList<>();
        Scanner tc = new Scanner(System.in);
        while(true){
            System.out.print("Escribe una cadena: ");
            cadena = tc.nextLine();
            if(cadena.isEmpty()){
                tc.close();
                cadenas.stream()
                        .forEach(System.out::println);
                System.exit(0);
            }
            cadenas.add(cadena);
        }
    }
}
