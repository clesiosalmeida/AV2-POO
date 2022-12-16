package Ex01_Banco;

public class Conta {

    private Cliente cliente;
    private int agencia; 
    private int numConta; 
    private double saldo;
    
    public Conta(Cliente cliente, int agencia, int numConta, double saldo) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //atribui valor ao saldo; 
    public void depositar(double v){
        if (v>0)
            saldo = saldo + v;
        }
    
        //retira valor em saldo;
        public boolean sacar(double v){
        if ( v>0 && ((saldo-v) >= 0) ){
            saldo = saldo - v;
            return true;
        }
        else
            return false;
        }
        
        public double consultarSaldo(){
            return(saldo);
        }
}
