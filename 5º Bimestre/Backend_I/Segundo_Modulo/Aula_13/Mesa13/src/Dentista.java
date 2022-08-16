public class Dentista {
    private String name;
    private String sobrenome;
    private String matricula;
    private int id;

    public Dentista(String name, String sobrenome, String matricula, int id) {
        this.name = name;
        this.sobrenome = sobrenome;
        this.matricula = matricula;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getMatricula(String s) {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
