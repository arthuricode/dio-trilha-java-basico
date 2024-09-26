import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
         Scanner terminal = new Scanner(System.in);
        
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt(); // Capturando o primeiro número do terminal
        
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt(); // Capturando o segundo número do terminal
        
        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        
        } catch (ParametrosInvalidosException exception) {
            // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(exception.getMessage());
        }

        terminal.close();
    }

    // Método de contagem com a validação de parâmetros
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Realizar o for para imprimir os números com base na variável contagem
        int contagem = parametroDois - parametroUm; // Diferença entre os dois parâmetros
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
