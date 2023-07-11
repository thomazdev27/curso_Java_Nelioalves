import java.util.Scanner;

//Exercício resolvido
//Fazer um programa para ler um número inteiro N e uma matriz de
//ordem N contendo números inteiros. Em seguida, mostrar a diagonal
//principal e a quantidade de valores negativos da matriz.
//21/07/2018
//33
//Example
//Input: Output:
//3
//5 -3 10
//15 8 2
//7 9 -4
//Main diagonal:
//5 8 -4
//Negative numbers = 2

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal:");
        for (int i=0; i<mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("Negative numbers = " + count);


        sc.close();

    }
}