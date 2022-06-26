import java.time.LocalDate;
import java.util.Date;

public class PacienteParticular extends Paciente{
    private Integer rg;
    private Double valorConsulta;




    public PacienteParticular (String nome, String sobrenome, LocalDate dataNascimento, Boolean existeDoencaPrevia,
                               Integer rg) {
        super(nome, sobrenome, dataNascimento, existeDoencaPrevia);
        this.rg = rg;
        this.calcularValorConsulta();
    }


    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public Double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(Double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public void calcularValorConsulta(){
        if (this.getExisteDoencaPrevia()){
            this.setValorConsulta(100.00);

        }
        else {

           this.setValorConsulta(50.00);
        }

     }

    @Override
    public void realizaConsulta() throws ConsultaSemMedicoException {
        super.realizaConsulta();
        System.out.println("Paciente Particular. O valor da consulta sera: " + this.getValorConsulta());
    }
}
