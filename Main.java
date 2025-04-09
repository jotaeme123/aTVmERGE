public class Main {
    public static void main(String[] args) {
        
        Pilha pilha = new Pilha();

        System.out.println("PILHA ABAIXO:\n");
        System.out.println("\n");
        pilha.inserir("Elemento A");
        pilha.inserir("Elemento B");
        pilha.inserir("Elemento C");

        pilha.imprimir(); 

        System.out.println("Removido: " + pilha.remover());

        pilha.imprimir(); 
        System.out.println("\n");
        // fila
        Fila fila = new Fila();
        System.out.println("FILA ABAIXO:\n");
        System.out.println("\n");
        fila.insere("Elemento A");
        fila.insere("Elemento B");
        fila.insere("Elemento C");

        fila.imprime(); 

        fila.remove();  
        fila.imprime();
        System.out.println("\n"); 

        // merge 
        System.out.println("MERGE ABAIXO:\n");
        System.out.println("\n");
        Fila filaA = new Fila();
        Fila filaB = new Fila();

        filaA.insere("Elemento A");
        filaA.insere("Elemento C");
        filaA.insere("Elemento E");

        filaB.insere("Elemento B");
        filaB.insere("Elemento D");
        filaB.insere("Elemento F");

        System.out.print("Fila A antes da fusão: ");
        System.out.println("\n");
        filaA.imprime(); 
        System.out.println("\n");

        System.out.print("Fila B antes da fusão: ");
        System.out.println("\n");
        filaB.imprime(); 
        System.out.println("\n");

        Fila filaC = Merge.merge(filaA, filaB);

        filaC.imprime();

        /// merge com vetor
        
        int[] A = {1, 3, 5, 7};
        int[] B = {2, 4, 6, 8};
        System.out.println("\n");
        System.out.println("MERGE COM VETORES ABAIXO:\n");
        System.out.print("Fila A: ");
        System.out.println("\n");
        for (int elem : A) {
            System.out.print(elem + " ");
        }
        System.out.println();  
        
        System.out.print("Fila B: ");
        System.out.println("\n");
        for (int elem : B) {
            System.out.print(elem + " ");
        }
        System.out.println(); 
        
        // Corrigido a chamada para mergeQueues da classe MergeVetor
        int[] C = MergeVetor.mergeQueues(A, B);
        
        System.out.print("Fila C: ");
        for (int elem : C) {
            System.out.print(elem + " ");
        }
    }
}
