import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Paises {
    public static void main(String[] args) {
        try{
            BufferedReader file = new BufferedReader(new FileReader("files/illiterate.csv"));
            ArrayList<Pais> listaPaises = new ArrayList<>();
            String linea;
            String pais;
            int iletrados;
            String[] tabla;

            linea = file.readLine();
            while((linea = file.readLine()) != null){
                tabla = linea.split(",");
                pais = tabla[5];
                iletrados = 0;
                try {
                    String valor = tabla[8];

                    iletrados = Integer.parseInt(valor);
                }catch (NumberFormatException e){

                   int a = 1;
                }
                Pais persona = new Pais(pais,iletrados);
                listaPaises.add(persona);
            }

            listaPaises.stream().sorted().forEach(System.out::println);

        }catch (FileNotFoundException e){
            System.out.println("Archivo no extiste");
        } catch (IOException e) {
            System.out.println("Error en entrada");
        }
    }
}
