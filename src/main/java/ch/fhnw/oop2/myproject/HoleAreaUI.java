package ch.fhnw.oop2.myproject;

import ch.fhnw.oop2.myproject.CenterArea.TableAreaUI;
import ch.fhnw.oop2.myproject.PM.alldeparturesPM;
import ch.fhnw.oop2.myproject.TopArea.TopAreaUI;
import javafx.scene.layout.BorderPane;


public class HoleAreaUI extends BorderPane {

	TableAreaUI center;
	alldeparturesPM pm;
	TopAreaUI top;
	public HoleAreaUI(alldeparturesPM pm ) {
		this.pm=pm;
		initializeControls();
		layoutControls();
		addEventHandlers();
		addValueChangedListeners();
		addBindings();
	}



	private void initializeControls() {
		center = new TableAreaUI(pm);
		top= new TopAreaUI(pm);
	}

	private void layoutControls() {
		top.setId("toparea");
		setTop(top);
		setCenter(center);


	}

	private void addEventHandlers() {

	}

	private void addValueChangedListeners() {
	}

	private void addBindings() {

	}
}
