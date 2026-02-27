package javacore.Npolimorfismo.teste;

import javacore.Npolimorfismo.dominio.Produto;
import javacore.Npolimorfismo.dominio.Televisao;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args){
        Produto televisao = new Televisao("LG 50 POLEGADAS 4K",2500);
        CalculadoraImposto.calcularImposto(televisao);
    }
}
