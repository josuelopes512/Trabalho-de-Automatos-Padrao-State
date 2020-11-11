package state;

public class PedidoAnalise implements PedidosState  {

	@Override
	public PedidosState novoPedido() {
    	System.err.println("INVALIDO: O pedido ja foi feito e esta sendo analisado");
        return this;
    }

	@Override
	public PedidosState analisarPedido() {
	    System.err.println("INVALIDO: Seu pedido esta sendo analizado");
	    return this;
	}

	@Override
	public PedidosState alterarPedido() {
		System.out.println("Os Dados do pedido vai ser alterado");
		return (PedidosState) new PedidoAlterado();
	}

	@Override
	public PedidosState aprovarPedido() {
		System.out.println("O pedido foi Aprovado");
		return (PedidosState) new PedidoAprovado();
	}

	@Override
	public PedidosState transportarPedido() {
		System.err.println("INVALIDO: O pedido precisa precisa ser aprovado antes para ser transportado");
		return this;
	}

	@Override
	public PedidosState entregarPedido() {
		System.err.println("INVALIDO: O pedido precisa ser aprovado antes para ser transportado e entregue");
		return this;
	}

	@Override
	public PedidosState finalizarPedido() {
		System.err.println("INVALIDO: O pedido precisa ser aprovado antes para ser transportado, entregue e finalizado");
		return this;
	}

	@Override
	public PedidosState cancelarPedido() {
		System.out.println("O pedido foi cancelado");
		return (PedidosState) new PedidoCancelado();
	}

	
}