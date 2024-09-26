import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Criando um objeto Scanner para capturar as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando o número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha

        // Solicitando o número da agência
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        // Solicitando o nome do cliente
        System.out.print("Por favor, digite o Nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        // Solicitando o saldo da conta
        System.out.print("Por favor, digite o saldo da Conta: ");
        double saldo = scanner.nextDouble();

        // Construindo a mensagem com concatenação
        String mensagem = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia)
                .concat(", conta ")
                .concat(String.valueOf(numero))
                .concat(" e seu saldo ")
                .concat(String.valueOf(saldo))
                .concat(" já está disponível para saque.");

        // Exibindo a mensagem final
        System.out.println(mensagem);

        // Fechando o scanner
        scanner.close();
    }
}
