package javacore.Csobrecargametodos.teste;

import javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Boku no Hero", "Tv", 12);
        anime.init("Boku no Hero", "Tv", 12, "Ação");
        anime.imprime();
    }
}
