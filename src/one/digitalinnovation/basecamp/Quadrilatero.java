package one.digitalinnovation.basecamp;

/**
 * Classe de exemplo para o exercício da Aula 2 de Métodos (Sobrecarga).
 */

public class Quadrilatero {

    public static void area(double lado) {
        System.out.println("Área do quadrado:" + lado * lado); // 4 lados iguais --> somente 1 lado.
    }

    public  static void area(double lado1, double lado2) {
        System.out.println("Área do retângulo:" + lado1 * lado2);// Não são iguais, são iguais aos pares --> 2 lados.
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Área do trapézio:" + ((baseMaior+baseMenor)*altura) / 2);
    }

    public static void area(float diagonal1, float diagonal2) {
        System.out.println("Área do losango:" + (diagonal1 * diagonal2) / 2);// Não funciona com double!
    }
}
