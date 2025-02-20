import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

/**
 * The Truck class represents a truck that extends the Vehicle class and implements the Rollable interface.
 * It defines the number of wheels and overrides methods for drawing and representing the truck as a string.
 */
public class Truck extends Vehicle implements Rollable
{
   
    private int numWheels;

    /**
     * Constructor for Truck with brand and default number of seats and wheels.
     *
     * @param brand the brand of the truck.
     */
    public Truck(String brand) {
        this(brand, 4, 4);
    }


    /**
     * Constructor for Truck with brand, number of seats, and number of wheels.
     *
     * @param brand the brand of the truck.
     * @param numSeats the number of seats in the truck.
     * @param numWheels the number of wheels in the truck.
     */
    public Truck(String brand, int numSeats, int numWheels) {
        super(brand,numSeats);
        this.numWheels = numWheels;
    }


    /**
     * Gets the number of wheels in the truck.
     *
     * @return the number of wheels in the truck.
     */
    public int getNumWheels() {
        return numWheels;
    }

    /**
     * Draws the truck image on the canvas.
     *
     * @param gc the graphics context used to draw the image.
     */
    public void draw(GraphicsContext gc) {
       Image image = new Image("truck.png",150,150, false, false);
       gc.drawImage(image,10,150);
    }

    /**
     * Returns a string representation of the truck, including its brand, number of seats, and number of wheels.
     *
     * @return a string describing the truck.
     */
    public String toString() {
        String str = String.format("Truck: %s with seats: %d  wheels: %d\n",getBrand(),getNumSeats(),numWheels);
        return str;
    }
    
}
