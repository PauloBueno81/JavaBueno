import java.util.Scanner;

public class MaiorDeN {
 
    public static void main(String[] args) {

        // O usuario vai digitar quantos numeros ele quer comparar
        // O usuario vai digitar por N vezes (sendo o numero que ele escolheu)
        // Sistema comprar todos os numeros digitados, e encontrar o maior

        Scanner leitor = new Scanner(System.in);

        System.out.println("Entre a qtd de numeros que deseja comparar:");
        int qtdNumeros = leitor.nextInt();

        double vetor[]= new double[qtdNumeros];

        for (int indice = 0; indice < qtdNumeros; indice++){
            System.out.println("Entre o numero da posicao: "+indice+":");
            vetor[indice] = leitor.nextDouble();

        }

        double maiorNumero;
        maiorNumero = vetor[0];
        // sugestao JC: ja q a minha variavel maiorNumero ja recebeu o valor da posicao 0,
        // então o indice no for já pode comecar pela posicao 1.
        for (int indice = 1; indice < vetor.length; indice++){
            if (vetor[indice] >= maiorNumero){
                maiorNumero = vetor[indice];
            }
        }

        System.out.println("Maior numero: "+maiorNumero);







    } 

}