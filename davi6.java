import java.util.Scanner;

public class davi6 {
    public static void main(String[] args) {
        int anterior = 0,proximo = anterior +1,quantidade;

        Scanner in = new Scanner(System.in);

        System.out.println("Informe a quantidade de valores da sequencia fibonnaci: ");
        quantidade = in.nextInt();
        int []vetor = new int[quantidade];
        for (int i = 0;i < quantidade;i++){
            vetor[i] = proximo;
            proximo = anterior + proximo;
            anterior = vetor[i];


        }
        for (int i = 0;i < vetor.length;i++){
            System.out.print(" "+vetor[i]);
        }
    }
}
