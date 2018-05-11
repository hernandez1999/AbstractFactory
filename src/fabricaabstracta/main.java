
package fabricaabstracta;

public class main {
    
    public static void main(String[] args){

    //Para un LCD + Azul
    FactoryLcdAzul f1 = new FactoryLcdAzul();
    EnsamblajeTV e = new EnsamblajeTV(f1);

    //Para un Plasma + Amarillo
    FactoryPlasmaVerde f2 = new FactoryPlasmaVerde();
    EnsamblajeTV e2 = new EnsamblajeTV(f2);

}
}
