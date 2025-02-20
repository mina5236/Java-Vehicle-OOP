import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;


/**
 * The Boat class represents a boat which extends the Vehicle class.
 * This class provides the ability to specify the brand and number of seats for the boat,
 * as well as draw an image of the boat.
 * It also overrides the toString method to return a string description of the boat.
 */
public class Boat extends Vehicle
{


    /**
     * Constructor for Boat with brand and a default number of seats.
     * @param brand : brand the brand of the boat.
     */
    public Boat(String brand) { 

        this(brand,4);
        
    }

    /**
     * Constructor for Boat with brand and number of seats.
     * @param brand : brand the brand of the boat.
     * @param numSeats: the number of seats in the boat.
     */
    public Boat(String brand, int numSeats) { 

        super(brand,numSeats);
        
    }


/** 
 *
 * Draws the boat image on the canvas.
 *
 * @param gc the graphics context used to draw the image.
 */
    public void draw(GraphicsContext gc) { 

       Image image = new Image("boat.jpg",150,150, false, false);
       gc.drawImage(image,250,150);
    }
    
    

/** 
 *
 * Returns a string representation of the boat, including its brand and number of seats.
 *
 * @return a string describing the boat.
 */
    public String toString() { 

        String str = String.format("Boat: %s with seats: %d\n",getBrand(),getNumSeats());
        return str;
    }
    
}
