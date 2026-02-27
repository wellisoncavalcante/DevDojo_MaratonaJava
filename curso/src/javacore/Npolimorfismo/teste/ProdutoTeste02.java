package javacore.Npolimorfismo.teste;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Produto;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste02 {
    public static void main(String[] args) {

        Produto produto1 = new Computador("Ryzen 7 58003xD", 2000);
        CalculadoraImposto.calcularImposto(produto1);

        System.out.println("####################################");

        Produto produto2 = new Computador("Ryzen 5 5700", 1200);
        CalculadoraImposto.calcularImposto(produto2);
    }
}
