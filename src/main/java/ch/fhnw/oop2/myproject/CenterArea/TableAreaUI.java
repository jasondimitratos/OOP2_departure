package ch.fhnw.oop2.myproject.CenterArea;

import ch.fhnw.oop2.myproject.CenterArea.watch.Watch;
import ch.fhnw.oop2.myproject.PM.Departure;
import ch.fhnw.oop2.myproject.PM.SelectedDeparturesPM;
import ch.fhnw.oop2.myproject.CenterArea.watch.PMs.WatchPM;
import ch.fhnw.oop2.myproject.PM.alldeparturesPM;
import javafx.scene.Node;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;


public class TableAreaUI extends SplitPane {


	private TableView<Departure> table;
	private TableColumn LEDCol;
	private TableColumn<Departure,String> AbfahrtCol;
	private TableColumn<Departure,String> nachCol;
	private TableColumn<Departure,String> gleisCol;
	private Node rechts;
	private final alldeparturesPM pm;
	private final SelectedDeparturesPM spm;


	public TableAreaUI(alldeparturesPM pm, SelectedDeparturesPM spm) {
		this.pm=pm;
		this.spm=spm;
		initializeControls();
		layoutControls();
		addEventHandlers();
		addValueChangedListeners();
		addBindings();
		table.getSelectionModel().select(1);
		table.getSelectionModel().select(0);
	}



	private void initializeControls() {

		table= new TableView(pm.getFilteredList());
		LEDCol = new TableColumn(" ");

		AbfahrtCol = new TableColumn("Abfahrt");

		nachCol = new TableColumn("nach");
		gleisCol = new TableColumn("Gleis");
		VBox watch = new VBox(new Watch(new WatchPM()));
		watch.setPrefSize(90,90);
		watch.setMinSize(90,90);
		watch.setMaxSize(90,90);



		VBox vBox = new VBox(watch, new InsertAreaUI(pm, spm));

		rechts= vBox;


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
		table.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> pm.setSelectedDeparture( newValue));
	}

	private void addBindings() {

	}
}
