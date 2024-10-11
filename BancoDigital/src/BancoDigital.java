public class BancoDigital {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Miguel Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("João Almeida", "987.654.321-00");

        ContaCorrente contaCorrente = new ContaCorrente(cliente1);
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente2);

        Banco banco = new Banco();
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        contaCorrente.depositar(1000);
        contaCorrente.sacar(200);
        contaCorrente.transferir(contaPoupanca, 300);
        contaPoupanca.aplicarRendimento();

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        banco.listarClientes();
    }
}
