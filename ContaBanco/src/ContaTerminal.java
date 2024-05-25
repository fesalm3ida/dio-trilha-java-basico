import java.util.Scanner; // 1. Importando a classe Scanner 


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner 

        //Exibir as mensagens para o nosso usuário

        //Obter pela classe scanner os valores digitados n o terminal

        //Exibir a mensagem da conta criada
        Scanner readnumero = new Scanner(System.in);
        Scanner readagencia = new Scanner(System.in);
        Scanner readnomecliente = new Scanner(System.in);

        int Numero;
        String Agencia;
        String NomeCliente;
        double Saldo; 

        Saldo = 237.48;

        System.out.printf("Por favor, insira o numero da conta: ");
        Numero = readnumero.nextInt();
        

        System.out.print("Por favor, insira o numero da agencia: ");
        Agencia = readagencia.nextLine();


        System.out.print("Por favor, insira seu nome completo: ");
        NomeCliente = readnomecliente.nextLine();

        System.out.print("Olá " + NomeCliente + " , obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + " , conta " + Numero + " e seu saldo é: " + Saldo + " , já está disponível para saque." );

    }
}