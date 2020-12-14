import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
// import javafx.scene.control.Button1;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class Test3 extends Application{
	public static void main(String[] args) {
		
	
	launch(args);
}
@Override
public void start(Stage stage){
	Label label = new Label("Dream Catcher");
	Label label1 = new Label("Dream");
	// TextField field = new TextField();
	// TextField field1= new TextField();
	Button button = new Button("Start Game");
	 button.setOnAction( new EventHandler<ActionEvent>(){
        @Override
        public void handle( ActionEvent e ) {
          // String Label = label.getText();
          // label1.setText( label.getText() );
          // label1.setText(label1.getText());
          // label.getText( Label );
          String data = label.getText();
          String data1 = label1.getText();
          label1.setText(data );
          label.setText(data1);
        // }
        // // @Override
        //  public void handle1( ActionEvent e ) {
        //  	label.setText(label1.getText());
         }
      });
	// Button app= new Button("Load Game");
	// Button1 button1= new Button1("Load Game");
	// button.SetOnAction();
	// button.setOnAction(new EventHandler<ActionEvent>(){
	// 	@Override
	// 	public void handle(ActionEvent e){
	// 	// System.out.println("Hello");
	// 		String msg = field.getText();
	// 	label.setText(msg);
	// }
	// });
	// app.setOnAction(new EventHandler<ActionEvent>(){
	// 	@Override
	// 	public void handle(ActionEvent e){
	// 	// System.out.println("Hello");
	// 		String msg = field.getText();
	// 	label1.setText(msg);
	// }
	// });
	BorderPane pane = new BorderPane();
		pane.setRight(label);
		pane.setLeft(label1);
		// pane.setRight(field);
		// pane.setRight(field1);
		pane.setBottom(button); 
		// for (int i = 0; i < 5; i++) { 
		//  pane.getChildren().add(button);  
  //        button.relocate(100, 50 + 40 * i); 
		// }
		// pane.setCenter(app);
	Scene scene = new Scene(pane,800,800);
	stage.setScene(scene);
	stage.show();
}
}