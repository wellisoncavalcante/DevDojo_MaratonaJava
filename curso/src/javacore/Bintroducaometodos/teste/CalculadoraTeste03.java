package javacore.Bintroducaometodos.teste;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.divideDoisNumeros(0,10);
        System.out.println(resultado);
        System.out.println(calculadora.divideDoisNumeros(0,10));
    }
}
