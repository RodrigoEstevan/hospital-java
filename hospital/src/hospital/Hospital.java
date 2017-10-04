
package hospital;

import java.util.ArrayList;

public class Hospital{
    
    private final String nome = "Boa Saude";
    private ArrayList<Apartamento>apto;
    private ArrayList<Medico>medico;
        
    public Hospital(Medico medico){
            
        apto = new ArrayList();
        for(int i=0; i<60; i++){
            apto.add(new Apartamento(this));
        }
        
        medico = new ArrayList();
        medico.add(new Medico(this));
        
    }//fim objeto Hospital
    
    

    public static void main(String[] args) {                     
        
    }//fim main
}//fim classe hospital
