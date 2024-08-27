/*Criar um programa em Java com blocos independentes de código (switch case). O programa deve obedecer a seguinte ordem para cada opção numérica fornecida como entrada:


1. Ordenação:

Leia um número inteiro positivo n. 
Em seguida, leia uma sequência de n números inteiros. 
Imprima os números em ordem crescente, com um espaçamento simples entre cada número.
2. Construção de Matriz

Leia dois números inteiros positivos, n e m. 
Em seguida leia uma quantidade de n × m números. 
Considere esses números como elementos de uma matriz:
n representa as linhas de uma matriz.
m representa as colunas de uma matriz.
Imprima a matriz de forma convencional:
Os números da mesma linha devem estar separados por espaços. 
Ao imprimir o último número de uma linha, faça uma quebra de linha.
3. Determinante da Matriz

Leia um número inteiro positivo n. 
Em seguida leia uma quantidade de n² números. 
Considere esses números como elementos de uma matriz quadrada (An×n). 
Calcule e imprima o determinante da matriz.
4. Soma de Matrizes

Faça a leitura de duas matrizes:
Matriz An×m.
Matriz Bn×m.
Some as matrizes A e B.
Imprima a matriz resultante C da soma.
5. Multiplicação de Matrizes

Faça a leitura de duas matrizes:
Inicialmente leia um número m e n.
Depois leia a Matriz An×m.
Depois leia a Matriz Bm×n.
Multiplique as matrizes A e B.
Imprima a matriz resultante C da multiplicação.
Observações:

Todas as impressões devem pular linha.
O código deve priorizar a utilização de tipos orientadas a objetos (obs: Integer ao invés de int, contudo em algumas situações a utilização de tipos primitidos é permitida, 
usando-os dentro de laços de repetição por exemplo). O não cumprimento dessa regra resultará em descontos na nota final, mesmo que o sistema avalie seu código com nota 10 (dez). 
Caso um número seja informado ao switch case fora do intervalo permitido, o programa deve simplesmente encerrar a execução. 
 */

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer opcao = scanner.nextInt();
        Integer n, m;
        switch (opcao) {
            //Ordenação
            case 1:
                n = scanner.nextInt();
                Integer sequencia[] = new Integer[n];
                for(int i=0; i<n; i++) {
                    sequencia[i] = scanner.nextInt();
                }
                Arrays.sort(sequencia);
                for (Integer numeros : sequencia) {
                    System.out.print(numeros + " ");
                }
                break;
            
            //Construção de Matriz
            case 2:
                n = scanner.nextInt();
                m = scanner.nextInt();
                Integer matriz[][] = new Integer[n][m];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        matriz[i][j] = scanner.nextInt();
                    }
                }
                for (Integer[] linha : matriz) {
                    for(Integer elemento : linha){
                        System.out.print(elemento + " ");
                    }
                    System.out.println();
                }
                break;
                
            //Determinante da Matriz
            case 3:
                
                break;

            //Soma de Matrizes
            case 4:
                
                break;

            //Multiplicação de Matrizes
            case 5:
                
                break;
            
            default:
            System.exit(0);
                break;
        }  
        scanner.close();
    }
}
