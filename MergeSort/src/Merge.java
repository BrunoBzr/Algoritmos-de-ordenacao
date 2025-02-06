public class Merge {
    public void merge(int[] vetor, int inicio, int meio, int fim) {


        int tamVetorDaEsquerda = meio - inicio + 1;
        int tamVetorDaDireita = fim - meio;

        int[] L = new int[tamVetorDaEsquerda];
        int[] R = new int[tamVetorDaDireita];

        for (int i = 0; i < tamVetorDaEsquerda; i++)
            L[i] = vetor[inicio + i];

        for (int j = 0; j < tamVetorDaDireita; j++)
            R[j] = vetor[meio + 1 + j];

        int i = 0, j = 0, k = inicio;
        while (i < tamVetorDaEsquerda && j < tamVetorDaDireita) {
            if (L[i] <= R[j]) {
                vetor[k] = L[i];
                i++;
            } else {
                vetor[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < tamVetorDaEsquerda) {
            vetor[k] = L[i];
            i++;
            k++;
        }

        while (j < tamVetorDaDireita) {
            vetor[k] = R[j];
            j++;
            k++;
        }
    }
}
