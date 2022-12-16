package Ex02_Pedido;


public class PedidoItens {
    private String itemPedido; 
    private int qtdeItensPedido; 
    private int vrItensPedido;

    

    public PedidoItens(String itemPedido, int qtdeItensPedido, int vrItensPedido) {
        this.itemPedido = itemPedido;
        this.qtdeItensPedido = qtdeItensPedido;
        this.vrItensPedido = vrItensPedido;
    }
    public String getItemPedido() {
        return itemPedido;
    }
    public void setItemPedido(String itemPedido) {
        this.itemPedido = itemPedido;
    }
    public int getQtdeItensPedido() {
        return qtdeItensPedido;
    }
    public void setQtdeItensPedido(int qtdeItensPedido) {
        this.qtdeItensPedido = qtdeItensPedido;
    }
    public int getVrItensPedido() {
        return vrItensPedido;
    }
    public void setVrItensPedido(int vrItensPedido) {
        this.vrItensPedido = vrItensPedido;
    }
    
 

    
}
