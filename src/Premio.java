public class Premio implements Comparable<Premio> {
    private int invertido;
    private int premiado;

    public Premio(int invertido,int premiado){
        this.invertido = invertido;
        this.premiado = premiado;
    }

    public int getInvertido() {
        return invertido;
    }

    public int getPremiado() {
        return premiado;
    }

    @Override
    public String toString() {
        return this.invertido + " " + this.premiado;
    }

    @Override
    public int compareTo(Premio other) {
        if(this.premiado == other.premiado){
            if(this.invertido < other.invertido){
                return other.invertido - this.invertido;
            }else{
                return this.invertido - other.invertido;
            }
        }
        return this.invertido - other.invertido;
    }

}
