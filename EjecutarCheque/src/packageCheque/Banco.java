package packageCheque;

public class Banco {

    private String nombrebanco;
    private int numerosucursales;

    public Banco(String nombrebanco, int numerosucursales) {
        this.nombrebanco = nombrebanco;
        this.numerosucursales = numerosucursales;
    }

    public String getNombrebanco() {
        return nombrebanco;
    }

    public void setNombrebanco(String nombrebanco) {
        this.nombrebanco = nombrebanco;
    }

    public int getNumerosucursales() {
        return numerosucursales;
    }

    public void setNumerosucursales(int numerosucursales) {
        this.numerosucursales = numerosucursales;
    }

    @Override
    public String toString() {
        return "Banco{" + "nombrebanco=" + nombrebanco + ", numerosucursales=" + numerosucursales + '}';
    }
}
