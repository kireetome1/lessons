import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
public class lala extends Application{
public static void main(String[] args) {
launch(args);
	}
	public void start (Stage stage) throws Exception{
		Label hello= new Label ("happy");
		BorderPane pane = new BorderPane();
		pane.setTop(hello);
		pane.setCenter(hello);
		pane.setBottom(hello);
		pane.setLeft(hello);
		pane.setRight(hello);
		Scene scene = new Scene(pane,600,600);
		stage.setScene(scene);
		stage.show();
	}
}