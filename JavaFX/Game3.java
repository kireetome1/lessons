import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.ParallelCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
public class Game3 extends Application{
	public static void main (String[] args){
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception{
		Group root = new Group();
		Scene scene = new Scene(root, 600,600);
		// *create Rectangle
		Rectangle rect = new Rectangle (100,100,1750,800);
		Rectangle rect1 = new Rectangle (150,150,1650,700);
		// Circle cic = new Circle (50,50,500);
		// Rectangle rect = new Rectangle (500,500,500,500);
		// *create color
		rect.setFill(Color.GREEN);
		// rect.setFill(Color.rgb(0,255,0));
		rect1.setFill(Color.BLUE);
		// *insert into Group
		root.getChildren().add(rect);
		root.getChildren().add(rect1);
		// cic.setCenterX(300.0f); 
  //     cic.setCenterY(135.0f); 
  //     cic.setRadius(100.0f); 
		// root.getChildren().add(cic);
		// root.getChildren().add (rect02);
		stage.setScene(scene);
	stage.show();
	}
}