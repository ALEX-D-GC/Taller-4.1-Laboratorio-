package packageCheque;

public class Cheque {

    private Cliente cliente;
    private Banco banco;
    private double valorcheque;
    private double comisionbanco;

    public Cheque(Cliente cliente, Banco banco, double valorcheque) {
        this.cliente = cliente;
        this.banco = banco;
        this.valorcheque = valorcheque;

    }

    public void calcularComisionbanco() {
        this.comisionbanco = this.valorcheque * 0.00003;

    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public double getValorcheque() {
        return valorcheque;
    }

    public void setValorcheque(double valorcheque) {
        this.valorcheque = valorcheque;
    }

    public double getComisionbanco() {
        return comisionbanco;
    }

    public void setComisionbanco(double comisionbanco) {
        this.comisionbanco = comisionbanco;
    }

    @Override
    public String toString() {
        return String.format("""
                             Cheque
                              %s
                              %s
                              Valor del Cheque: %.2f
                              Comision que Cobra el Banco: %.2f""",
                this.getCliente(), this.getBanco(), this.getValorcheque(), this.getComisionbanco());
    }
}
