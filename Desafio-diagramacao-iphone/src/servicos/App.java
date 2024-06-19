package servicos;
public class App {
    public static void main(String[] args) {
        
        Iphone iphone = new Iphone();
        iphone.atender();
        iphone.ligar("998272535");
        iphone.adicionarNovaAba();
        iphone.exibirPagina("www.google.com");
    }
}
