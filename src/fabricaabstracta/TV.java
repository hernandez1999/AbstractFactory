
package fabricaabstracta;

public abstract class TV implements Cloneable{
    private String marca;
    private int pulgadas;
    private String color;
    private String descripcion;
    private double precio;
    
    public TV(){
        
    }
    
    public TV(String marca, int pulgadas, String color, double precio){
       setMarca(marca);
       setPulgadas(pulgadas);
       setPrecio(precio);
       setColor(color);
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public String getMarca() {
        return marca;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public String getColor() {
        return color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
