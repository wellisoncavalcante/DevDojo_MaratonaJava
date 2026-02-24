package javacore.Bintroducaometodos.teste;

import javacore.Bintroducaometodos.dominio.CalculadoraDesafio02;

import java.util.Scanner;

public class CalculadoraDesafioTeste02 {
    static void main(String[] args) {
        CalculadoraDesafio02 calculadora = new CalculadoraDesafio02();
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int [5];

        System.out.println("Digite 5 números separados por espaço");
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Números digitados: ");

        for(int numero : numeros){
            int dobro = numero * 2;
            System.out.println(numero+" x "+" 2 = "+dobro);
        }
        scanner.close();
    }
}
