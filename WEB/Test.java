import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;

public class Test extends Application{
	public static void main(String[] args) {
		launch(args);
	}
public void start (Stage stage) throws Exception{
	Label hello= new label("Hello!");
	BorderPane pane = new BorderPane();
	pane.setCenter(hello);
	Scene scene= new Scene(pane, 300, 300);
	stage.setScene(scene);
	stage.show();
}
}