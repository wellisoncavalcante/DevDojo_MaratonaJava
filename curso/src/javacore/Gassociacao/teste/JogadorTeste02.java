package javacore.Gassociacao.teste;

import javacore.Gassociacao.dominio.Jogador;
import javacore.Gassociacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Fallen");
        Time furia = new Time("Furia");
        jogador1.setTime(furia);
        jogador1.imprime();
    }
}
