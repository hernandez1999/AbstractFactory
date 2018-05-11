
package fabricaabstracta;


public class Explicacion {
    
    /**
     * Se utilizo una pagina web como ayuda para lograr entender la importancia de Abstract Factory 
     * PROBLEMA:
     * Hagamos de cuenta que tenemos dos familias de objetos:
        1) La clase TV, que tiene dos hijas: Plasma y LCD.
        2) La clase Color, que tiene dos hijas: Amarillo y Azul (los mejores colores, sin duda! ).
     * CREDITOS:
     * http://migranitodejava.blogspot.com.co/2011/05/abstract-factory.html
     * PUNTOS A FAVOR:
     * Se oculta a los clientes las clases de implementación: los clientes manipulan los objetos a través de las interfaces o clases abstractas.
     * Facilita el intercambio de familias de productos: al crear una familia completa de objetos con una factoría abstracta, es fácil cambiar toda la familia de una vez simplemente cambiando la factoría concreta.
     * Mejora la consistencia entre productos: el uso de la factoría abstracta permite forzar a utilizar un conjunto de objetos de una misma familia
     * Como inconveniente podemos decir que no siempre es fácil soportar nuevos tipos de productos si se tiene que extender la interfaz de la Factoría abstracta.
    */
}
