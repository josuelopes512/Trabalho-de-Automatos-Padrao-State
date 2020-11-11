package state;

public class Pedido {
    protected PedidosState estado;
    

    public Pedido(){
        estado = new PedidoNovo();
    }

    public void novo() {
    	estado = estado.novoPedido();
    }
    
    public void analisar() {
    	estado = estado.analisarPedido();
    }
    
    public void alterar() {
    	estado = estado.alterarPedido();
    }

    public void aprovar(){
        estado = estado.aprovarPedido();
    }

    public void cancelar(){
        estado = estado.cancelarPedido();
    }

    public void transportar(){
        estado = estado.transportarPedido();
    }

    public void entregar(){
        estado = estado.entregarPedido();
    }

    public void finalizar(){
        estado = estado.finalizarPedido();
    } 
}
