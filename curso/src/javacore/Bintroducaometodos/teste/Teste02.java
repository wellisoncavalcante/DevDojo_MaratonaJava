package javacore.Bintroducaometodos.teste;

import java.util.Scanner;

public class Teste02 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lista[] = new int[3];

        System.out.println("Digite 3 números separados por espaço: ");
        for(int i = 0; i < lista.length ; i++){
            lista[i] = scanner.nextInt();
        }
        System.out.println("Números digitados: ");
        for(int listaNumeros : lista){
            System.out.println(listaNumeros);
        }
    }
}


