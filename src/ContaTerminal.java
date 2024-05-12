import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double saldo = 0 ;
        
        System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Digite o número da agencia:");
        String agencia = scanner.next();
        
        System.out.println("Digite o nome do clinte:");
        String nomeCliente = scanner.next();

        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numeroConta +" e seu saldo "+ saldo +" já está disponível para saque") ;
    }
}
1