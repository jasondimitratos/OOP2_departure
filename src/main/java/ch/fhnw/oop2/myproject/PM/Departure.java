package ch.fhnw.oop2.myproject.PM;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by jasondimitratos on 18.04.16.
 */
public class Departure {
    private StringProperty id= new SimpleStringProperty();
    private StringProperty departureTime= new SimpleStringProperty("00:00");
    private StringProperty trainDestination= new SimpleStringProperty();
    private StringProperty trainNummer= new SimpleStringProperty();
    private StringProperty gleis= new SimpleStringProperty();
    private StringProperty zwischenhalte= new SimpleStringProperty();


    public Departure(String[] line) {
        setId(line[0]);
        setDepartureTime(line[1]);
        setTrainDestination(line[3]);
        setTrainNummer(line[2]);
        if(line[5].equals("-1")){
            setGleis("");
        }else{
            setGleis(line[5]);
        }

        setZwischenhalte(line[4]);

    }
    public String infoAsLine() {
        String gleis=getGleis();
        if(gleis==null||gleis.equals("")){
             gleis="-1";
        }
        return String.join(";",
                getId(),
                getDepartureTime(),
                getTrainNummer(),
                getTrainDestination(),
                getZwischenhalte(),
                gleis
        );

    }

    //getters and setters


    public String getId() {
        return id.get();
    }

    public StringProperty idProperty() {
        return id;
    }

    public void setId(String id) {
        this.id.set(id);
    }

    public String getDepartureTime() {
        return departureTime.get();
    }

    public StringProperty departureTimeProperty() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime.set(departureTime);
    }

    public String getTrainDestination() {
        return trainDestination.get();
    }

    public StringProperty trainDestinationProperty() {
        return trainDestination;
    }

    public void setTrainDestination(String trainDestination) {
        this.trainDestination.set(trainDestination);
    }

    public String getTrainNummer() {
        return trainNummer.get();
    }

    public StringProperty trainNummerProperty() {
        return trainNummer;
    }

    public void setTrainNummer(String trainNummer) {
        this.trainNummer.set(trainNummer);
    }

    public String getGleis() {
            return gleis.get();


    }

    public StringProperty gleisProperty() {
        return gleis;
    }

    public void setGleis(String gleis) {
        this.gleis.set(gleis);
    }

    public String getZwischenhalte() {
        return zwischenhalte.get();
    }

    public StringProperty zwischenhalteProperty() {
        return zwischenhalte;
    }

    public void setZwischenhalte(String zwischenhalte) {
        this.zwischenhalte.set(zwischenhalte);
    }
}
