package ch.fhnw.oop2.myproject.PM;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by andreazirn on 05/05/16.
 */
public class WatchPM {

    private final StringProperty windowTitle = new SimpleStringProperty("SBB Clock");

    public String getWindowTitle() {
        return windowTitle.get();
    }

    public StringProperty windowTitleProperty() {
        return windowTitle;
    }

    public void setWindowTitle(String windowTitle) {
        this.windowTitle.set(windowTitle);
    }

}

