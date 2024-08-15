// Desenvolva um programa em Java capaz de imprimir os números da sequência de Fibonacci até 100 
// (não é para imprimir os cem primeiros números da sequência, apenas é para imprimir os números até o próximo ultrapassar cem). 
// Os números devem ser separados por espaços, e não deve haver quebra de linha entre eles.

public class Ex4 {
    public static void main(String[] args) {
        String sequenciaFibonacci = "";
        int i=0, j=1, valorAtual=0;
        sequenciaFibonacci = i + " " + j + " ";
        while(true){
            valorAtual = i + j;
            if(valorAtual>100){
                break;
            }else{
                i = j;
                j = valorAtual;
                sequenciaFibonacci += valorAtual + " ";
            }
        }
        System.out.println(sequenciaFibonacci);
    }
}
