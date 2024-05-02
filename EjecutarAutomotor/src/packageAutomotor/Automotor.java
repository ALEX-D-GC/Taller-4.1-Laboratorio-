package packageAutomotor;

public class Automotor {

    private String cedula;
    private Fabricante fabricante;
    private int anofabricacion;
    private double valorvehiculo;
    private double valormatricula;

    public Automotor() {
    }

    public Automotor(String cedula, Fabricante fabricante, int anofabricacion, double valorvehiculo) {
        this.cedula = cedula;
        this.fabricante = fabricante;
        this.anofabricacion = anofabricacion;
        this.valorvehiculo = valorvehiculo;
        calcularValorMatricula();
    }

    public void calcularValorMatricula() {
        this.valormatricula = (0.00002 * this.valorvehiculo) * (2023 - anofabricacion);
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public int getAnofabricacion() {
        return anofabricacion;
    }

    public void setAnofabricacion(int anofabricacion) {
        this.anofabricacion = anofabricacion;
    }

    public double getValorvehiculo() {
        return valorvehiculo;
    }

    public void setValorvehiculo(double valorvehiculo) {
        this.valorvehiculo = valorvehiculo;
    }

    public double getValormatricula() {
        return valormatricula;
    }

    public void setValormatricula(double valormatricula) {
        this.valormatricula = valormatricula;
    }

    @Override
    public String toString() {
        return String.format("""
                             Automotor
                              Cedula: %s%s
                              Ano de Fabricacion: %d
                              Valor del Vehiculo: %.2f
                              Valor de la Matricula: %.2f""",
                this.getCedula(), this.getFabricante(), this.getAnofabricacion(), this.getValorvehiculo(), this.getValormatricula());
    }
}
