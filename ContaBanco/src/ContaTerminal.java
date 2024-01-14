import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta");
        int numeroDaConta = scanner.nextInt();

        System.out.println("Por favor, digite seu Nome: ");
        String nome = scanner.nextLine();
        if (nome.length()==0) {
            nome = scanner.nextLine();
        }
        System.out.println("Por favor, digite o saldo inicial");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco sua agência é " + agencia
                + ", conta " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque");
        scanner.close();
    }
}
