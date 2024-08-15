// Desenvolva um programa em Java capaz de imprimir todos os números primos menores que 100. 
// Os números devem ser separados por espaços, e não deve haver quebra de linha entre eles (o número 1 NÃO É PRIMO).

public class Ex5 {
    public static void main(String[] args) {
        String numeros_primos = "";
        for(int i=2; i<100; i++){
            boolean eh_primo = true;
            for(int j=2; j<i; j++){
                if(i % j == 0) {
                    eh_primo = false;
                }
            }
            if (eh_primo) {
                numeros_primos += i + " ";
            } 
        }
        System.out.println(numeros_primos);
    }
}