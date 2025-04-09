public class Fila {
    protected No inicio;
    protected No fim;

  
    public boolean estaVazia() {
        return inicio == null;
    }

   
    public void insere(String dado) {
        No novoNo = new No(dado);

        if (estaVazia()) {
            inicio = fim = novoNo;
        } else {
            fim.proximo = novoNo; 
            fim = novoNo; 
        }
    }

    
    public String remove() {
        if (estaVazia()) {
            return null; 
        }

        String valorRemovido = inicio.dado; 
        inicio = inicio.proximo;

        if (inicio == null) { 
            fim = null; 
        }

        return valorRemovido; 
    }

    
    public void imprime() {
        if (estaVazia()) {
            System.out.println("Fila vazia");
            return;
        }

        StringBuilder sb = new StringBuilder("Fila: ");
        No atual = inicio;

        while (atual != null) {
            sb.append(atual.dado).append(" "); 
            atual = atual.proximo;
        }

        System.out.println(sb.toString().trim()); 
    }
}



