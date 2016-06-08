package ch.fhnw.oop2.myproject.CenterArea.view;


import ch.fhnw.oop2.myproject.PM.WatchPM;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

/**
 * Created by andreazirn on 05/05/16.
 */
public class Sekundenzeiger extends BorderPane {
    private final WatchPM model;
    private Circle seconds;
    private Circle visualSek;

    private Line sekundenzeiger;
    public Sekundenzeiger(WatchPM model) {
        this.model = model;
        initializeControls();
        layoutControls();
        addBindings();
    }


    private void initializeControls() {
        seconds= new Circle(150,150,110);
        visualSek=new Circle(150,57.833,12.833);//150,48.833,8.833
        sekundenzeiger= new Line(150,171.667,150,53);//150,171.667,150,40
    }

    private void layoutControls() {
        seconds.setStyle("-fx-fill: transparent");
        sekundenzeiger.setStyle("-fx-stroke-width: 4px;-fx-stroke:red");
        visualSek.setStyle("-fx-fill: red");
        getChildren().addAll(seconds,sekundenzeiger,visualSek);
    }

    private void addEventHandlers() {
    }

    private void addValueChangedListeners() {
    }

    private void addBindings() {

    }
}
