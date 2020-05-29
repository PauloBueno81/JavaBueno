import java.util.Scanner;

public class iBank {
 
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Matematica bibliotecaMatematica = new Matematica();

        //VARIAVEIS
        int varOpcao = 0;
        int vetNumConta[] = new int[50];
        vetNumConta[0] = 2000;
        double vetSaldo[] = new double[50];
        double valorOperacao = 0;
        int numConta = 0;
        double valor = 0;
        int posicao = 0;
        boolean achou = false;
        int numContaDebito = 0;
        int numContaCredito = 0;
        int posicaoDebita = 0;
        int posicaoCredita = 0;


        //COMECO DO PROGRAMA

        do{

            System.out.println("Entre a opcao:");
            System.out.println("1 - Abrir Conta:");
            System.out.println("2 - Sacar:");
            System.out.println("3 - Depositar:");
            System.out.println("4 - Transferir:");
            System.out.println("5 - Exibir Saldo:");
            System.out.println("6 - Sair:");
            varOpcao = leitor.nextInt();
        
        
        switch (varOpcao) {
            case 1: //ABRIR CONTA
            achou = false;
            posicao = 0;            
            while (achou == false){
                if (vetNumConta[posicao] != 0){
                    posicao = posicao + 1;
                }
                else{
                    vetNumConta[posicao] = vetNumConta[posicao-1] + 1;
                    achou = true;
                }
            }
            System.out.println("Aberta a conta de numero: "+vetNumConta[posicao]);
            break;

            case 2: //SACAR DINHEIRO
            achou = false;
            posicao = 0;
            numConta = 0;
            valor = 0;
            System.out.println("Entre com a CONTA:");
            numConta = leitor.nextInt();
            System.out.println("Entre com o VALOR a SACAR:");
            valor = leitor.nextDouble();
            while (achou == false){
                if (vetNumConta[posicao] != numConta){
                    posicao = posicao +1;
                }
                else{
                    vetSaldo[posicao] = vetSaldo[posicao] - valor;
                    achou = true;
                }

            }
            break;

            case 3: //DEPOSITAR DINHEIRO
            achou = false;
            posicao = 0;
            numConta = 0;
            valor = 0;                        
            System.out.println("Entre com a CONTA:");
            numConta = leitor.nextInt();
            System.out.println("Entre com o VALOR a DEPOSITAR:");
            valor = leitor.nextDouble();
            while (achou == false){
                if (vetNumConta[posicao] != numConta){
                    posicao = posicao +1;
                }
                else{
                    vetSaldo[posicao] = vetSaldo[posicao] + valor;
                    achou = true;
                }

            }
            break;

            case 4: //TRANSFEIR
            achou = false;
            valor = 0;
            numContaDebito = 0;
            numContaCredito = 0;
            posicaoDebita = 0;
            posicaoCredita = 0;
            System.out.println("Entre conta de DEBITO:");
            numContaDebito = leitor.nextInt();
            System.out.println("Entre conta de CREDITO:");
            numContaCredito = leitor.nextInt();
            System.out.println("Entre com o VALOR a TRANSFERIR:");
            valor = leitor.nextDouble();
            while (achou == false){
                if (vetNumConta[posicaoDebita] == numContaDebito){
                    posicaoDebita = posicaoDebita;
                    achou = true;
                }
                else{
                    posicaoDebita = posicaoDebita + 1;
                }
            }
            achou = false;
            while (achou == false){
                if (vetNumConta[posicaoCredita] == numContaCredito){
                    posicaoCredita = posicaoCredita;
                    achou = true;
                }
                else{
                    posicaoCredita = posicaoCredita + 1;
                }
            }
            vetSaldo[posicaoDebita] = vetSaldo[posicaoDebita] - valor;
            vetSaldo[posicaoCredita] = vetSaldo[posicaoCredita] + valor;
            break;

            case 5: //SALDO
            achou = false;
            posicao = 0;
            numConta = 0;
            System.out.println("Entre com a CONTA:");
            numConta = leitor.nextInt();            
            while (achou == false){
                if (vetNumConta[posicao] == numConta){
                    achou = true;
                    System.out.print("Saldo da Conta "+numConta+" eh de R$ ");
                    System.out.println(vetSaldo[posicao]);
                }
                else {
                    posicao = posicao + 1;
                }
            }
            break;          

            case 6: //SAIDA
            System.out.println("Ate Breve...");
            break;

            default:
            System.out.println("OPCAO INVALIDA");
            break;

            

        }

    }while (varOpcao != 6);
  } 
}