
package fabricaabstracta;

public abstract class Verde extends Color{
    private String esPrimario;
    
    @Override
    public void colorea(TV tv){
        System.out.println("El objeto " +tv.getDescripcion()+ " y se esta pintando de Verde ");
    }
    
    public String isEsPrimario(){
        return esPrimario;
    }
    
    public void setEsprimario(String esPrimario){
        this.esPrimario = esPrimario;
    }

    public String getEsPrimario() {
        return esPrimario;
    }

    public void setEsPrimario(String esPrimario) {
        this.esPrimario = esPrimario;
    }
}
