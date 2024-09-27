package br.com.weswerikis.beginner;

import java.util.Scanner;

    /**
     * A fórmula para calcular a área de uma circunferência é: <b>area = π . raio2</b>. Considerando para este problema que <b>π = 3.14159</b>:
     * - Efetue o cálculo da área, elevando o valor de <b>raio</b> ao quadrado e multiplicando por <b>π</b>.
     *
     * <p><b>Entrada:</b></p>
     * A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável <b>raio</b>.
     *
     * <p><b>Saída:</b></p>
     * Apresentar a mensagem "A=" seguido pelo valor da variável <b>area</b>.
     */

public class BEE1002 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

            final double PI = 3.14159;

            double raio = scanner.nextDouble();
            double area = PI * Math.pow(raio, 2);

            System.out.printf("A=%.4f%n", area);

        scanner.close();

    }
}
