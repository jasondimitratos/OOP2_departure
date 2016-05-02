package ch.fhnw.oop2.myproject.CenterArea;

import ch.fhnw.oop2.myproject.PM.Departure;
import ch.fhnw.oop2.myproject.PM.alldeparturesPM;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


public class TableAreaUI extends SplitPane {



	private TableView table;
	private TableColumn LEDCol;
	private TableColumn<Departure,String> AbfahrtCol;
	private TableColumn<Departure,String> nachCol;
	private TableColumn<Departure,String> gleisCol;

	private InsertAreaUI rechts;

	private final alldeparturesPM pm;

	public TableAreaUI(alldeparturesPM pm) {
		this.pm=pm;
		initializeControls();
		layoutControls();
		addEventHandlers();
		addValueChangedListeners();
		addBindings();
	}



	private void initializeControls() {
		table= new TableView(pm.getResulate());
		LEDCol = new TableColumn(" ");

		AbfahrtCol = new TableColumn("Abfahrt");
		nachCol = new TableColumn("nach");
		gleisCol = new TableColumn("Gleis");
		rechts=new InsertAreaUI(pm);


		AbfahrtCol.setCellValueFactory(cell -> cell.getValue().departureTimeProperty());
		nachCol.setCellValueFactory(cell -> cell.getValue().trainDestinationProperty());
		gleisCol.setCellValueFactory(cell -> cell.getValue().gleisProperty());

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
