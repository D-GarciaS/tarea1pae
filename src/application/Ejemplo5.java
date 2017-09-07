package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Ejemplo5 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			AnchorPane pane = new AnchorPane();
		
			Label lbl_cr = new Label("Copyright c 2017 Jorge Barba - All right reserved");
			
			AnchorPane.setBottomAnchor(lbl_cr, 5.0);
			AnchorPane.setRightAnchor(lbl_cr, 5.0);

			
			pane.getChildren().add(lbl_cr);
			
			Scene scene = new Scene(pane,700,100);

			primaryStage.setTitle("My Copyright");
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