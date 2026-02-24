package javacore.Bintroducaometodos.teste;

import java.util.Scanner;

public class CalculadoraDesafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println("Não é um número primo.");
        } else {
            boolean isPrimo = true;
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    isPrimo = false;
                }
                break;
            }
            if (isPrimo){
                System.out.println(numero+" é um número primo");
            } else {
                System.out.println(numero+" não é um número primo");
            }
        }
        scanner.close();
    }
}
