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

    static void constroeMatriz(Scanner scanner){
        Integer n = scanner.nextInt();
        Integer m = scanner.nextInt();
        Integer matriz[][] = new Integer[n][m];
        ArrayMat.populaMatriz(scanner, matriz, n, m);
        ArrayMat.mostraMatriz(matriz);
    }

    static void soma2Matrizes(Integer[][] matA, Integer[][] matB){
        Integer matC[][] = new Integer[matA.length][matA[0].length];
        for(int i=0; i<matA.length; i++){
            for(int j=0; j<matA[0].length; j++){
                matC[i][j] = matA[i][j] + matB[i][j];
            }
        }
        mostraMatriz(matC);
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

    static void multiplica2Matrizes(Integer[][] matA, Integer[][] matB){
        Integer matC[][] = new Integer[matA.length][matB[0].length];
        System.out.println("\n\n");
        for(int i=0; i<matA.length; i++){
            for(int j=0; j<matB[0].length; j++){
                for(int k=0; k<matA[0].length; k++){
                    matC[i][j] += matA[i][k] * matB[k][j];
                }
            }
        }
        mostraMatriz(matC);
    }

    static void multiplicaMatrizes(Scanner scanner){
        Integer n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        Integer matA[][] = new Integer[n][m];
        ArrayMat.populaMatriz(scanner, matA, n, m);
        Integer matB[][] = new Integer[n][m];
        ArrayMat.populaMatriz(scanner, matB, n, m);
        ArrayMat.multiplica2Matrizes(matA, matB);
    }

     // Método para obter o cofator de uma matriz
     static void calculaCofator(Integer mat[][], Integer temp[][], Integer lin, Integer col, Integer n) {
        int i = 0, j = 0;
        for (int linha = 0; linha < n; linha++) {
            for (int coluna = 0; coluna < n; coluna++) {
                if (linha != lin && coluna != col) {
                    temp[i][j++] = mat[linha][coluna];
                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

    // Método recursivo para calcular o determinante
    static int calculaDeterminante(Integer mat[][], int n) {
        int determinante = 0;
        if (n == 1)
            return mat[0][0];

        Integer temp[][] = new Integer[n][n];
        int positivoNegativo = 1;

        for (int i = 0; i < n; i++) {
            calculaCofator(mat, temp, 0, i, n);
            determinante += positivoNegativo * mat[0][i] * calculaDeterminante(temp, n - 1);
            positivoNegativo = -positivoNegativo;
        }
        return determinante;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer opcao = scanner.nextInt();
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
                Integer n;
                n = scanner.nextInt();
                Integer mat[][] = new Integer[n][n];
                ArrayMat.populaMatriz(scanner, mat, n, n);
                Integer det = calculaDeterminante(mat, n);
                System.out.println(det);
                break;

            //Soma de Matrizes
            case 4:
                ArrayMat.somaMatrizes(scanner);
                break;

            //Multiplicação de Matrizes
            case 5:
                ArrayMat.multiplicaMatrizes(scanner);
                break;
            
            default:
                System.exit(0);
                break;
        }  
        scanner.close();
    }
}
