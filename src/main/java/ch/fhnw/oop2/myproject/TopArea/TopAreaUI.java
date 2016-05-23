package ch.fhnw.oop2.myproject.TopArea;

import ch.fhnw.oop2.myproject.PM.alldeparturesPM;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;


public class TopAreaUI extends HBox {
	Button save;
	Button add;
	Button delete;
	Button back;
	Button forward;
	Button train;
	Button otherpanel;
	Button pause;
	Button play;
	TextField search;


	private final alldeparturesPM pm;

	public TopAreaUI(alldeparturesPM pm) {
		this.pm=pm;
		initializeControls();
		layoutControls();
		addEventHandlers();
		addValueChangedListeners();
		addBindings();
	}



	private void initializeControls() {
		save=new Button("\uF0C7");
		add=new Button("\uf067");
		delete= new Button("\uf00d");
		back= new Button("\uf0e2");
		forward= new Button("\uf01e");
		train= new Button("\uf238");
		otherpanel= new Button("\uf093");
		pause = new Button("\uf04c");
		play= new Button("\uf04b");
		search =new TextField("Suchen");
	}

	private void layoutControls() {
		VBox spacer = new VBox();
		setHgrow(spacer, Priority.ALWAYS);

		getChildren().addAll(save,add,delete,back,forward,train,otherpanel,pause,play,spacer, search);
	}

	private void addEventHandlers() {
			save.setOnMousePressed(event -> {
				pm.save();
				save.setStyle("-fx-text-fill: red");
			});
			save.setOnMouseReleased(event -> save.setStyle("-fx-text-fill: white"));

			add.setOnMousePressed(event -> {
				pm.addDeparture();
				add.setStyle("-fx-text-fill: red");
			});
			add.setOnMouseReleased(event -> add.setStyle("-fx-text-fill: white"));
	}

	private void addValueChangedListeners() {
	}

	private void addBindings() {

	}
}
