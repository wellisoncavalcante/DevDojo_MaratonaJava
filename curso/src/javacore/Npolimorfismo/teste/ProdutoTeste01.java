package javacore.Npolimorfismo.teste;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Notebook;
import javacore.Npolimorfismo.dominio.Televisao;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
   public static void main(String[] args) {
        Computador computador = new Computador("RTX 4070", 5000);
        Notebook notebook = new Notebook("MacBook Air Pro", 8000);
        Televisao tv = new Televisao("Samsung 50\" ", 3000);
       CalculadoraImposto.calcularImposto(computador);
       System.out.println("-------------------------------------");
       CalculadoraImposto.calcularImposto(notebook);
       System.out.println("######################################");
       CalculadoraImposto.calcularImposto(tv);
    }
}
