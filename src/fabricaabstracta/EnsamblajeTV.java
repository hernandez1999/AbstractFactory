
package fabricaabstracta;

public class EnsamblajeTV {
    
    public EnsamblajeTV(TvAbstractFactory factory){
        Color color = factory.crateColor();
        TV tv = factory.createTV();
        color.colorea(tv);
    }

}
