import java.time.LocalDate;
import java.util.Date;
import java.util.List;

abstract class Paciente  {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;

    private Boolean primeiraConsulta;

    private Boolean existeDoencaPrevia;

    private Consulta consulta;

    private String historicoClinico;


    public Paciente(String nome, String sobrenome, LocalDate dataNascimento, Boolean existeDoencaPrevia){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.existeDoencaPrevia = existeDoencaPrevia;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Boolean getPrimeiraConsulta() {
        return primeiraConsulta;
    }

    public void setPrimeiraConsulta(Boolean primeiraConsulta) {
        this.primeiraConsulta = primeiraConsulta;
    }

    public Boolean getExisteDoencaPrevia() {
        return existeDoencaPrevia;
    }

    public void setExisteDoencaPrevia(Boolean existeDoencaPrevia) {
        this.existeDoencaPrevia = existeDoencaPrevia;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public String getHistoricoClinico() {
        return historicoClinico;
    }

    public void setHistoricoClinico(String historicoClinico) {
        this.historicoClinico = historicoClinico;
    }


    public void realizaConsulta() throws ConsultaSemMedicoException {
        if (this.getPrimeiraConsulta()) {
            System.out.println("Eh primeira consulta do paciente " + this.getNome() + ". Avaliando historico clinico...");
            avaliaHistoricoClinico();
        }

        if (this.getConsulta().getMedico() == null){
            throw new ConsultaSemMedicoException("Consulta tentando ser realizada sem medico associado");


        }

        System.out.println("Consulta na especialidade " + this.getConsulta().getEspecialidade() + " realizada.");


    }
    public void  adicionaConsulta (Consulta consulta) {
            if (this.getConsulta() == null) {
                primeiraConsulta = true;
            }

            this.consulta = consulta;
    }

public void avaliaHistoricoClinico (){
        if( this.getExisteDoencaPrevia()){
        this.setHistoricoClinico("Bad");
        }
        else{
            this.setHistoricoClinico("Good");
        }
    System.out.println("Historico clinico avaliado: " + this.getHistoricoClinico());
}

}
