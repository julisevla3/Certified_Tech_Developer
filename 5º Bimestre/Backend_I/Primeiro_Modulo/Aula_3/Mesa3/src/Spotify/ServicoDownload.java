package Spotify;

public class ServicoDownload implements Download{

    @Override
    public void downloadMusica( Int id, String tipo) {
        System.out.println("O usuário " + id + " pode baixar a música, pois ele é: " + tipo);
    }
}