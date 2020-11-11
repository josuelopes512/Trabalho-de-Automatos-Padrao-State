package state;

public class Cliente {
    public static void main(String[] args) {
        Pedido notebook = new Pedido();
        notebook.analisar();
        notebook.alterar();
        notebook.aprovar();
        notebook.transportar();
        notebook.entregar();
        notebook.finalizar();
        
        
        
    }
}
