public class Merge {

   
    public static Fila merge(Fila filaA, Fila filaB) {
        Fila filaC = new Fila(); 
        
        No noA = filaA.inicio;
        No noB = filaB.inicio;


        while (noA != null && noB != null) {
            if (noA.dado.compareTo(noB.dado) <= 0) {
                filaC.insere(noA.dado);
                noA = noA.proximo;
            } else {
                filaC.insere(noB.dado);
                noB = noB.proximo;
            }
        }

        
        while (noA != null) {
            filaC.insere(noA.dado);
            noA = noA.proximo;
        }

    
        while (noB != null) {
            filaC.insere(noB.dado);
            noB = noB.proximo;
        }

        return filaC; 
    }


}