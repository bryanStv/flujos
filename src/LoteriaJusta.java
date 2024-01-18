import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class LoteriaJusta {
    public static void main(String[] args) {
        ArrayList<Premio> listaLoteria = new ArrayList<>();
        listaLoteria.add(new Premio(9,4));
        listaLoteria.add(new Premio(10,6));
        listaLoteria.add(new Premio(9,5));
        listaLoteria.add(new Premio(1,3));
        mostrarResultado(listaLoteria);

        listaLoteria = new ArrayList<>();
        listaLoteria.add(new Premio(10,5));
        listaLoteria.add(new Premio(20,5));
        listaLoteria.add(new Premio(30,5));
        mostrarResultado(listaLoteria);
    }
    private static void mostrarResultado(ArrayList<Premio> lista){
        System.out.println("Invertido-Premiado");
        System.out.println("-----");
        lista.stream().sorted().forEach(System.out::println);
        System.out.print("Resultado: ");
        if(esJusta(lista)){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
        System.out.println("-----");
    }

    private static boolean esJusta(ArrayList<Premio> lista){
        ordenarLista(lista);
        Premio actual, siguiente;
        boolean resultado = false;
        for(int i = 0; i < lista.size()-1;i++){
            actual = lista.get(i);
            siguiente = lista.get(i+1);
            if(actual.getInvertido() <= siguiente.getInvertido()){
                if (actual.getPremiado() < siguiente.getPremiado()) {
                    resultado = true;
                }else{
                    return false;
                }
            }
        }
        return resultado;
    }

    private static void ordenarLista(ArrayList<Premio> lista){
        Collections.sort(lista);
    }
}

