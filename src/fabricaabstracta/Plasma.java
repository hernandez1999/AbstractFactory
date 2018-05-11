
package fabricaabstracta;

public class Plasma extends TV{
    private double anguloVision;
    private double tiempoRespuesta;
    
    public Plasma(String marca, int pulgadas, String color, double precio, double anguloVision, double tiempoRespuesta){
        setAnguloVision(anguloVision);
        setTiempoRespuesta(tiempoRespuesta);
    }
    
    public Plasma(){
        setDescripcion("Plasma....se esta convirtiendo en un LED");
    }

    public double getAnguloVision() {
        return anguloVision;
    }

    public double getTiempoRespuesta() {
        return tiempoRespuesta;
    }

    public void setAnguloVision(double anguloVision) {
        this.anguloVision = anguloVision;
    }

    public void setTiempoRespuesta(double tiempoRespuesta) {
        this.tiempoRespuesta = tiempoRespuesta;
    }
}
