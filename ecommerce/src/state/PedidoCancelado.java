package state;

public class PedidoCancelado implements PedidosState{

	@Override
	public PedidosState novoPedido() {
		System.out.println("O pedido ja esta sendo feito de novo");
		return (PedidosState) new PedidoNovo();
	}

	@Override
	public PedidosState analisarPedido() {
		System.err.println("INVALIDO: Nao e possivel analizar o pedido porque ele ja foi cancelado");
		return this;
	}

	@Override
	public PedidosState alterarPedido() {
		System.err.println("INVALIDO: Nao e possivel alterar o pedido porque ele ja foi cancelado");
		return this;
	}

	@Override
	public PedidosState aprovarPedido() {
		System.err.println("INVALIDO: O pedido foi cancelado nao sera necessario aprovar-lo");
		return this;
	}

	@Override
	public PedidosState transportarPedido() {
		System.err.println("INVALIDO: O pedido foi cancelado nao sera necessario transportar-lo");
		return this;
	}

	@Override
	public PedidosState entregarPedido() {
		System.err.println("INVALIDO: O pedido foi cancelado nao sera necessario entregar-lo");
		return this;
	}

	@Override
	public PedidosState finalizarPedido() {
		System.err.println("INVALIDO: O pedido foi cancelado nao sera necessario finalizar");
		return this;
	}

	@Override
	public PedidosState cancelarPedido() {
		System.err.println("INVALIDO: O pedido ja foi cancelado");
		return this;
	}
}
