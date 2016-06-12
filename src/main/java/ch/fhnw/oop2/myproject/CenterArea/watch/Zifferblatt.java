package ch.fhnw.oop2.myproject.CenterArea.watch;


import ch.fhnw.oop2.myproject.CenterArea.watch.PMs.WatchPM;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

/**
 * Created by andreazirn on 05/05/16.
 */
public class Zifferblatt extends BorderPane{

    private final WatchPM model;

    private Line line1;
    private Line line2;
    private Line line3;
    private Line line4;
    private Line line5;
    private Line line6;
    private Line line7;
    private Line line8;
    private Line line9;
    private Line line10;
    private Line line11;
    private Line line12;
    private Line sek1;
    private Line sek2;
    private Line sek3;
    private Line sek4;
    private Line sek6;
    private Line sek7;
    private Line sek8;
    private Line sek9;
    private Line sek11;
    private Line sek12;
    private Line sek13;
    private Line sek14;
    private Line sek16;
    private Line sek17;
    private Line sek18;
    private Line sek19;
    private Line sek21;
    private Line sek22;
    private Line sek23;
    private Line sek24;
    private Line sek26;
    private Line sek27;
    private Line sek28;
    private Line sek29;
    private Line sek31;
    private Line sek32;
    private Line sek33;
    private Line sek34;
    private Line sek36;
    private Line sek37;
    private Line sek38;
    private Line sek39;
    private Line sek41;
    private Line sek42;
    private Line sek43;
    private Line sek44;
    private Line sek46;
    private Line sek47;
    private Line sek48;
    private Line sek49;
    private Line sek51;
    private Line sek52;
    private Line sek53;
    private Line sek54;
    private Line sek56;
    private Line sek57;
    private Line sek58;
    private Line sek59;

    private Circle zblatt;
    private Circle zblattRand;

    public Zifferblatt(WatchPM model) {
        this.model = model;
        initializeControls();
        layoutControls();
        addBindings();
    }


    public void initializeControls() {
        line1 = new Line(5.001,150,40.001,150);
        line2 = new Line(259.524,150,294.525,150);
        line3 = new Line(150,40,150,5);
        line4 = new Line(150.001,295,150.001,260);
        line5 = new Line(94.989,55.156,77.489,24.845);
        line6 = new Line(222.411,275.155,205.012,244.845);
        line7 = new Line(54.718,94.99,24.407,77.489);
        line8 = new Line(275.593,222.512,245.282,205.01);
        line9 = new Line(54.719,205.011,24.407,222.512);
        line10 = new Line(275.593,77.49,245.281,94.991);
        line11 = new Line(94.989,245.282,77.489,275.594);
        line12 = new Line(205.011,54.719,222.511,24.408);

        sek1 = new Line(204.518,27.383, 211.025,12.766);
        sek2 = new Line(191.422, 22.5, 196.366, 7.283);
        sek3 = new Line(177.866, 18.67, 181.192, 3.02);
        sek4 = new Line(281.101, 122.135, 296.751, 118.809);
        sek6 = new Line(283.089, 135.993, 299.001, 134.32);
        sek7 = new Line(283.089, 164.009, 299.001, 165.681);
        sek8 = new Line(272.618, 95.482, 287.234, 88.974);
        sek9 = new Line(277.452, 108.581, 292.669, 103.636);
        sek11 = new Line(258.621, 71.232, 271.565, 61.827);
        sek12 = new Line(228.765, 41.588, 238.17, 28.644);
        sek13 = new Line(239.661, 50.419, 250.368, 38.529);
        sek14 = new Line(249.583, 60.509, 261.474, 49.802);
        sek16 = new Line(281.101, 177.865, 296.751, 181.192);
        sek17 = new Line(164.008, 283.277, 165.681, 299.189);
        sek18 = new Line(277.024, 191.412, 292.241, 196.356);
        sek19 = new Line(204.516, 272.616, 211.023, 287.232);
        sek21 = new Line(258.411, 228.766, 271.355, 238.17);
        sek22 = new Line(177.866, 280.926, 181.193, 296.576);
        sek23 = new Line(272.607, 204.518, 287.224, 211.025);
        sek24 = new Line(191.42, 277.479, 196.364, 292.696);
        sek26 = new Line(228.765, 258.621, 238.169, 271.564);
        sek27 = new Line(239.66, 249.578, 250.366, 261.469);
        sek28 = new Line(249.577, 239.491, 261.467, 250.198);
        sek29 = new Line(134.319, 0.855, 135.992, 16.768);
        sek31 = new Line(118.808, 3.02, 122.135, 18.67);
        sek32 = new Line(103.637, 7.283, 108.582, 22.5);
        sek33 = new Line(88.975, 12.766, 95.483, 27.382);
        sek34 = new Line(61.831, 28.645, 71.235, 41.588);
        sek36 = new Line(49.633, 38.529, 60.339, 50.419);
        sek37 = new Line(38.528, 49.802, 50.418, 60.509);
        sek38 = new Line(28.644, 61.827, 41.588, 71.231);
        sek39 = new Line(12.791, 88.975, 27.407, 95.483);
        sek41 = new Line(7.304, 103.636, 22.521, 108.58);
        sek42 = new Line(3.25, 118.809, 18.9, 122.136);
        sek43 = new Line(0.812, 134.319, 16.725, 135.991);
        sek44 = new Line(0.812, 165.681, 16.725, 164.009);
        sek46 = new Line(3.25, 181.192, 18.9, 177.866);
        sek47 = new Line(7.305, 196.356, 22.522, 191.411) ;
        sek48 = new Line(12.947, 211.02, 27.563, 204.512);
        sek49 = new Line(28.645, 238.171, 41.589, 228.765);
        sek51 = new Line(38.529, 250.198, 50.419, 239.491);
        sek52 = new Line(49.365, 261.469, 60.072, 249.579);
        sek53 = new Line(61.831, 271.355, 71.236, 258.412);
        sek54 = new Line(88.976, 287.232, 95.483, 272.615);
        sek56 = new Line(103.637, 292.696, 108.582, 277.479);
        sek57 = new Line(118.807, 296.576, 122.133, 280.926);
        sek58 = new Line(164.107, 16.812, 165.786, 0.812);
        sek59 = new Line(134.319, 299.188, 135.998, 283.188);

        zblatt = new Circle(150, 150, 150);
        zblattRand = new Circle(150, 150, 145);

    }


    public void layoutControls() {
        zblatt.setStyle("-fx-fill: transparent ; -fx-stroke:black; -fx-stroke-width: 5px");
        zblattRand.setStyle("-fx-fill: transparent ; -fx-stroke:white; -fx-stroke-type: outside; -fx-stroke-width: 5px");
        line1.setStyle("-fx-stroke-width: 9px");
        line2.setStyle("-fx-stroke-width: 9px");
        line3.setStyle("-fx-stroke-width: 9px");
        line4.setStyle("-fx-stroke-width: 9px");
        line5.setStyle("-fx-stroke-width: 9px");
        line6.setStyle("-fx-stroke-width: 9px");
        line7.setStyle("-fx-stroke-width: 9px");
        line8.setStyle("-fx-stroke-width: 9px");
        line9.setStyle("-fx-stroke-width: 9px");
        line10.setStyle("-fx-stroke-width: 9px");
        line11.setStyle("-fx-stroke-width: 9px");
        line12.setStyle("-fx-stroke-width: 9px");
        sek1.setStyle("-fx-stroke-width: 3px");
        sek2.setStyle("-fx-stroke-width: 3px");
        sek3.setStyle("-fx-stroke-width: 3px");
        sek4.setStyle("-fx-stroke-width: 3px");
        sek6.setStyle("-fx-stroke-width: 3px");
        sek7.setStyle("-fx-stroke-width: 3px");
        sek8.setStyle("-fx-stroke-width: 3px");
        sek9.setStyle("-fx-stroke-width: 3px");
        sek11.setStyle("-fx-stroke-width: 3px");
        sek12.setStyle("-fx-stroke-width: 3px");
        sek13.setStyle("-fx-stroke-width: 3px");
        sek14.setStyle("-fx-stroke-width: 3px");
        sek16.setStyle("-fx-stroke-width: 3px");
        sek17.setStyle("-fx-stroke-width: 3px");
        sek18.setStyle("-fx-stroke-width: 3px");
        sek19.setStyle("-fx-stroke-width: 3px");
        sek21.setStyle("-fx-stroke-width: 3px");
        sek22.setStyle("-fx-stroke-width: 3px");
        sek23.setStyle("-fx-stroke-width: 3px");
        sek24.setStyle("-fx-stroke-width: 3px");
        sek26.setStyle("-fx-stroke-width: 3px");
        sek27.setStyle("-fx-stroke-width: 3px");
        sek28.setStyle("-fx-stroke-width: 3px");
        sek29.setStyle("-fx-stroke-width: 3px");
        sek31.setStyle("-fx-stroke-width: 3px");
        sek32.setStyle("-fx-stroke-width: 3px");
        sek33.setStyle("-fx-stroke-width: 3px");
        sek34.setStyle("-fx-stroke-width: 3px");
        sek36.setStyle("-fx-stroke-width: 3px");
        sek37.setStyle("-fx-stroke-width: 3px");
        sek38.setStyle("-fx-stroke-width: 3px");
        sek39.setStyle("-fx-stroke-width: 3px");
        sek41.setStyle("-fx-stroke-width: 3px");
        sek42.setStyle("-fx-stroke-width: 3px");
        sek43.setStyle("-fx-stroke-width: 3px");
        sek44.setStyle("-fx-stroke-width: 3px");
        sek46.setStyle("-fx-stroke-width: 3px");
        sek47.setStyle("-fx-stroke-width: 3px");
        sek48.setStyle("-fx-stroke-width: 3px");
        sek49.setStyle("-fx-stroke-width: 3px");
        sek51.setStyle("-fx-stroke-width: 3px");
        sek52.setStyle("-fx-stroke-width: 3px");
        sek53.setStyle("-fx-stroke-width: 3px");
        sek54.setStyle("-fx-stroke-width: 3px");
        sek56.setStyle("-fx-stroke-width: 3px");
        sek57.setStyle("-fx-stroke-width: 3px");
        sek58.setStyle("-fx-stroke-width: 3px");
        sek59.setStyle("-fx-stroke-width: 3px");

        getChildren().addAll(line1, line2, line3, line4, line5, line6, line7, line8, line9, line10, line11, line12, sek1, sek2, sek3, sek4,
                sek6, sek7, sek8, sek9, sek11, sek12, sek13, sek14, sek16, sek17, sek18, sek19, sek21, sek22, sek23,
                sek24, sek26, sek27, sek28, sek29, sek31, sek32, sek33, sek34, sek36, sek37, sek38, sek39, sek41, sek42,
                sek43, sek44, sek46, sek47, sek48, sek49, sek51, sek52, sek53, sek54, sek56, sek57, sek58, sek59,zblatt, zblattRand);

    }

    public void addEventHandlers() {

    }


    public void addValueChangedListeners() {

    }


    public void addBindings() {

    }
}
