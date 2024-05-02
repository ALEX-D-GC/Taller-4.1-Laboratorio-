package packageEstudiante;

public final class Estudiante {

    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;
    private Universidad universidad;

    public Estudiante(String nombre, double nota1, double nota2, double nota3, Universidad universidad) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.universidad = universidad;
        calcularPromedio();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void calcularPromedio() {
        this.promedio = ((this.nota1 + this.nota2 + this.nota3) / 3);
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    @Override
    public String toString() {
        return "El estudiante " + " nombre = " + nombre + ", nota1 = " + nota1 + ", nota2 = " + nota2 + ", nota3 = " + nota3 + ", su promedio = " + promedio + ", universidad = " + universidad + '.';
    }

}
