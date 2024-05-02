package packageProfesor;

public final class Profesor {

     private String nombre;
    private String apellido;
    private double sueldobasico;
    private double sueldototal;
    private String cedula;
    private Provincia provincia;

    public Profesor(String nombre, String apellido, double sueldobasico, String cedula, Provincia provincia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldobasico = sueldobasico;
        this.cedula = cedula;
        this.provincia = provincia;
        calcularSueldoTotal();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void calcularSueldoTotal() {
        this.sueldototal = sueldobasico + (this.sueldobasico * 0.20);
    }

    public double getSueldobasico() {
        return sueldobasico;
    }

    public void setSueldobasico(double sueldobasico) {
        this.sueldobasico = sueldobasico;
    }

    public double getSueldototal() {
        return sueldototal;
    }

    public void setSueldototal(double sueldototal) {
        this.sueldototal = sueldototal;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
@Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + ", apellido=" + apellido + ", sueldobasico=" + sueldobasico + ", sueldototal=" + sueldototal + ", cedula=" + cedula + ", provincia=" + provincia + '}';
    }
}
