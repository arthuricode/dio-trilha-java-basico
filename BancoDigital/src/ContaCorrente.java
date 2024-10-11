public class ContaCorrente extends Conta {
    private static final double TAXA_SAQUE = 1.0;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public boolean sacar(double valor) {
        double valorComTaxa = valor + TAXA_SAQUE;
        if (valorComTaxa <= saldo) {
            saldo -= valorComTaxa;
            System.out.println("Saque de R$" + valor + " com taxa de R$" + TAXA_SAQUE + " realizado com sucesso!");
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque com taxa.");
            return false;
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        System.out.println("Cliente: " + getCliente().getNome());
        System.out.println("Saldo: R$" + saldo);
    }
}
