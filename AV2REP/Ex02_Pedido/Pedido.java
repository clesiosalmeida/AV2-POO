package Ex02_Pedido;

public class Pedido {
    private int numeroPedido;
    private int dataHoraPedido;
    private int precoTotal;
    private int statusPedido;
    
    public Pedido(int numeroPedido, int dataHoraPedido, int precoTotal, int statusPedido) {
        this.numeroPedido = numeroPedido;
        this.dataHoraPedido = dataHoraPedido;
        this.precoTotal = precoTotal;
        this.statusPedido = statusPedido;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public int getDataHoraPedido() {
        return dataHoraPedido;
    }

    public void setDataHoraPedido(int dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public int getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(int precoTotal) {
        this.precoTotal = precoTotal;
    }

    public int getStatusPedido() {
        return statusPedido;
    }

    

    public void alterarStatus(int statusPedido) {
        this.statusPedido = statusPedido;
    } 


}
