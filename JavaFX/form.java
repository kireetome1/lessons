import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class form extends Application{
	public static void main(String[] args) {
		
	
	launch(args);
}
@Override
public void start(Stage stage){
	Label label = new Label("Hello!");
	TextField field = new TextField();
	Button button = new Button("ok!");
	// button.SetOnAction();
	button.setOnAction(new EventHandler<ActionEvent>(){
		@Override
		public void handle(ActionEvent e){
		// System.out.println("Hello");
			String msg = field.getText();
		label.setText(msg);
	}
	});
	BorderPane pane = new BorderPane();
		pane.setTop(label);
		pane.setCenter(field);
		pane.setBottom(button);
	Scene scene = new Scene(pane,800,800);
	stage.setScene(scene);
	stage.show();
}
}