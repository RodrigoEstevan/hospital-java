
package hospital;

import java.util.Date;


public class CadastroPaciente {
    private Date dataEntrada;
    private Date dataSaida;
    private Date horaEntrada;
    private Date horaSaida;
    private String planoSaude;
    private Double valorDiaria;
    private String leito;
    private Paciente paciente;
    
    public CadastroPaciente(Paciente paciente){
        this.paciente = paciente;
    }
}
