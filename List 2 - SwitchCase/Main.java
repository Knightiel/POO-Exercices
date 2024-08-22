// Criar um programa em Java com blocos independentes de código (switch case). O programa deve obedecer a seguinte ordem para cada opção numérica fornecida como entrada:

// 1. Leitura e classificação de um número:

// Leia um número inteiro.
// Se o número for maior que 10, imprima "MAIOR".
// Caso contrário, imprima "MENOR".
// 2. Manipulação de um número:

// Leia um número inteiro.
// Se for múltiplo de 2:
// Multiplique o número por 5.
// Se for múltiplo de 3:
// Subtraia 1 do número.
// Se não for múltiplo de 2 e nem de 3:
// Não faça nada.
// Imprima o resultado final do número.
// 3. Leitura de palavras:

// Leia um número inteiro positivo.
// Leia uma quantidade de palavras (String) igual ao numero informado.
// Imprima as palavras separadas por espaço, da última para a primeira.
// 4. Cálculo do Máximo Divisor Comum (MDC):

// Leia dois números inteiros positivos.
// Calcule o MDC entre os dois números.
// Imprima o MDC.
// 5. Soma de números:

// Leia vários números inteiros até realizar a leitura de um não número.
// Calcule a soma de todos os números lidos.
// Imprima a soma final.
// Observações:

// Todas as impressões devem pular linha.
// Caso um número seja informado ao switch case fora do intervalo permitido, o programa deve simplesmente encerrar a execução. 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t-----MENU-----\n\n1 - Maior ou menor \n2 - Multiplo de 2 ou 3? \n3 - Organizador de palavras \n4 - MDC \n5 - Soma de números");
        System.out.println("Escolha a função desejada: ");
        int opcao = scanner.nextInt();
        int numero;
        switch (opcao) {
            case 1:
                numero = scanner.nextInt();
                if (numero > 10) {
                    System.out.println("MAIOR");
                }else{
                    System.out.println("MENOR");
                }
                break;
            case 2:
                numero = scanner.nextInt();
                if (numero % 2 == 0) {
                    numero = numero * 5;
                }
                if (numero % 3 == 0) {
                    numero = numero - 1;
                }
                System.out.println(numero);
                break;
            case 3:
                String palavras = "";
                numero = scanner.nextInt();
                for (int i = 0; i < numero; i++) {
                    System.out.println("Digite a palavra " + i + ": ");
                    palavras +=  scanner.next() + " ";
                }
                System.out.println(palavras);
                break;
            case 4:
                int num1, num2;
                System.out.println("Digite o primeiro número: ");
                num1 = scanner.nextInt();
                System.out.println("Digite o segundo número: ");
                num2 = scanner.nextInt();
                
            case 5:
                System.out.println("Digite numeros para a soma, para pausar digite qualquer coisa que não seja número: ");
                boolean bool =  true;
                int soma;
                while(bool){
                    
                }
                break;
            
            default:
                System.out.println("Opção inválida, o sistema será finalizado!");
                Thread.sleep(1500);
                System.exit(0);
                break;
        }
    }
}