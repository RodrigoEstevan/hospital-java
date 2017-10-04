package hospital;

import java.util.ArrayList;

public class TipoApto{
     
    private ArrayList<Apartamento>apto;
    private Tipo tipo;
    
    public enum Tipo{
    STANDARD,SUITE, EXECUTIVO; 
    }   
    
    public TipoApto(Apartamento apartamento) {
        apto = new ArrayList();
        apto.add(apartamento);
    }    
}
