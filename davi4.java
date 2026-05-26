import java.util.Scanner;

public class davi4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int []vetor1 = new int[10];
        int []vetor2 = new int[10];

        for (int i = 0;i < vetor1.length;i++){
            System.out.println("Infome o valor da posição "+i+" do vetor 1: ");
            vetor1[i] = in.nextInt();

        }
        System.out.println("Vetor 1: ");
        for (int i = 0;i < vetor1.length;i++){
            System.out.print(" "+vetor1[i]);
        }


        for (int i = 0;i<vetor2.length;i++){
            int valorInvertido = vetor1.length - i - 1;
            vetor2[i] = vetor1[valorInvertido];

        }
        System.out.println(" ");
        System.out.println("Vetor 2: ");
        for (int i = 0;i < vetor2.length;i++){
            System.out.print(" "+vetor2[i]);
        }
    }
}
