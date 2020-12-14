import javafx.animation.Animation;
  import javafx.animation.TranslateTransition;
  import javafx.util.Duration;
  import javafx.application.Application;
  import javafx.stage.Stage;
  import javafx.scene.Scene;
  import javafx.scene.Group;
  import javafx.scene.shape.Rectangle;
  import javafx.scene.shape.Circle;
   
  public class Test extends Application{
   
  	public static void main(String[] args) {
  		launch(args);
  	}
   
  	@Override
  	public void start(Stage primaryStage) {
  		View v = new View();
  		Scene scene = new Scene(v, 400, 300);
  		primaryStage.setScene(scene);
  		primaryStage.show();
  	}
  }
  
  
  class View extends Group{
  	public View() {
  		Rectangle rect = new Rectangle(0,0,50,50);
      Rectangle rect1 = new Rectangle(0,0,50,50);
      Circle cic = new Circle(0,0,30);
      TranslateTransition animation2 = new TranslateTransition(Duration.seconds(1), cic);
  		TranslateTransition animation = new TranslateTransition(Duration.seconds(1), rect);
      TranslateTransition animation1 = new TranslateTransition(Duration.seconds(1), rect1);
  		animation.setFromX(0);
  		animation.setFromY(0);
  		animation.setToX(350);
  		animation.setToY(250);
      animation2.setFromX(350);
      animation2.setFromY(250);
      animation2.setToX(0);
      animation2.setToY(0);
      animation1.setFromX(200);
      animation1.setFromY(0);
      animation1.setToX(200);
      animation1.setToY(200);
  		animation.setCycleCount( Animation.INDEFINITE );
      animation2.setCycleCount(50 );
  		animation1.setCycleCount(50);
  		animation.setAutoReverse(true);
  		animation1.setAutoReverse(true);
      animation2.setAutoReverse(true);
  		animation.play();
      animation1.play();
      animation2.play();
  		getChildren().add(rect);
      getChildren().add(rect1);
       getChildren().add(cic);
      // stage.setScene(scene);
  // stage.show();

  	}
  }