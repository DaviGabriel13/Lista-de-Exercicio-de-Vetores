import java.util.Scanner;

public class davi1 {
    public static void main(String[] args) {
        int []idade = new int[40];
        int contMenor16 = 0, contMaior16 = 0,mediaIdades,somaIdades = 0,novo,velho;
        Scanner in = new Scanner(System.in);
        novo = idade[0];
        velho = idade[0];
        for (int i = 0; i < idade.length;i++){
            System.out.println("Informe o valor da idade do aluno "+(i+1)+":");
            idade[i] = in.nextInt();
            if (i == 0) {
                novo = idade[i];
                velho = idade[i];
            }
            if (idade[i]>= velho){
                velho = idade[i];
            }
            if (idade[i] <= novo){
                novo = idade[i];
            }
            if (idade[i]<= 16){
                contMenor16 ++;
            }else {
                contMaior16 ++;
            }
            somaIdades += idade[i];

        }
        mediaIdades = somaIdades/idade.length;

        System.out.println("a) Total de alunos com idade menor ou igual a 16 anos: "+contMenor16);
        System.out.println("b) Total de alunos com idade maior que 16 anos: "+contMaior16);
        System.out.println("c) Média das idades: "+mediaIdades);
        System.out.println("d) Idade do aluno mais novo: "+novo);
        System.out.println("e) Idade do aluno mais velho: "+velho);
    }
}
