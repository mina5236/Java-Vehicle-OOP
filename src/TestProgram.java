
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import static javafx.application.Application.launch;
import java.util.ArrayList;

/**
 * The TestProgram class is the main application to launch a GUI displaying vehicles.
 * It creates a group of vehicles (Car, Truck, Motorcycle, Boat) and displays them on the canvas.
 */
public class TestProgram extends Application {

    /**
     * The start method sets up the GUI for displaying the vehicles.
     * It creates instances of various vehicles, adds them to a list, and draws them on the canvas.
     *
     * @param stage the primary stage for the application.
     * @throws Exception if an error occurs during setup.
     */
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(400, 300);
        stage.setTitle("Vehicles");
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();


        ArrayList<Vehicle> lot = new ArrayList<>();
        
        Car c = new Car("Ford");
        Truck t = new Truck("Ram");
        Motorcycle m = new Motorcycle("Harley-Davidson");
        Boat b = new Boat("Harley-Davidson");
        
        lot.add(c);
        lot.add(t);
        lot.add(m);
        lot.add(b);
        
        for (Vehicle v : lot) {
            v.draw(gc);
        }
        

        stage.show();
    }

    /**
     * The actual main method that launches the app.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}