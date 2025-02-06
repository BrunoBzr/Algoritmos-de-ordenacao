import java.util.Random;

public class Main {
    public static void main(String[] args) {

        MergeShort algoritmo = new MergeShort();

        int[] vetor = new int[10];


        Random rand = new Random();
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = rand.nextInt(100);
        }

        System.out.println("Vetor não ordenado");
        for(int i = 0; i < vetor.length; i++){
            if(i == vetor.length-1){
                System.out.print(vetor[i] + "\n");
            }else{
                System.out.print(vetor[i] + " - ");
            }
        }

        algoritmo.mergeShort(vetor, 0, vetor.length-1);

        System.out.println("Vetor  ordenado");
        for(int i = 0; i < vetor.length; i++){
            if(i == vetor.length-1){
                System.out.print(vetor[i]);
            }else{
                System.out.print(vetor[i] + " - ");
            }
        }
    }
}