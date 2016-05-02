package ch.fhnw.oop2.myproject;
import ch.fhnw.oop2.myproject.PM.DeparturePM;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HoleAreaApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		DeparturePM pm= new DeparturePM();
		Parent rootPanel = new HoleAreaUI(pm);

		Scene scene = new Scene(rootPanel);

	//	String fonts = getClass().getResource("fonts.css").toExternalForm();
	//	scene.getStylesheets().add(fonts);

		String stylesheet = getClass().getResource("style.css").toExternalForm();
		scene.getStylesheets().add(stylesheet);

		primaryStage.setScene(scene);

		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
