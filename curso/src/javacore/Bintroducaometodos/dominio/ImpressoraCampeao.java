package javacore.Bintroducaometodos.dominio;

public class ImpressoraCampeao {
    public void imprime(Campeao campeao) {
        System.out.println("---------");
        System.out.println("Nome: "+campeao.nome);
        System.out.println("Rota: "+campeao.rota);
        System.out.println("Level: "+campeao.level);
        System.out.println("Farm: "+campeao.farm+" cs");
        System.out.println("Sexo: "+campeao.sexo);
        System.out.println("Tier: "+campeao.tier);
    }
}
