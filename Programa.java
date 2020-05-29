import java.util.Scanner;

public class Programa{

public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        Matematica bibliotecaMatematica = new Matematica();

        System.out.println("Entre a nota B1:");
        double notaB1 = leitor.nextDouble();

        System.out.println("Entre a nota B2:");
        double notaB2 = leitor.nextDouble();

        System.out.println("Entre a nota B3:");
        double notaB3 = leitor.nextDouble();

        System.out.println("Entre a nota B4:");
        double notaB4 = leitor.nextDouble();

        double somaNotas = (notaB1 + notaB2 + notaB3 + notaB4);
        
        double mediaApurada = bibliotecaMatematica.divisao(somaNotas,4);

        System.out.println("Media Apurada: "+mediaApurada);



}


}