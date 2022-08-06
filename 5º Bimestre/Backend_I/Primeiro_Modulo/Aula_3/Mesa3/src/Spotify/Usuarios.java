package Spotify;

public class Usuarios {
    private int id;
    private String tipoUsuario;

    public Usuarios(int id, String tipoUsuario) {
        this.id = id;
        this.tipoUsuario = tipoUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "id=" + id +
                ", tipoUsuario='" + tipoUsuario + '\'' +
                '}';
    }
}
