import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

/**
 * The Car class represents a car that extends the Vehicle class and implements the Rollable interface.
 * This class defines the number of wheels for the car and overrides methods for drawing and
 * representing the car as a string.
 */
public class Car extends Vehicle implements Rollable
{


    private int numWheels;


    /**
     * Constructor for Car with brand and default number of seats and wheels.
     *
     * @param brand the brand of the car.
     */
    public Car(String brand) { 

        this(brand,4,4);
        
    }

    /**
     * Constructor for Car with brand, number of seats, and number of wheels.
     *
     * @param brand the brand of the car.
     * @param numSeats the number of seats in the car.
     * @param numWheels the number of wheels in the car.
     */
    public Car(String brand, int numSeats, int numWheels) { 

        super(brand,numSeats);
        this.numWheels = numWheels;
    }

    /**
     * Gets the number of wheels in the car.
     *
     * @return the number of wheels in the car.
     */
    public int getNumWheels() { 

        return numWheels;
    }


    /**
     * Draws the car image on the canvas.
     *
     * @param gc the graphics context used to draw the image.
     */
    public void draw(GraphicsContext gc) { 

       Image image = new Image("car.jpg",150,150, false, false);
       gc.drawImage(image,10,10);
    }


    /**
     * Returns a string representation of the car, including its brand, number of seats, and number of wheels.
     *
     * @return a string describing the car.
     */
    public String toString() { 

        String str = String.format("Car: %s with seats: %d  wheels: %d\n",getBrand(),getNumSeats(),numWheels);
        return str;
    }
    
}
