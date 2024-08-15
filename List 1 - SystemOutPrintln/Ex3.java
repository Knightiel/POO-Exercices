public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Expressão utilizada: (X e Y) ou Z");

        //Apenas printa todas as combinações possíveis de resultados da tabela verdade da expressão acima
        System.out.println("(true e true) ou true = " + ((true && true) || true));
        System.out.println("(true e true) ou false = " + ((true && true) || false));
        System.out.println("(true e false) ou true = " + ((true && false) || true));
        System.out.println("(true e false) ou false = " + ((true && false) || false));

        System.out.println("(false e true) ou true = " + ((false && true) || true));
        System.out.println("(false e false) ou true = " + ((false && false) || true));
        System.out.println("(false e true) ou false = " + ((false && true) || false));
        System.out.println("(false e false) ou false = " + ((false && false) || false));
        
    }
}
