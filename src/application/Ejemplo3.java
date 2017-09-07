package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejemplo3 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			VBox pane = new VBox(); 
			HBox h1 = new HBox();
			HBox h2 = new HBox();
			HBox h3 = new HBox();
			HBox h4 = new HBox();
			HBox h5 = new HBox();
			
			Label lbl_To = new Label("To: ");
			Label lbl_Cc = new Label("Cc: ");
			Label lbl_Subject = new Label("Subject: ");
			
			TextField txf_To = new TextField();
			TextField txf_Cc = new TextField();
			TextField txf_Subject = new TextField();
			
			TextArea txa_Body = new TextArea();
			
			Button btn_send = new Button("Send");
			Button btn_Cancel = new Button("Cancel");
			
			h1.getChildren().addAll(lbl_To,txf_To);
			h2.getChildren().addAll(lbl_Cc,txf_Cc);
			h3.getChildren().addAll(lbl_Subject,txf_Subject);
			h4.getChildren().addAll(txa_Body);
			h5.getChildren().addAll(btn_send,btn_Cancel);
			
			HBox.setHgrow(txf_To, Priority.ALWAYS);
			HBox.setHgrow(txf_Cc, Priority.ALWAYS);
			HBox.setHgrow(txf_Subject, Priority.ALWAYS);
			HBox.setHgrow(txa_Body, Priority.ALWAYS);
			
			
			h5.setSpacing(15);
			h5.setAlignment(Pos.CENTER_RIGHT);
			
			pane.setPadding(new Insets(5));
			pane.setSpacing(10);
			pane.getChildren().addAll(h1,h2,h3,h4,h5);
			
			Scene scene = new Scene(pane,800,400);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("New Email");
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
	