import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class PacientePublico extends Paciente implements Comparable<PacientePublico>{
    private Integer cns;


    public PacientePublico (String nome, String sobrenome, LocalDate dataNascimento,
                            Boolean existeDoencaPrevia, Integer cns) {
        super(nome, sobrenome, dataNascimento, existeDoencaPrevia);
        this.cns = cns;
    }

    public List<PacientePublico> ordenaConsulta(List<PacientePublico> pacientes){
        Collections.sort(pacientes);
        return pacientes;
    }

    public Integer getCns() {
        return this.cns;
    }

    @Override
    public int compareTo(PacientePublico outroPaciente) {
        return Integer.compare(this.getCns(), outroPaciente.getCns());
    }

    @Override
    public void realizaConsulta() throws ConsultaSemMedicoException {
        super.realizaConsulta();
        System.out.println("Paciente Publico. A consulta nao sera cobrada.")
        ;
    }


}
