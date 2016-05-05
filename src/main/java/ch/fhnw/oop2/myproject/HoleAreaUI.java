package ch.fhnw.oop2.myproject;

import ch.fhnw.oop2.myproject.CenterArea.TableAreaUI;
import ch.fhnw.oop2.myproject.PM.SelectedDeparturesPM;
import ch.fhnw.oop2.myproject.PM.alldeparturesPM;
import ch.fhnw.oop2.myproject.TopArea.TopAreaUI;
import javafx.scene.layout.BorderPane;


public class HoleAreaUI extends BorderPane {

	TableAreaUI center;
	alldeparturesPM pm;
	SelectedDeparturesPM spm;
	TopAreaUI top;

	public HoleAreaUI(alldeparturesPM pm, SelectedDeparturesPM spm) {
		this.pm=pm;
		this.spm=spm;
		initializeControls();
		layoutControls();
		addEventHandlers();
		addValueChangedListeners();
		addBindings();
	}



	private void initializeControls() {
		center = new TableAreaUI(pm,spm);
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
