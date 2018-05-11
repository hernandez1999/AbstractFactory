
package fabricaabstracta;

public class FactoryLcdAzul extends TvAbstractFactory {

    @Override
    public TV createTV() {
        return new LCD() {};
    }

    @Override
    public Color crateColor() {
        return new Azul() {};
    }
    
}
