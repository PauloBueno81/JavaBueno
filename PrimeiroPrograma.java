import java.util.Scanner;

public class PrimeiroPrograma {
 
    public static void main(String args[]) {
 
        // System.out.println("Olá Tech Inserds");

        // int valorDaMinhaNota = 10;
        // double z = 2.5;

        // System.out.println(valorDaMinhaNota);

        // double resultado = valorDaMinhaNota * z;

        // System.out.println("Resultado da Multiplicacao: "+resultado);


        // System.out.println(z);

        // String nomeDoCurso = "Curso Java DOTI";

        // System.out.println(nomeDoCurso);

        // Boolean ehVerdadeiro = false;

        // System.out.println(ehVerdadeiro);

        // Scanner leitor = new Scanner(System.in);
        // System.out.println("Digite seu nome:");
        // String meuNome = leitor.nextLine();
        // System.out.println("Seja bem vindo "+meuNome+"!");

        // Scanner leitor = new Scanner(System.in);
        // System.out.println("Digite um numero:");
        // double umNumero = leitor.nextDouble();
        // System.out.println("Digite outro numero:");
        // double outroNumero = leitor.nextDouble();

        // double resultadoSoma = umNumero + outroNumero;
        // System.out.println("Soma: "+resultadoSoma);

        // double resultadoSubtracao = umNumero - outroNumero;
        // System.out.println("Subtracao: "+resultadoSubtracao);

        // double resultadoMultiplica = umNumero * outroNumero;
        // System.out.println("Multiplicacao: "+resultadoMultiplica);

        // double resultadoDiv = umNumero / outroNumero;
        // System.out.println("Divisao: "+resultadoDiv);

        Matematica bibliotecaMatematica = new Matematica();

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero:");
        double umNumero = leitor.nextDouble();
        System.out.println("Digite outro numero:");
        double outroNumero = leitor.nextDouble();

        double resultSoma = bibliotecaMatematica.soma(umNumero,outroNumero);
        System.out.println("Soma: "+resultSoma);

        double resultSubtracao = bibliotecaMatematica.subtracao(umNumero,outroNumero);
        System.out.println("Subtracao: "+resultSubtracao);

        double resultMultiplica = bibliotecaMatematica.multiplica(umNumero,outroNumero);
        System.out.println("Multiplicacao: "+resultMultiplica);

        double resultDivisao = bibliotecaMatematica.divisao(umNumero,outroNumero);
        System.out.println("Divisao: "+resultDivisao);

        int umNumeroInt = (int) umNumero;
        int outroNumeroInt = (int) outroNumero;

        int resultDivInt = umNumeroInt / outroNumeroInt;
        System.out.println("Divisao Inteiros: "+resultDivInt);
        int resultMod = bibliotecaMatematica.resto(umNumeroInt,outroNumeroInt);
        System.out.println("Resto: "+resultMod);




    }
 
}