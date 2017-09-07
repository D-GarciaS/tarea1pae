package application;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejemplo1 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			VBox vertical = new VBox();
			HBox h1 = new HBox();
			HBox h2 = new HBox();
			HBox h3 = new HBox();
			
			Label lbl_usuario = new Label("Usuario");
			Label lbl_contraseña = new Label("Contraseña");
			
			TextField txf_usuario = new TextField();
			PasswordField psw_contra = new PasswordField();
			
			Button btn_login = new Button("Log In");
			
			txf_usuario.setPromptText("Usuario");
			psw_contra.setPromptText("Contraseña");
			
			GridPane pane = new GridPane();
			
			GridPane.setRowIndex(lbl_usuario, 0);
			GridPane.setColumnIndex(lbl_usuario, 0);
			
			GridPane.setRowIndex(lbl_contraseña, 1);
			GridPane.setColumnIndex(lbl_usuario, 0);
			
			GridPane.setRowIndex(txf_usuario, 0);
			GridPane.setColumnIndex(txf_usuario, 1);
			
			GridPane.setRowIndex(psw_contra, 1);
			GridPane.setColumnIndex(psw_contra, 1);
			
			GridPane.setRowIndex(btn_login, 2);
			GridPane.setColumnIndex(btn_login, 1);
			
			GridPane.setHalignment(lbl_contraseña, HPos.CENTER);
			GridPane.setHalignment(lbl_usuario, HPos.CENTER);
			GridPane.setHalignment(btn_login, HPos.RIGHT);
			
			  ColumnConstraints cc = new ColumnConstraints();
		        cc.setMinWidth(150);
		        
		    pane.getColumnConstraints().add(cc);
			
//			h1.getChildren().addAll(lbl_usuario, txf_usuario);
//			h2.getChildren().addAll(lbl_contraseña,psw_contra);
//			h3.getChildren().addAll(btn_login);
//			
//			vertical.getChildren().addAll(h1,h2,h3);
//			
			pane.getChildren().addAll(lbl_usuario,txf_usuario);
			pane.getChildren().addAll(lbl_contraseña,psw_contra);
			pane.getChildren().addAll(btn_login);
			
			
			Scene scene = new Scene(pane,400,100);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Welcome");
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