package javacore.Gassociacao.teste;

import javacore.Gassociacao.dominio.Escola;
import javacore.Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Bad Fallen");
        Professor professor2 = new Professor("Good Fallen");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Major", professores);

        escola.imprime();
    }
}
