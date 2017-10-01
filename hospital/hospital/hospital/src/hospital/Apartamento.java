
package hospital;

import java.util.ArrayList;


public class Apartamento {
    private int andar;
    private int numero;
    private int quantLeitos;
    private String tipoLeito;
    private Hospital hospital;
    private TipoApto tipo;
     private ArrayList<Leito>leitos;
           
    public Apartamento(Hospital hospital){
      this.hospital = hospital;
      tipo = new TipoApto(this);
      
      for(int i=0; i<quantLeitos; i++){
        leitos = new ArrayList();
        leitos.add(new Leito(this));
      }      
      
    }
}


