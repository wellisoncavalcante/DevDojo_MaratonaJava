package javacore.Bintroducaometodos.dominio;

public class Campeao {
    public String nome;
    public String rota;
    public int level;
    public int farm;
    public char sexo;
    public char tier;

    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Rota: "+this.rota);
        System.out.println("Level: "+this.level);
        System.out.println("Farm: "+this.farm);
        System.out.println("Sexo: "+this.sexo);
        System.out.println("Tier: "+this.tier);
    }

}
