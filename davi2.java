import java.util.Scanner;

public class davi2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int []vetor2 = new int[10];
        int []vetor3 = new int[10];
        int []vetor1 = new int[10];

        for (int i = 0;i < vetor1.length;i++){
            System.out.println("Infome o valor da posição "+i+" do vetor 1: ");
            vetor1[i] = in.nextInt();
        }

        for (int i = 0;i < vetor2.length;i++){
            System.out.println("Infome o valor da posição "+i+" do vetor 2: ");
            vetor2[i] = in.nextInt();
        }

        for (int i = 0;i < vetor3.length;i++){
            vetor3[i] = vetor1[i] + vetor2[i];
            System.out.println("Vetor 1: "+vetor1[i]+", ");
            System.out.println("Vetor 2: "+vetor2[i]+", ");
            System.out.println("Vetor 3: "+vetor3[i]+", ");
        }




    }
}
