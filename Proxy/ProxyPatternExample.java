//Cliente

public class ProxyPatternExample {
    public static void main(String[] args) {
        Image image = new ProxyImage("example.jpg");

        long start = System.currentTimeMillis();

        // Imagem será carregada apenas quando a funcao display() for chamada
        image.display();
        System.out.println("Tempo execução sem Proxy: " + (System.currentTimeMillis() - start) + "\n");

        start = System.currentTimeMillis();
        // Imagem nao precisa ser carregada novamente, esta no cache
        image.display();
        System.out.println("Tempo execução com Proxy: " + (System.currentTimeMillis() - start));
    }
}
