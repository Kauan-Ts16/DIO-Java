import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // INICIO DO PROGRAMA

        System.out.println("--- Bem Vindo ao Banco DIO --- \n");

        // COLETANDO INFORMAÇÕES DO CLIENTE

        System.out.print("Insira o seu Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Insira o número da sua Conta: ");
        int numero = scanner.nextInt();

        System.out.print("Insira o número da Agencia: ");
        String agencia = scanner.next();

        System.out.print("Informe o seu Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("\n Olá "+ nome + ", obrigado por criar uma conta em nosso banco. \n Sua agência é "+ agencia + ", conta " + numero + " e seu saldo " + saldo + "R$ já está disponível para saque.");

        scanner.close();
    }
}