package Musicas;

public class tocar {

    private String tocandoMusica;

    public tocar(String tocandoMusica) {
        this.tocandoMusica = tocandoMusica;
    }

    public String getTocandoMusica() {
        return tocandoMusica;
    }

    @Override
    public String toString() {
        return "tocar{" +
                "tocandoMusica='" + tocandoMusica + '\'' +
                '}';
    }
}
