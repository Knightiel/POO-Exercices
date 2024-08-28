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
    
    static Integer[][] populaMatriz(Scanner scanner, Integer[][] matriz, Integer n, Integer m){
        for(int i=0; i<n; i++){
            for(int j=0;j<m; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }
        return matriz;
    }

    static void mostraMatriz(Integer[][] matriz){
        for (Integer[] linha : matriz) {
            for(Integer elemento : linha){
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    static void ordenacao(Scanner scanner){
        Integer n = scanner.nextInt();
        Integer sequencia[] = new Integer[n];
        for(int i=0; i<n; i++) {
            sequencia[i] = scanner.nextInt();
        }
        Arrays.sort(sequencia);
        for (Integer numeros : sequencia) {
            System.out.print(numeros + " ");
        }
    }

    static void soma2Matrizes(Integer[][] matA, Integer[][] matB){
        Integer[][] matC = new Integer[matA.length][matA[0].length];
        for(int i=0; i<matA.length; i++){
            for(int j=0; j<matA[0].length; j++){
                matC[i][j] = matA[i][j] + matB[i][j];
            }
        }
        mostraMatriz(matC);
    }

    static void multiplica2Matrizes(Integer[][] matA, Integer[][] matB){
        Integer[][] matC = new Integer[matA.length][matB[0].length];
    }

    static void constroeMatriz(Scanner scanner){
        Integer n = scanner.nextInt();
        Integer m = scanner.nextInt();
        Integer matriz[][] = new Integer[n][m];
        ArrayMat.populaMatriz(scanner, matriz, n, m);
        ArrayMat.mostraMatriz(matriz);
    }

    static void somaMatrizes(Scanner scanner){
        Integer n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        Integer matA[][] = new Integer[n][m];
        ArrayMat.populaMatriz(scanner, matA, n, m);
        Integer matB[][] = new Integer[n][m];
        ArrayMat.populaMatriz(scanner, matB, n, m);
        ArrayMat.soma2Matrizes(matA, matB);
    }

    static void multiplicaMatrizes(Scanner scanner){
        Integer n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        Integer matA[][] = new Integer[n][m];
        ArrayMat.populaMatriz(scanner, matA, n, m);
        Integer matB[][] = new Integer[n][m];
        ArrayMat.populaMatriz(scanner, matB, n, m);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer opcao = scanner.nextInt();
        Integer n, m;
        switch (opcao) {
            //Ordenação
            case 1:
                ArrayMat.ordenacao(scanner);
                break;
            
            //Construção de Matriz
            case 2:
                ArrayMat.constroeMatriz(scanner);
                break;
                
            //Determinante da Matriz
            case 3:
                
                break;

            //Soma de Matrizes
            case 4:
                ArrayMat.somaMatrizes(scanner);
                break;

            //Multiplicação de Matrizes
            case 5:
                multiplicaMatrizes(scanner);
                break;
            
            default:
            System.exit(0);
                break;
        }  
        scanner.close();
    }
}
