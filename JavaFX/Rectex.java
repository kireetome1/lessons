import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.scene.shape.Rectangle;

public class Rectex extends Application { 
   @Override 
   public void start(Stage stage) { 
      //Drawing a Rectangle 
      Rectangle rectangle = new Rectangle();  
      
      //Setting the properties of the rectangle 
      rectangle.setX(50.50f); 
      rectangle.setY(25.50f); 
      rectangle.setWidth(150.0f); 
      rectangle.setHeight(150.0f);      
         
      //Creating a Group object  
      Group root = new Group(rectangle); 
         
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 600);  
      
      //Setting title to the Stage 
      stage.setTitle("Drawing a Rectangle"); 
         
      //Adding scene to the stage 
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show(); 
   }      
   public static void main(String args[]){ 
      launch(args); 
   } 
} 