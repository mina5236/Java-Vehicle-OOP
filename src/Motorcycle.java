import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;


/**
 * The Motorcycle class represents a motorcycle that extends the Vehicle class and implements the Rollable interface.
 * It defines the number of wheels and overrides methods for drawing and representing the motorcycle as a string.
 */
public class Motorcycle extends Vehicle implements Rollable
{
   
    private int numWheels;

    /**
     * Constructor for Motorcycle with brand and default number of seats and wheels.
     *
     * @param brand the brand of the motorcycle.
     */
    public Motorcycle(String brand) {
        this(brand, 4, 4);
    }

    /**
     * Constructor for Motorcycle with brand, number of seats, and number of wheels.
     *
     * @param brand the brand of the motorcycle.
     * @param numSeats the number of seats in the motorcycle.
     * @param numWheels the number of wheels in the motorcycle.
     */
    public Motorcycle(String brand, int numSeats, int numWheels) {
        super(brand,numSeats);
        this.numWheels = numWheels;
    }

    /**
     * Gets the number of wheels in the motorcycle.
     *
     * @return the number of wheels in the motorcycle.
     */
    public int getNumWheels() {
        return numWheels;
    }

    /**
     * Draws the motorcycle image on the canvas.
     *
     * @param gc the graphics context used to draw the image.
     */
    public void draw(GraphicsContext gc) {
       Image image = new Image("motorcycle.jpg",150,150, false, false);
       gc.drawImage(image,250,10);
    }

    /**
     * Returns a string representation of the motorcycle, including its brand, number of seats, and number of wheels.
     *
     * @return a string describing the motorcycle.
     */
    public String toString() {
        String str = String.format("Motorcycle: %s with seats: %d  wheels: %d\n",getBrand(),getNumSeats(),numWheels);
        return str;
    }
    
}
