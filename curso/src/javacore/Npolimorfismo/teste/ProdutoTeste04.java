package javacore.Npolimorfismo.teste;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Notebook;
import javacore.Npolimorfismo.dominio.Produto;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste04 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        Notebook notebook = new Notebook("MacBook", 5500);
        notebook.setArmazenamento("1TB");
        CalculadoraImposto.calcularImposto(notebook);
        System.out.println("-------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
