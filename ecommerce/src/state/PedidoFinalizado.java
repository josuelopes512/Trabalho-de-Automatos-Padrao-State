package state;

public class PedidoFinalizado implements PedidosState{

	@Override
	public PedidosState novoPedido() {
		System.out.println("Um novo pedido ja esta sendo feito");
		return (PedidosState) new PedidoNovo();
	}

	@Override
	public PedidosState analisarPedido() {
		System.err.println("INVALIDO: O pedido nao pode ser analizado porque o pedido ja foi finalizado");
		return this;
	}

	@Override
	public PedidosState alterarPedido() {
		System.err.println("INVALIDO: O pedido nao pode ser alterado porque o pedido ja foi finalizado");
		return this;
	}

	@Override
	public PedidosState aprovarPedido() {
		System.out.println("INVALIDO: O pedido ja foi aprovado e ja foi entregue e o pedido ja foi finalizado");
		return this;
	}

	@Override
	public PedidosState transportarPedido() {
		System.out.println("INVALIDO: O pedido ja foi transportado e ja foi entregue e o pedido ja foi finalizado");
		return this;
	}

	@Override
	public PedidosState entregarPedido() {
		System.out.println("INVALIDO: O pedido ja foi entregue e o pedido ja foi finalizado");
		return this;
	}

	@Override
	public PedidosState finalizarPedido() {
		System.out.println("INVALIDO: O pedido ja foi finalizado");
		return this;
	}

	@Override
	public PedidosState cancelarPedido() {
		System.out.println("INVALIDO: O pedido nao pode ser cancelado pelo cliente porque o pedido ja foi finalizado");
		return this;
	}
}
