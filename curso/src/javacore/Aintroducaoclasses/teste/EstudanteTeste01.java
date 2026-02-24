package javacore.Aintroducaoclasses.teste;

import javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        estudante01.nome = "Naruto";
        estudante01.idade = 12;
        estudante01.sexo = 'M';

        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);
    }
}
