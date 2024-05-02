package packageProfesor;

public class Provincia {

    private String nombre;
    private int habitantes;

    public Provincia(String nombre, int habitantes) {
        this.nombre = nombre;
        this.habitantes = habitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    @Override
    public String toString() {
        return "Provincia{" + "nombre=" + nombre + ", habitantes=" + habitantes + '}';
    }
}
