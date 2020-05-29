import java.util.Scanner;

public class p10706impares {
 
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Matematica bibliotecaMatematica = new Matematica();

        double primeiroNum = 0;
        double resultadoResto = 0;
        int contador = 0;

        System.out.print("Entre o numero: ");
        primeiroNum = leitor.nextDouble();

        while  (contador < 6){
            resultadoResto = bibliotecaMatematica.resto((int)primeiroNum,2);
            if (resultadoResto != 0){
                contador = contador + 1;
                System.out.println("Numero impar: "+(int)primeiroNum);
                primeiroNum = primeiroNum + 1;
            }
            else{
                primeiroNum = primeiroNum + 1;
            }


        }







    }
}