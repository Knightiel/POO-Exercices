public class Ex1{
    public static void main(String[] args) {
        //Cria e inicializa uma variável vazia do tipo String
        String sequencia = "";
        //laço de repetição que concatena todos os números entre 0 a 100
        for(int i=0;i<=100;i++){
            sequencia += i + " ";
        }
        //mostra na tela toda a sequencia
        System.out.println(sequencia);
    }
}
