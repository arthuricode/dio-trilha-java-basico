import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void listarClientes() {
        System.out.println("=== Clientes do Banco ===");
        for (Conta conta : contas) {
            System.out.println(conta.getCliente());
        }
    }

    public Conta buscarContaPorCliente(String cpf) {
        for (Conta conta : contas) {
            if (conta.getCliente().getCpf().equals(cpf)) {
                return conta;
            }
        }
        System.out.println("Conta não encontrada para o CPF: " + cpf);
        return null;
    }
}
