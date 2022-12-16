package Ex01_Banco;

public class ContaCorrente extends Conta{

    private double taxa;

    public ContaCorrente(Cliente cliente, int agencia, int numConta, double saldo, double taxa) {
        super(cliente, agencia, numConta, saldo);
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    } 

    
    
}
