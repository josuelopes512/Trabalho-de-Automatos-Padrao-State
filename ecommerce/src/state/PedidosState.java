package state;

public interface PedidosState {
    PedidosState novoPedido();
    PedidosState analisarPedido();
    PedidosState alterarPedido();
    PedidosState aprovarPedido();
    PedidosState transportarPedido();
    PedidosState entregarPedido();
    PedidosState finalizarPedido();
    PedidosState cancelarPedido();
}