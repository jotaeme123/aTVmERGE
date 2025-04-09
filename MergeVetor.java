public class MergeVetor {

    public static int[] mergeQueues(int[] A, int[] B) {
        int nA = A.length;
        int nB = B.length;
        
        int[] C = new int[nA + nB];
        
        int i = 0, j = 0, k = 0;
        
        // Mescla os dois vetores A e B
        while (i < nA && j < nB) {
            if (A[i] <= B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }
        
        // Adiciona os elementos restantes de A, se houver
        while (i < nA) {
            C[k++] = A[i++];
        }
        
        // Adiciona os elementos restantes de B, se houver
        while (j < nB) {
            C[k++] = B[j++];
        }
        
        return C; 
    }

    
    }
