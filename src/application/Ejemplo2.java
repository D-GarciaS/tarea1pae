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
import javafx.stage.Stage;

public class Ejemplo2 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			StackPane pane = new StackPane();
			Ellipse elipse = new Ellipse(0, 0, 90, 45);
			elipse.setFill(Color.AZURE);
			Line linea = new Line(0, 0, 80, 80);
			linea.setStroke(Color.RED);
			linea.setStrokeWidth(5);
			Label lbl_code = new Label("Coding Forbidden");
			lbl_code.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
			
			pane.getChildren().addAll(elipse, linea,lbl_code);
			
			Scene scene = new Scene(pane,300,250);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Vacations");
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
	