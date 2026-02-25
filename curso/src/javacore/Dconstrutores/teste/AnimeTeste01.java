package javacore.Dconstrutores.teste;


import javacore.Dconstrutores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "Tv", 12,"Esporte", "Studio Ghibli");
        anime.imprime();
    }
}
