import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o Número da Conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite a Agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o Nome do Cliente: ");
        String nomecliente = scanner.next();

        System.out.println("Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nomecliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero +  " e seu saldo " + saldo + " já está disponível para saque");




    }
}
