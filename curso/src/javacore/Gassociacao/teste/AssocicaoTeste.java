package javacore.Gassociacao.teste;

import javacore.Gassociacao.dominio.Aluno;
import javacore.Gassociacao.dominio.Local;
import javacore.Gassociacao.dominio.Professor;
import javacore.Gassociacao.dominio.Seminario;

public class AssocicaoTeste {
    public static void main(String[] args) {
        Local local = new Local("UFRPE");
        Aluno aluno = new Aluno("Wellison", 22);
        Professor professor = new Professor("Fallen", "IGL");
        Aluno[] alunos = {aluno};

        Seminario seminario = new Seminario("Aprendendo FLASH", alunos, local);

        Seminario[] seminarios = {seminario};

        professor.setSeminarios(seminarios);

        professor.imprime();
    }
}
