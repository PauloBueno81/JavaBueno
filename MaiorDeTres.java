import java.util.Scanner;

public class MaiorDeTres {
 
    // A partir de três numeros digitados
    // Indicar qual é o maior deles
 
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Matematica bibliotecaMatematica = new Matematica();

        System.out.println("Entre a nota B1:");
        double notaB1 = leitor.nextDouble();

        System.out.println("Entre a nota B2:");
        double notaB2 = leitor.nextDouble();

        System.out.println("Entre a nota B3:");
        double notaB3 = leitor.nextDouble();

        if ((notaB1 > notaB3) && (notaB1 > notaB2)){
            System.out.println("Maior numero: "+notaB1);
        }
        else if ((notaB2 > notaB3) && (notaB2 > notaB1)){
            System.out.println("Maior numero: "+notaB2);
        }
        else if ((notaB3 > notaB1) && (notaB3 > notaB2)){
            System.out.println("Maior numero: "+notaB3);
        }

 
    }
 
}