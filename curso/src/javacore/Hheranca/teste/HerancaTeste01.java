package javacore.Hheranca.teste;

import javacore.Hheranca.dominio.Endereco;
import javacore.Hheranca.dominio.Funcionario;
import javacore.Hheranca.dominio.Pessoa;

public class HerancaTeste01 {
    static void main() {

        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("42060-010");

        Pessoa pessoa = new Pessoa("Wellison Cavalcante");
        pessoa.setCpf("470.125.721-00");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("João Cavalcanti");
        funcionario.setCpf("542.234.234-00");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(3500);
        System.out.println("---------");
        funcionario.imprime();

    }
}
