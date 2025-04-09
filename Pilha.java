public class Pilha {
    private No topo;

    public Pilha() {
        this.topo = null;
    }

    
    public void inserir(String valor) {
        No novo = new No(valor);
        novo.proximo = topo;
        topo = novo;
    }

    public String remover() {
        if (topo == null) {
            return null;
        }
        String dadoRemovido = topo.dado;
        topo = topo.proximo;
        return dadoRemovido;
    }

  
    public void imprimir() {
        No atual = topo;
        System.out.println("Elementos da pilha:");
        while (atual != null) {
            System.out.println(atual.dado);
            atual = atual.proximo;
        }
    }
}
