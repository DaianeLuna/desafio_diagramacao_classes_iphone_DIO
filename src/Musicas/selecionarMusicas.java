package Musicas;

public class selecionarMusicas {

    private String selecionandoMusicas;

    public selecionarMusicas(String selecionandoMusicas) {
        this.selecionandoMusicas = selecionandoMusicas;
    }

    public String getSelecionandoMusicas() {
        return selecionandoMusicas;
    }

    @Override
    public String toString() {
        return "selecionarMusicas{" +
                "selecionandoMusicas='" + selecionandoMusicas + '\'' +
                '}';
    }
}
