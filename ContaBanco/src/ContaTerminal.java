import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        /**Como a "agencia" foi criada em um lugar específico deixei como valor padrão */
        int conta;
        int agencia = 1234;
        String nome;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem Vindo, vamos criar sua conta!?");
        System.out.println("Digite um número para ser sua conta: ");
        conta = scanner.nextInt();
        System.out.println("Digite nome: ");
        nome = scanner.next();
        System.out.println("Quanto deseja depositar para a abertura de conta?");
        saldo = scanner.nextDouble();

        System.out.println("\"Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + conta + " e seu saldo de " + saldo + " já está disponível para saque\".");

    }
}
