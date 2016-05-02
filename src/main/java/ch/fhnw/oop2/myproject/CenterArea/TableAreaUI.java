package ch.fhnw.oop2.myproject.CenterArea;

import ch.fhnw.oop2.myproject.DeparturePM;
import ch.fhnw.oop2.myproject.CenterArea.InsertArea.InsertAreaUI;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


public class TableAreaUI extends SplitPane {



	private TableView table;
	private TableColumn LEDCol;
	private TableColumn AbfahrtCol;
	private TableColumn nachCol;
	private TableColumn gleisCol;

	private InsertAreaUI rechts;

	private final DeparturePM pm;

	public TableAreaUI(DeparturePM pm) {
		this.pm=pm;
		initializeControls();
		layoutControls();
		addEventHandlers();
		addValueChangedListeners();
		addBindings();
	}



	private void initializeControls() {
		table= new TableView();
		LEDCol = new TableColumn(" ");
		AbfahrtCol = new TableColumn("Abfahrt");
		nachCol = new TableColumn("nach");
		gleisCol = new TableColumn("Gleis");
		rechts=new InsertAreaUI(pm);
	}

	private void layoutControls() {

		table.getColumns().addAll(LEDCol,AbfahrtCol,nachCol,gleisCol);

		getItems().addAll(table,rechts);
		rechts.setId("insertarea");

	}

	private void addEventHandlers() {

	}

	private void addValueChangedListeners() {
	}

	private void addBindings() {

	}
}
