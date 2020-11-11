package state;

public class PedidoNovo implements PedidosState {

	@Override
	public PedidosState novoPedido() {
		System.err.println("INVALIDO: O pedido ja esta sendo feito");
		return this;
	}
	
	@Override
	public PedidosState analisarPedido() {
		System.out.println("Seu pedido esta sendo analisado");
		return (PedidosState) new PedidoAnalise();
	}

	@Override
	public PedidosState alterarPedido() {
		System.err.println("INVALIDO: Seu pedido nao foi analizado e nao esta apto para ser alterado");
		return this;
	}
	
	@Override
	public PedidosState aprovarPedido() {
		System.err.println("INVALIDO: O pedido precisa ser analisado para ser aprovado");
		return this;
	}

	@Override
	public PedidosState transportarPedido() {
		System.err.println("INVALIDO: O pedido precisa ser analisado para ser aprovado antes para ser transportado");
		return this;
	}

	@Override
	public PedidosState entregarPedido() {
		System.err.println("INVALIDO: O pedido precisa ser analisado para ser aprovado antes para ser transportado e entregue");
		return this;
	}

	@Override
	public PedidosState finalizarPedido() {
		System.err.println("INVALIDO: O pedido precisa ser analisado para ser aprovado antes para ser transportado, entregue e finalizado");
		return this;
	}

	@Override
	public PedidosState cancelarPedido() {
		System.out.println("O pedido foi cancelado");
		return (PedidosState) new PedidoCancelado();
	}


	
}
