package ch.fhnw.oop2.myproject.PM;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by jasondimitratos on 02.05.16.
 */
public class alldeparturesPM {

    private static final String FILE_NAME = "olten.csv";

    private static final String TAB = ";";

    private final StringProperty applicationTitle = new SimpleStringProperty("Departure App");

    private final ObjectProperty<Departure> selectedDeparture = new SimpleObjectProperty<>();

    private final ObservableList<Departure> departures = FXCollections.observableArrayList();

    private final FilteredList<Departure> filteredList = new FilteredList<>(departures, departure -> true);

    private final ObservableList<Departure> changes= FXCollections.observableArrayList();
    private SelectedDeparturesPM spm;

    public alldeparturesPM(SelectedDeparturesPM spm) {
        this.spm = spm;
        departures.addAll(readFromFile());

        selectedDeparture.addListener((observable, oldValue, newValue) -> {
            if(oldValue != null){
                spm.departureTimeProperty().unbindBidirectional((oldValue).departureTimeProperty());
                spm.trainDestinationProperty().unbindBidirectional((oldValue).trainDestinationProperty());
                spm.trainNummerProperty().unbindBidirectional((oldValue).trainNummerProperty());
                spm.gleisProperty().unbindBidirectional((oldValue).gleisProperty());
                spm.zwischenhalteProperty().unbindBidirectional((oldValue).zwischenhalteProperty());
            }
            if(newValue != null){
                spm.departureTimeProperty().bindBidirectional((newValue).departureTimeProperty());
                spm.trainDestinationProperty().bindBidirectional((newValue).trainDestinationProperty());
                spm.trainNummerProperty().bindBidirectional((newValue).trainNummerProperty());
                spm.gleisProperty().bindBidirectional((newValue).gleisProperty());
                spm.zwischenhalteProperty().bindBidirectional((newValue).zwischenhalteProperty());

            }

        });

    }




    public void save() {
        try (BufferedWriter writer = Files.newBufferedWriter(getPath(FILE_NAME, true))) {
            writer.write("#id"+TAB+"Uhrzeit"+TAB+"Zugnummer"+TAB+"in Richtung"+TAB+"über"+TAB+"Gleis");
            writer.newLine();
            departures.stream().forEach(resultat -> {
                try {
                    writer.write(resultat.infoAsLine()+";");
                    writer.newLine();
                } catch (IOException e) {
                    throw new IllegalStateException(e);
                }
            });
        } catch (IOException e) {
            throw new IllegalStateException("save failed");
        }
    }

    private List<Departure> readFromFile() {
        try (Stream<String> stream = getStreamOfLines(FILE_NAME, true)) {
            return stream.skip(1)// erste Zeile ist die Headerzeile; ueberspringen
                    .map(s ->{ return new Departure(s.split(TAB));}) // aus jeder Zeile ein Objekt machen
                    .collect(Collectors.toList());        // alles aufsammeln
        }
    }

    private Stream<String> getStreamOfLines(String fileName, boolean locatedInSameFolder) {
        try {
            return Files.lines(getPath(fileName, locatedInSameFolder), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    private Path getPath(String fileName, boolean locatedInSameFolder)  {
        try {
            if(!locatedInSameFolder) {
                fileName = "/" + fileName;
            }
            return Paths.get(getClass().getResource(fileName).toURI());
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public ObservableList<Departure> getDepartures() {
        return departures;
    }

    public FilteredList<Departure> getFilteredList() {return filteredList; }

    public ObservableList<Departure> getChanges() {
        return changes;
    }

    public void addDeparture(){
        Integer length=departures.size();
        String [] temp={length.toString(),"00:00","","","",""};
        departures.add(new Departure(temp));
    }

    public void deleteDeparture(){
        departures.remove(getSelectedDeparture());
    }

    public Departure getSelectedDeparture() {
        return selectedDeparture.get();
    }

    public ObjectProperty<Departure> selectedDepartureProperty() {
        return selectedDeparture;
    }

    public void setSelectedDeparture(Departure selectedDeparture) {
        this.selectedDeparture.set(selectedDeparture);
    }
}
