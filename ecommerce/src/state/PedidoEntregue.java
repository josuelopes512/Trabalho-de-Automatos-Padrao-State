package state;

public class PedidoEntregue implements PedidosState{

	@Override
	public PedidosState novoPedido() {
		System.out.println("INVALIDO: O pedido ja foi feito e ja foi entregue");
		return this;
	}

	@Override
	public PedidosState analisarPedido(){
		System.err.println("INVALIDO: O pedido ja foi analizado e foi entregue");
		return this;
	}

	@Override
	public PedidosState alterarPedido() {
		System.err.println("INVALIDO: O pedido nao pode ser alterado porque ja foi entregue");
		return this;
	}

	@Override
	public PedidosState aprovarPedido() {
		System.out.println("INVALIDO: O pedido ja foi aprovado e ja foi entregue");
		return this;
	}

	@Override
	public PedidosState transportarPedido() {
		System.out.println("INVALIDO: O pedido ja foi transportado e ja foi entregue");
		return this;
	}

	@Override
	public PedidosState entregarPedido() {
		System.out.println("INVALIDO: O pedido ja foi aprovado e ja foi entregue");
		return this;
	}

	@Override
	public PedidosState finalizarPedido() {
		System.out.println("O pedido foi finalizado");
		return (PedidosState) new PedidoFinalizado();
	}

	@Override
	public PedidosState cancelarPedido() {
		System.out.println("INVALIDO: O pedido nao pode ser cancelado pelo cliente porque ja foi entregue");
		return this;
	}
}
