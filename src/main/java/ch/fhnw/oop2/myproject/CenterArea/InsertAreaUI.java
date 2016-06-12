package ch.fhnw.oop2.myproject.CenterArea;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;

import ch.fhnw.oop2.myproject.PM.SelectedDeparturesPM;
import ch.fhnw.oop2.myproject.PM.alldeparturesPM;


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
		//myWatch.setMaxWidth(50);



		add(abfahrt,0,1);
		add(abfahrtTimeEing,1,1);
		add(destination,0,2);
		add(destinationEing,1,2);
		add(trainNr,0,3);
		add(trainNameEing,1,3);
		add(gleis,0,4);
		add(gleisEing,1,4);
		add(zwischenhalte,0,5);
		add(zwischenhalteEing,1,5);


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
