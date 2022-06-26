import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

public class Consulta {

    private LocalDateTime dataHoraConsulta;
    private String especialidade;

    private Medico medico;


    public Consulta(LocalDateTime dataHoraConsulta, String especialidade, Medico medico) {
        this.dataHoraConsulta = dataHoraConsulta;
        this.especialidade = especialidade;
        this.medico = medico;

    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public LocalDateTime getDataHoraConsulta() {
        return dataHoraConsulta;
    }

    public void setDataHoraConsulta(LocalDateTime dataHoraConsulta) {
        this.dataHoraConsulta = dataHoraConsulta;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;


    }
}
