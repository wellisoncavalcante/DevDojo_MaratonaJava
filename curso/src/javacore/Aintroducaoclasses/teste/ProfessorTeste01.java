package javacore.Aintroducaoclasses.teste;

import javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {


        Professor professor = new Professor();
        professor.nome = "Goku";
        professor.idade = 20;
        professor.sexo = 'M';

        System.out.print(professor.nome + " " + professor.idade + " " + professor.sexo);

    }
}
