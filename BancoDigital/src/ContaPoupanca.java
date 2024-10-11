public class ContaPoupanca extends Conta {
    private static final double RENDIMENTO = 0.005;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void aplicarRendimento() {
        saldo += saldo * RENDIMENTO;
        System.out.println("Rendimento de " + (RENDIMENTO * 100) + "% aplicado. Novo saldo: R$" + saldo);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        System.out.println("Cliente: " + getCliente().getNome());
        System.out.println("Saldo: R$" + saldo);
    }
}
