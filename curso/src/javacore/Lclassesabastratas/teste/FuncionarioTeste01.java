package javacore.Lclassesabastratas.teste;

import javacore.Lclassesabastratas.dominio.Desenvolvedor;
import javacore.Lclassesabastratas.dominio.Gerente;

public class FuncionarioTeste01 {
public static void main(String[] args){
    Gerente gerente = new Gerente("Baiano", 20000);
    System.out.println(gerente);
    Desenvolvedor desenvolvedor = new Desenvolvedor("Absolut", 5000);
    System.out.println(desenvolvedor);
    gerente.imprime();
    desenvolvedor.imprime();
}
}
