package academy.devdojo.maratonajavacore.sobrecargametodos.teste;

import academy.devdojo.maratonajavacore.sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Bleach", "TV", 12);
        anime.setGenero("Ação");
        anime.imprime();

    }
}
