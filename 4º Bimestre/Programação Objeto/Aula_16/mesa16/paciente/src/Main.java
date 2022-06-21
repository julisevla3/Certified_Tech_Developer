import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        try {
            Paciente paciente = new Paciente(
                    "Juan",
                    "Perez",
                    "12345",
                    LocalDate.of(2021, 5, 10));


        } catch(DataException ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }


    }
}

