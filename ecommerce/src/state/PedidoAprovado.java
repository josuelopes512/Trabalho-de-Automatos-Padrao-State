package state;

public class PedidoAprovado implements PedidosState {

    @Override
    public PedidosState novoPedido() {
    	System.err.println("INVALIDO: O pedido ja foi feito e foi aprovado");
        return this;
    }

    @Override
	public PedidosState analisarPedido() {
		System.err.println("INVALIDO: O pedido ja foi analisado e foi aprovado");
		return this;
	}

	@Override
	public PedidosState alterarPedido() {
		System.err.println("INVALIDO: O pedido ja foi aprovado e nao pode ser alterado");
		return this;
	}

    @Override
    public PedidosState aprovarPedido() {
    	System.err.println("INVALIDO: O pedido ja foi aprovado");
        return this;
    }

    @Override
    public PedidosState transportarPedido() {
        System.err.println("Seu pedido esta em Transporte");
        return (PedidosState) new PedidoEmTransporte();
    }

    @Override
    public PedidosState entregarPedido() {
        System.err.println("INVALIDO: O pedido precisa ser transportado antes");
        return this;
    }

    @Override
    public PedidosState finalizarPedido() {
        System.err.println("INVALIDO: O pedido precisa ser transportado antes depois ser entregado e so depois eh finalizado");
        return this;
    }

	@Override
	public PedidosState cancelarPedido() {
		System.out.println("O pedido foi cancelado, e estornado o dinheiro");
		return (PedidosState) new PedidoCancelado();
	}
}
