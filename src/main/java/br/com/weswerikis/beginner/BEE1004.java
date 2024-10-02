package br.com.weswerikis.beginner;

import java.util.Scanner;

    /**
     * LLeia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável <b>PROD</b>.
     * A seguir mostre a variável <b>PROD</b> com mensagem correspondente.
     * <p><b>Entrada:</b></p>
     * O arquivo de entrada contém 2 valores inteiros.
     *
     * <p><b>Saída:</b></p>
     * Imprima a mensagem <b>"PROD"</b> e a variável <b>PROD</b>.
     */

public class BEE1004 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int vlr1, vlr2;
        int produto;

        vlr1 = scanner.nextInt();
        vlr2 = scanner.nextInt();

        produto = vlr1 * vlr2;

        System.out.println("PROD = " + produto);

        scanner.close();
    }
}
