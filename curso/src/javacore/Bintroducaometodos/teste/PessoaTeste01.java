package javacore.Bintroducaometodos.teste;

import javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Kaneki");
        pessoa.setIdade(17);
        pessoa.imprime();
    }
}
