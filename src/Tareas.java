public class Tareas implements Comparable<Tareas>{
    private int tarea;
    private int duracion;
    @Override
    public int compareTo(Tareas other){
        return this.tarea - other.tarea;
    }
}
