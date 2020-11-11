package state;

public class PedidoEmTransporte implements PedidosState{

	@Override
	public PedidosState novoPedido() {
		System.err.println("INVALIDO: O pedido ja foi feito e esta em transporte");
		return this;
	}

	@Override
	public PedidosState analisarPedido(){
		System.err.println("INVALIDO: O pedido ja foi analisado e foi aprovado");
		return this;
	}

	@Override
	public PedidosState alterarPedido() {
		System.err.println("INVALIDO: Nao e possivel alterar o pedido depois de ter sido aprovado");
		return this;
	}

	@Override
	public PedidosState aprovarPedido() {
		System.err.println("INVALIDO:  O pedido ja foi aprovado");
		return this;
	}

	@Override
	public PedidosState transportarPedido() {
		System.err.println("INVALIDO: O pedido ja foi transportado");
		return this;
	}

	@Override
	public PedidosState entregarPedido() {
		System.out.println("O pedido esta sendo entregue");
		return (PedidosState) new PedidoEntregue();
	}

	@Override
	public PedidosState finalizarPedido() {
		System.err.println("INVALIDO: O pedido precisa ser entregue para finalizar");
		return this;
	}

	@Override
	public PedidosState cancelarPedido() {
		System.err.println("INVALIDO: O pedido nao pode ser cancelado pelo cliente");
		return this;
	}

	



}
