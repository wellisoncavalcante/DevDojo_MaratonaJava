package javacore.Bintroducaometodos.teste;

import javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Wellison");
        funcionario.setIdade(22);
        funcionario.setSalarios(new double[]{1200, 1500, 1800});
        funcionario.imprime();
    }
}