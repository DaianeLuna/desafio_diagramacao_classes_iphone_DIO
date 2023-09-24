package Musicas;

public class pausar {

    private String pausandoMusica;

    public pausar(String pausandoMusica) {
        this.pausandoMusica = pausandoMusica;
    }

    public String getPausandoMusica() {
        return pausandoMusica;
    }

    @Override
    public String toString() {
        return "pausar{" +
                "pausandoMusica='" + pausandoMusica + '\'' +
                '}';
    }
}
