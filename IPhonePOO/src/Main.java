public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Usando o Reprodutor Musical
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocar();
        meuIphone.pausar();

        // Usando o Aparelho Telefônico
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.desligar();

        // Usando o Navegador de Internet
        meuIphone.exibirPagina("www.example.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
