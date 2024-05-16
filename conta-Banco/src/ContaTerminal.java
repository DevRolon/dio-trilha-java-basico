import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Conhecer e importar a classe scanner
        //Exibir as msgs p/ o usuario
        // Obter pela classe sacar os valores digitados no terminal
        // Exibir a msg da conta criada

         @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next(); 

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();
        
        System.out.println("Digite o número da Agência");
        String agencia = scanner.next();

        System.out.println("Digite o número da Conta");
        int numeroConta = scanner.nextInt();  
        
        System.out.println("Valor de depósito");
        double saldo = scanner.nextDouble(); 

      
        System.out.println("Olá " + nome + " " + sobrenome );
        System.out.println("Obrigado por criar uma conta em nosso banco, sua agência é " + agencia);
        System.out.println("Conta " + numeroConta );
        System.out.println("E seu saldo " + saldo );
        System.out.println("E já está disponível para saque!");

    }
}
