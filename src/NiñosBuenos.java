import java.util.ArrayList;

public class NiñosBuenos {
    public static void main(String[] args) {
        ArrayList<Reparto> listaNiños = new ArrayList<>();
        listaNiños.add(new Reparto(80,2));
        listaNiños.add(new Reparto(100,12));
        listaNiños.add(new Reparto(100,1));
        //listaNiños.add(new Reparto(2,80));
        //listaNiños.add(new Reparto(2,1));
        imprimir(listaNiños);

        listaNiños = new ArrayList<>();
        listaNiños.add(new Reparto(1,1));
        listaNiños.add(new Reparto(1,1));
        imprimir(listaNiños);
    }
    private static void imprimir(ArrayList<Reparto> lista){
        System.out.println("--------");
        System.out.println("Pt.Bueno-Pt.Peso");
        lista.stream().sorted().forEach(System.out::println);
        System.out.println("--------");
    }
}

class Reparto implements Comparable<Reparto>{
    private int bueno;
    private int peso;
    public Reparto(int bueno,int peso){
        this.bueno = bueno;
        this.peso = peso;
    }
    public int getBueno() {
        return bueno;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public String toString(){
        return this.bueno + "->" + this.peso;
    }
    @Override
    public int compareTo(Reparto other){
        if(this.bueno == other.getBueno()){
            return this.peso - other.getPeso();
        }else{
            return other.getBueno() - this.bueno;
        }
    }

}
