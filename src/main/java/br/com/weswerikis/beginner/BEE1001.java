package br.com.weswerikis.beginner;

import java.util.Scanner;

    /**
     * Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B atribuindo o seu resultado na variável X.
     *
     * <p><b>Entrada:</b></p>
     * A entrada contém 2 valores inteiros.
     *
     * <p><b>Saída:</b></p>
     * Imprima a mensagem "X = " (letra X maiúscula) seguido pelo valor da variável X e pelo final de linha.
     */

public class BEE1001 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int X = A + B;

        System.out.println("X = " + X);

        scanner.close();
    }
}