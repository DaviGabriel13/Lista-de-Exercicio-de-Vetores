import java.util.Scanner;

public class davi9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] altura = new double[50];
        String[] aluno = new String[50];
        char[] codigo = new char[50];
        double maior = altura[0],menor=altura[0];
        double alturaHomens=0;
        double alturaMulheres=0,alturaTurma=0;
        String[] mulheresAltas = new String[50];
        String[] homensBaixos = new String[50];
        String[] pessoasBaixas = new String[50];
        double mediaHomens,mediaMulheres,mediaTurma;
        int contHomens =0,contMulheres=0;
        int posicaoMulheres = 0,posicaoHomens=0,posicaoPessoas=0;

        for (int i = 0;i< aluno.length;i++){
            System.out.println("Informe o nome do aluno "+(i+1)+":");
            aluno[i] = in.next();
            System.out.println("Informe a altura do aluno "+aluno[i]+":");
            altura[i] = in.nextDouble();
            System.out.println("Informe o código do sexo do aluno: (1 para masculino e 2 para feminino)");
            codigo[i] = in.next().charAt(0);
            while (codigo[i] != '1' && codigo[i] != '2'){
                System.out.println("Digite um código de sexo válido: ");
                codigo[i] = in.next().charAt(0);
            }
            if (i == 0) {
                maior = altura[i];
                menor = altura[i];
            }
            if (codigo[i]=='1'){
                contHomens++;
                alturaHomens+= altura[i];

            }else{
                contMulheres++;
                alturaMulheres += altura[i];
            }
            alturaTurma+=altura[i];
            if (altura[i]>=maior){
                maior = altura[i];
            }
            if (altura[i]<= menor){
                menor = altura[i];
            }
        }
        mediaTurma = alturaTurma/ aluno.length;
        mediaHomens = (contHomens > 0) ? alturaHomens / contHomens : 0;
        mediaMulheres = (contMulheres > 0) ? alturaMulheres / contMulheres : 0;

        for (int i = 0;i<aluno.length;i++){
            if (codigo[i]=='2'&&altura[i]>mediaHomens){
                mulheresAltas[posicaoMulheres] = aluno[i];
                posicaoMulheres++;
            }
            if (codigo[i]=='1'&&altura[i]<mediaMulheres){
                homensBaixos[posicaoHomens] = aluno[i];
                posicaoHomens++;
            }
            if (altura[i]<mediaTurma){
                pessoasBaixas[posicaoPessoas] = aluno[i];
                posicaoPessoas++;
            }
        }
        System.out.println("a) Maior altura: "+maior+" Menor altura: "+menor+" Média da turma: "+mediaTurma);
        System.out.println("b) Mulheres acima da média dos homens: ");
        for (int i = 0;i<mulheresAltas.length;i++){
            if (mulheresAltas[i]!= null){
                System.out.println(mulheresAltas[i]);
            }

        }
        System.out.println("c) Os homens com altura abaixo da média da altura das mulheres: ");
        for (int i = 0;i<homensBaixos.length;i++){
            if (homensBaixos[i]!= null){
                System.out.println(homensBaixos[i]);
            }

        }
        System.out.println("d) As pessoas com altura abaixo da média da turma: ");
        for (int i = 0;i<pessoasBaixas.length;i++){

            if (pessoasBaixas[i]!= null){
                System.out.println(pessoasBaixas[i]);
            }
        }


    }
}
