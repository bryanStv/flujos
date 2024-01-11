public class Human implements Comparable<Human>{

    private String nombre;
    private int salario;
    public Human(String nombre,int salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Human{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public int compareTo(Human other){
        return other.getSalario() - this.salario;
    }
}
