import javafx.scene.canvas.GraphicsContext;

/**
 * The Vehicle class is an abstract base class representing a vehicle.
 * It contains common properties such as brand and number of seats, and
 * defines abstract methods for drawing and converting the vehicle to a string representation.
 */
public abstract class Vehicle
{
   private String brand;
   private int numSeats;

    /**
     * Constructor for creating a vehicle with a brand and a number of seats.
     *
     * @param brand the brand of the vehicle.
     * @param numSeats the number of seats in the vehicle.
     */
   public Vehicle(String brand, int numSeats) {
       this.brand = brand;
       this.numSeats = numSeats;
   }

    /**
     * Gets the number of seats in the vehicle.
     *
     * @return the number of seats in the vehicle.
     */
   public int getNumSeats() {
       return numSeats;
   }

    /**
     * Gets the brand of the vehicle.
     *
     * @return the brand of the vehicle.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Abstract method for drawing the vehicle.
     *
     * @param gc the graphics context used to draw the vehicle.
     */
    public abstract void draw(GraphicsContext gc) ;

    /**
     * Abstract method for converting the vehicle to a string.
     *
     * @return a string representation of the vehicle.
     */
    public abstract String toString() ;
    

    
}
