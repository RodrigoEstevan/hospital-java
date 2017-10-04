
package hospital;
// desenvolvido por:
// CASSIANO DA SILVA DIAS CARVALHO - 31586899
// RODRIGO VERGARA - 31623913
import java.util.ArrayList;

public class Hospital{
    
    private final String nome = "Boa Saude";
    private ArrayList<Apartamento>apto;
    private ArrayList<Medico>medicos;
    private ArrayList<Enfermeiro>enfermeiros;
    private ArrayList<Paciente>pacientes;
        
    public Hospital(){
        
        apto = new ArrayList();
        for(int i=0; i<60; i++){
            apto.add(new Apartamento(this));
        }
        
        medicos = new ArrayList();
        medicos.add(new Medico(this));
        
        
        enfermeiros = new ArrayList();
        enfermeiros.add(new Enfermeiro(this));
        
        pacientes = new ArrayList();
        pacientes.add(new Paciente(this));        
        
        
    }//fim objeto Hospital
    
    

    public static void main(String[] args) {                     
        
    }//fim main
}//fim classe hospital
