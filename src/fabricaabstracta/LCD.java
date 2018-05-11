
package fabricaabstracta;

public abstract class LCD extends TV{
    private double costoFabricacion;

    public LCD(String marca, int pulgadas, String color, double precio, double costoFabricacion ){
        super(marca, pulgadas, color, precio);
        setCostoFabricacion(costoFabricacion);
    }
    
    public LCD(){
        setDescripcion("LCD");
    }
    
    public double getCostoFabricacion(){
        return costoFabricacion;
    }
    
    public void setCostoFabricacion (double costoFabricacion){
        
    }
}

