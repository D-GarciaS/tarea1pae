package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class Ejemplo4 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			TextFlow pane = new TextFlow();
			
			Text mis_Amigos = new Text("Mis Amigos");
			Text no_saben = new Text("no saben programar\n");
			Text usando = new Text("usando las librerias de");
			Text javafx = new Text("JavaFX 8");
			
			mis_Amigos.setFont(Font.font("Verdana", 30));
			no_saben.setFont(Font.font("Verdana", 14));
			usando.setFont(Font.font("Verdana", 20));
			javafx.setFont(Font.font("Verdana", 36));
			
			mis_Amigos.setFill(Color.RED);
			no_saben.setFill(Color.DARKOLIVEGREEN);
			usando.setFill(Color.PURPLE);
			javafx.setFill(Color.VIOLET);
			
			pane.getChildren().addAll(mis_Amigos, no_saben, usando, javafx);
			
			Scene scene = new Scene(pane,500,110);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Pero yo si!!!");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
	