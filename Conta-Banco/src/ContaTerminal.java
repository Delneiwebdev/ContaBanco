import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        
        System.out.println("Por favor, digite o número da Conta !");
        int numeroConta = scanner.nextInt();
        System.out.println("Depois ENTER para o próximo campo");
        scanner.nextLine(); 

      
        System.out.println("Por favor, digite o número da Agência !");
        System.out.println("Depois ENTER para o próximo campo");
        int numeroAgencia = scanner.nextInt();
        scanner.nextLine(); 

       
        System.out.println("Digite seu Nome");
        System.out.println("Depois ENTER para o próximo campo");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite seu saldo");
        System.out.println("Depois ENTER para o próximo campo");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia
                + ", Conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

        System.out.println("Detalhes da conta:");
        System.out.println("Número da Agência: " + numeroAgencia);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Saldo da Conta: " + saldo);
        System.out.println("Número da Conta: " + numeroConta);

        scanner.close();
    }
}
