package ch.fhnw.oop2.myproject.CenterArea;

import ch.fhnw.oop2.myproject.PM.SelectedDeparturesPM;
import ch.fhnw.oop2.myproject.PM.alldeparturesPM;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;


public class InsertAreaUI extends GridPane {



	private Label abfahrt;
	private Label destination;
	private Label trainNr;
	private Label gleis;
	private Label zwischenhalte;
	protected TextField abfahrtTimeEing;
	private TextField destinationEing;
	private TextField trainNameEing;
	private TextField gleisEing;
	private TextArea zwischenhalteEing;

	private final alldeparturesPM pm;
	private final SelectedDeparturesPM spm;

	public InsertAreaUI(alldeparturesPM pm, SelectedDeparturesPM spm) {
		this.pm=pm;
		this.spm=spm;
		initializeControls();
		layoutControls();
		addEventHandlers();
		addValueChangedListeners();
		addBindings();
	}



	private void initializeControls() {
		abfahrt=new Label("Abfahrt");
		destination=new Label("nach");
		trainNr=new Label("Zugnummer");
		gleis=new Label("Gleis");
		zwischenhalte= new Label("Zwischenhalte");

		abfahrtTimeEing= new TextField();
		destinationEing =new TextField();

		trainNameEing=new TextField();
		gleisEing=new TextField();
		zwischenhalteEing=new TextArea();
	}

	private void layoutControls() {
		ColumnConstraints cc = new ColumnConstraints();
		cc.setHgrow(Priority.ALWAYS);
		getColumnConstraints().addAll(cc, cc, cc);

		RowConstraints rc = new RowConstraints();
		rc.setVgrow(Priority.ALWAYS);
		getRowConstraints().addAll(rc, rc, rc);

		setMargin(zwischenhalteEing, new Insets(50, 0,0,0));

		add(abfahrt,0,0);
		add(abfahrtTimeEing,1,0);
		add(destination,0,1);
		add(destinationEing,1,1);
		add(trainNr,0,2);
		add(trainNameEing,1,2);
		add(gleis,0,3);
		add(gleisEing,1,3);
		add(zwischenhalte,0,4);
		add(zwischenhalteEing,1,4);

	}

	private void addEventHandlers() {

	}

	private void addValueChangedListeners() {
	}

	private void addBindings() {
		spm.departureTimeProperty().bindBidirectional(abfahrtTimeEing.textProperty());
		spm.trainDestinationProperty().bindBidirectional(destinationEing.textProperty());
		spm.gleisProperty().bindBidirectional(gleisEing.textProperty());
		spm.zwischenhalteProperty().bindBidirectional(zwischenhalteEing.textProperty());
		spm.trainNummerProperty().bindBidirectional(trainNameEing.textProperty());
	}
}
