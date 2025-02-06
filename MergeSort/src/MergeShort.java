public class MergeShort extends Merge{
    public void mergeShort(int[] vetor, int inicio, int fim){

        if(inicio < fim){ //Ponto de parada da recursão
            int meio = inicio + (fim - inicio) / 2;
            mergeShort(vetor, inicio, meio);
            mergeShort(vetor, meio + 1, fim);
            merge(vetor, inicio, meio, fim);
        }
    }
}
