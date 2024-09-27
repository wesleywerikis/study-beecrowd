package br.com.weswerikis.beginner;

import java.util.Scanner;

    /**
     * Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável <b>SOMA</b>.
     *
     * <p><b>Entrada:</b></p>
     * O arquivo de entrada contém 2 valores inteiros.
     *
     * <p><b>Saída:</b></p>
     * Imprima a mensagem <b>"SOMA"</b> com todas as letras maiúsculas, com um espaço em branco antes e depois da igualdade seguido pelo valor correspondente à soma de A e B.
     */

public class BEE1003 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int soma = A + B;

        System.out.println("SOMA = " + soma);

        scanner.close();

    }
}
