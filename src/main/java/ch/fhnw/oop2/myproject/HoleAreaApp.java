package ch.fhnw.oop2.myproject;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import ch.fhnw.oop2.myproject.PM.SelectedDeparturesPM;
import ch.fhnw.oop2.myproject.PM.alldeparturesPM;

public class HoleAreaApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		SelectedDeparturesPM spm= new SelectedDeparturesPM();
		alldeparturesPM pm= new alldeparturesPM(spm);
		Parent rootPanel = new HoleAreaUI(pm,spm);
		rootPanel.setStyle("-fx-min-width:500px ");
		Scene scene = new Scene(rootPanel);

	//	String fonts = getClass().getResource("fonts.css").toExternalForm();
	//	scene.getStylesheets().add(fonts);

		String stylesheet = getClass().getResource("Styling/style.css").toExternalForm();
		scene.getStylesheets().add(stylesheet);

		primaryStage.setScene(scene);
		primaryStage.setMinWidth(800);
		primaryStage.setMinHeight(550);


		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
