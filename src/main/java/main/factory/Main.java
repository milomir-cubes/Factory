
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
        //fiat.showData();
        
        
        Car ford = new Car("Ford", 2015, "red", 40, 10, 5, 300);
        //ford.showData();
        
        Car lada = new Car("Lada Niva", 1980, "green", 50, 40, 10, 500);

//        lada.showData();
        
//        lada.travel(20); 
//        lada.showData();
//        
//        lada.fuelUp(100);
//        lada.travel(400);
//        lada.showData();.

        lada.setPassengers(2);
        lada.showData();

        lada.getIn();
        lada.getIn();
        lada.getOut();
        lada.getIn(3);
        lada.getIn(8);
        lada.getOut(10);
        lada.getOut(2);
        lada.getOut(1);
        lada.getOut(1);
        
    }
    
}
