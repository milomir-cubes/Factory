
package main.factory;

/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car fiat = new Car("Fiat Punto", 2010, "black", 45);
        fiat.showData();
        
        Car ford = new Car("Ford", 2015, "red", 40, 10, 5);
        ford.showData();
        
        Car lada = new Car("Lada Niva", 1980, "green", 50, 40, 12);
        lada.showData();
        
    }
    
}
