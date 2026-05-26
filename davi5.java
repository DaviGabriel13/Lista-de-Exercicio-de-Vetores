import java.util.Scanner;

public class davi5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int []vetor = new int[10];
        int valor;

        for (int i = 0;i < vetor.length;i++){
            System.out.println("Informe o valor na posição "+(i+1)+" do vetor");
            vetor[i] = in.nextInt();
        }
        System.out.println("Digite um valor para verificar se está presente no vetor: ");
        valor = in.nextInt();

        for (int i = 0;i < vetor.length;i++){
            if (vetor[i] == valor){
                System.out.println("Existe esse valor na posição "+(i+1)+"º");
                break;
            }
            if (i == vetor.length - 1 && vetor[i] != valor){
                System.out.println("O valor não consiste no vetor");
            }
        }
    }
}
