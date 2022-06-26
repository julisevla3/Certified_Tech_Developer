import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ConsultaSemMedicoException {


        Medico medico1 = new Medico("Ronaldo");
        Medico medico2 = new Medico("Godofredo");

        Consulta consulta1 = new Consulta(LocalDateTime.now().plusDays(1), "Cardiologia", medico1);
        Consulta consulta2 = new Consulta(LocalDateTime.now().plusDays(3), "Oftalmologia", medico2);
        Consulta consulta3 = new Consulta(LocalDateTime.now().plusDays(2), "Cardiologia", medico1);

        List<Consulta> consultas = new ArrayList();
        consultas.add(consulta1);
        consultas.add(consulta2);
        consultas.add(consulta3);

        Consultorio consultorio = new Consultorio("Constultorio_1", consultas);



        PacientePublico pacientePublico1 = new PacientePublico(
                "Juliane",
                "Alves",
                LocalDate.of(1989, 12, 03),
                true, 12345);

        PacientePublico pacientePublico2 = new PacientePublico(
                "Anderson",
                "Barbasa",
                LocalDate.of(1990, 02, 04),
                true, 67890);


        PacienteParticular pacienteParticular = new PacienteParticular(
                "Lua",
                "Cardoso",
                LocalDate.of(2022, 01, 18),
                false, 321654);

        pacientePublico1.adicionaConsulta(consulta1);
        pacientePublico2.adicionaConsulta(consulta2);
        pacienteParticular.adicionaConsulta(consulta3);

        pacientePublico1.realizaConsulta();
        pacientePublico2.realizaConsulta();
        pacienteParticular.realizaConsulta();
    }
}