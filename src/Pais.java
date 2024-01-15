public class Pais implements Comparable<Pais>{

    private String country;
    private int valor;
    public Pais(String country,int valor){
        this.country = country;
        this.valor = valor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    @Override
    public String toString(){
        return this.getCountry() + " --> " + this.getValor();
    }
    @Override
    public int compareTo(Pais other){
        return this.valor - other.getValor();
    }
}
