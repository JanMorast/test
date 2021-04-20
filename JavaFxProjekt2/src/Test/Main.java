package Test;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;



import javafx.*;

public class Main extends Application{

	public static void main(String[] args) {
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		BorderPane root = new BorderPane();
		Label lbl = new Label();
		lbl.setText("MUCH");
		
		
		Button b1 = new Button();
		b1.setText("Klick mich!");
		
		//Füge dem Button einen EventHandler hinzu
		b1.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				lbl.setText("Hallo Welt");
				
			}
		});
	
		b1.addEventFilter(MouseEvent.MOUSE_RELEASED, e -> lbl.setText("MUCH"));
		
		
		root.setBottom(b1);
		root.setAlignment(b1, Pos.CENTER);
		root.setMargin(b1, new Insets(20, 20, 20, 20));
		
		lbl.setFont(new Font(60));
		root.setCenter(lbl);
		
		
		// Erstelle eine neue Szenen mit der rootPane als Wurzelinhalt
		Scene scene = new Scene(root, 800, 600);
		scene.getStylesheets().add(getClass().getResource("aplication.css").toExternalForm());
		
		// füge die Szene de,Stage hinzu
		primaryStage.setScene(scene);
		primaryStage.setTitle("Hallo Welt!");
		primaryStage.show();
		
	}

}
