
package hospital;


public class Enfermeiro extends Equipe {
    private int COREM;
    private String formação;
    private Hospital hospital;
    
    public Enfermeiro(Hospital hospital){
        this.hospital = hospital;
    }
}
