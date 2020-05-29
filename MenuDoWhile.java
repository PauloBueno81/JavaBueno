import java.util.Scanner;

public class MenuDoWhile {
 
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Matematica bibliotecaMatematica = new Matematica();
        double primeiroNum = 0;
        double segundoNum = 0;
        //boolean varSaida = false;
        int varOpcao = 0;
        

        do{

            System.out.println("Entre a opcao:");
            System.out.println("1 - Soma:");
            System.out.println("2 - Subtracao:");
            System.out.println("3 - Multiplicacao:");
            System.out.println("4 - Divisao:");
            System.out.println("5 - Resto:");
            System.out.println("6 - Tabuada:");
            System.out.println("99 - Saida:");
            varOpcao = leitor.nextInt();
        
        
        switch (varOpcao) {
            case 1:
            System.out.println("Entre primeiro numero:");
            primeiroNum = leitor.nextDouble();
            System.out.println("Entre segundo numero:");
            segundoNum = leitor.nextDouble();
            double resultSoma = bibliotecaMatematica.soma(primeiroNum,segundoNum);
            System.out.println("Soma: "+resultSoma);
            break;

            case 2:
            System.out.println("Entre primeiro numero:");
            primeiroNum = leitor.nextDouble();
            System.out.println("Entre segundo numero:");
            segundoNum = leitor.nextDouble();            
            double resultSubtracao = bibliotecaMatematica.subtracao(primeiroNum,segundoNum);
            System.out.println("Subtracao: "+resultSubtracao);
            break;

            case 3:
            System.out.println("Entre primeiro numero:");
            primeiroNum = leitor.nextDouble();
            System.out.println("Entre segundo numero:");
            segundoNum = leitor.nextDouble();            
            double resultMultiplica = bibliotecaMatematica.multiplica(primeiroNum,segundoNum);
            System.out.println("Multiplicacao: "+resultMultiplica);
            break;

            case 4:
            System.out.println("Entre primeiro numero:");
            primeiroNum = leitor.nextDouble();
            System.out.println("Entre segundo numero:");
            segundoNum = leitor.nextDouble();             
            double resultDivisao = bibliotecaMatematica.divisao(primeiroNum,segundoNum);
            System.out.println("Divisao: "+resultDivisao);
            break;

            case 5: //resto
            System.out.println("Entre primeiro numero:");
            primeiroNum = leitor.nextDouble();
            System.out.println("Entre segundo numero:");
            segundoNum = leitor.nextDouble(); 
            int resultMod = bibliotecaMatematica.resto((int)primeiroNum,(int)segundoNum);
            System.out.println("Resto: "+resultMod);
            break;          

            case 6: //tabuada
            System.out.println("Entre com o numero que deseja ver a tabuada:");
            primeiroNum = leitor.nextDouble();  
            int contador = 0;
            for (contador = 0; contador <= 10; contador++){
            double resultMultiplicaTabuada = bibliotecaMatematica.multiplica(primeiroNum,contador);
            System.out.println("Multiplicacao: "+resultMultiplicaTabuada);
            }
            break;

            case 99: //saida
            break;

            default:
            System.out.println("OPCAO INVALIDA");
            break;

            

        }

    }while (varOpcao != 99);
  } 
}