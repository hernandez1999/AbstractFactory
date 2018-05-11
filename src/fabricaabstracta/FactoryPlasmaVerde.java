
package fabricaabstracta;

public class FactoryPlasmaVerde extends TvAbstractFactory {

    @Override
    public TV createTV() {
        return new Plasma();
    }

    @Override
    public Color crateColor() {
        return new Verde() {};
    }
    
}
