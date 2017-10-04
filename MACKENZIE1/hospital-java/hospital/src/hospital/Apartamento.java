
package hospital;


public class Apartamento {
    private int andar;
    private int numero;
    private int quantLeitos;
    private String tipoLeito;
    private Hospital hospital;
    private TipoApto tipo;
           
    public Apartamento(Hospital hospital){
      this.hospital = hospital;
      tipo = new TipoApto(this);
    }
}


