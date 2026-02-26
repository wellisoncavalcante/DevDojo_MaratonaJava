package javacore.Hheranca.teste;

import javacore.Hheranca.dominio.Funcionario;

public class HerancaTeste02 {
    // 0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar a classe pai.
    // 1 - Bloco de inicialização estático da sub classe é executado quando a JVM carregar a classe filha.
    // 2 - Alocado espaço em memoria para o objeto da super classe
    // 3 - Cada atributo da super classe é criado e inicializado com valores default ou o quer for passado
    // 4 - Bloco de inicialização da super classe é executado na ordem em que aparece.
    // 5 - Construtor da super classe é executado
    // 6 - Alocado espaço em memoria para o objeto da subclasse
    // 7 - Cada atributo de sub classe é criado e inicializado com valores default ou o quer for passado
    // 8 - Bloco de inicialização da sub classe é executado na ordem em que aparece
    // 9 - Construtor é executado da sub classe
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Kakashi");
    }
}
