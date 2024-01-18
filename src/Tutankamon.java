import java.util.ArrayList;

public class Tutankamon {
    public static void main(String[] args) {
        ArrayList<Tesoro> listaTesoros = new ArrayList<>();
        listaTesoros.add(new Tesoro("flecha",5,1));
        listaTesoros.add(new Tesoro("sandalias",10,2));
        listaTesoros.add(new Tesoro("sarcofago",1000,1000));
        listaTesoros.add(new Tesoro("mascara",1000,10));
        listaTesoros.add(new Tesoro("arco",10,2));
        listaTesoros.stream().sorted().forEach(System.out::print);
    }
}

class Tesoro implements Comparable<Tesoro>{
    private String nombre;
    private int valor;
    private int peso;

    public String getNombre() {
        return nombre;
    }

    public int getValor() {
        return valor;
    }

    public int getPeso() {
        return peso;
    }

    public Tesoro(String nombre, int valor, int peso){
        this.nombre = nombre;
        this.valor = valor;
        this.peso = peso;
    }
    @Override
    public String toString(){
        return this.nombre + " ";
    }

    @Override
    public int compareTo(Tesoro other){
        if(this.valor == other.getValor()){
            return this.peso - other.getPeso();
        }
        return other.getValor() - this.valor;
    }
}
