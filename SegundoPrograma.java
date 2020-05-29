import java.util.Scanner;

public class SegundoPrograma {

    // - dado um salario
    // - calcular o imposto fixo: 15%
    // - informar o salario liquido

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Matematica bibliotecaMatematica = new Matematica();

        System.out.println("Entre o salario:");
        double salario = leitor.nextDouble();
        System.out.println("Entre o percentual a reter:");
        double percentRetidoIn = leitor.nextDouble();
        
        double fator = bibliotecaMatematica.divisao(percentRetidoIn,100);

        double percentPagoFinal = bibliotecaMatematica.subtracao(1,fator);

        double salarioLiquido = bibliotecaMatematica.multiplica(salario,percentPagoFinal);

        System.out.println("Salario Liquido: "+salarioLiquido);




    }



}