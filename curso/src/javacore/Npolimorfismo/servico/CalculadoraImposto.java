package javacore.Npolimorfismo.servico;

import javacore.Npolimorfismo.dominio.Notebook;
import javacore.Npolimorfismo.dominio.Produto;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de pagamento!");
        double imposto = produto.calcularImposto();
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto: " + imposto);
        if (produto instanceof Notebook) {
            Notebook notebook = (Notebook) produto;
            System.out.println(notebook.getArmazenamento());
        }
    }
}

