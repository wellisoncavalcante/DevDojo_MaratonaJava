package javacore.Aintroducaoclasses.teste;

import javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
     static void main () {

        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Palio";
        carro01.marca = "Fiat";
        carro01.ano = 2012;

        carro02.nome = "ID.7 Tourer";
        carro02.marca = "Volkswagen";
        carro02.ano = 2026;
        System.out.println("Carro 01");
        System.out.println(carro01.nome);
        System.out.println(carro01.marca);
        System.out.println(carro01.ano);
        System.out.println("\nCarro 02");
        System.out.println(carro02.nome);
        System.out.println(carro02.marca);
        System.out.println(carro02.ano);

    }
}
