
package fabricaabstracta;

public abstract class Azul extends Color{
    private String esPrimario;
    
    @Override
    public void colorea(TV tv){
        System.out.println("Pintando de azul el " +tv.getDescripcion());
    }
    
    public String isEsPrimario(){
        return esPrimario;
    }
    
    public void setEsprimario(String esPrimario){
        this.esPrimario = esPrimario;
    }

}
