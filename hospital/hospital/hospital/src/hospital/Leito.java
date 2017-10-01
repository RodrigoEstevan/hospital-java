
package hospital;

public class Leito {
    private int numero;
    private String carac;
    private Apartamento tipoLeito;
    private TipoLeito tipo;
    
    public enum TipoLeito{
        ELETRICA, BAIXA, GATCH, MACA, CLINITRON, ELETRICA_CIRCULAR;
    }
    
    public Leito(Apartamento tipoLeito){
        this.tipoLeito = tipoLeito;
}
}