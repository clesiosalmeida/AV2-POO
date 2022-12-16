package Ex01_Banco;

public class ContaPoupanca extends Conta {
    private double rendimento;

    public ContaPoupanca(Cliente cliente, int agencia, int numConta, double saldo, double rendimento) {
        super(cliente, agencia, numConta, saldo);
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    } 

    public void calcularRendimento(){
        setSaldo ((getSaldo())*(1+(this.rendimento/100)));
    }

    
}
