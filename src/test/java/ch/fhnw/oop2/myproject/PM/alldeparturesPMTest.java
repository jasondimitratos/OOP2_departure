package ch.fhnw.oop2.myproject.PM;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;

/**
 * Created by jasondimitratos on 02.05.16.
 */
public class alldeparturesPMTest {

    @Test
    public void testsave(){
        SelectedDeparturesPM myselectedD=new SelectedDeparturesPM();
        alldeparturesPM myDepartures=new alldeparturesPM(myselectedD);
        int numofdepartures=myDepartures.getDepartures().size();
        myDepartures.addDeparture();
        myDepartures.save();
        alldeparturesPM myDepartures2=new alldeparturesPM(myselectedD);
        int numofdepartures2=myDepartures.getDepartures().size();

       assertFalse(numofdepartures==numofdepartures2);
    }
    @Test
    public void testaddDeparture(){
        SelectedDeparturesPM myselectedD=new SelectedDeparturesPM();
        alldeparturesPM myDepartures=new alldeparturesPM(myselectedD);
        int size1=myDepartures.getDepartures().size();
        myDepartures.addDeparture();
        assertFalse(size1==myDepartures.getDepartures().size());
    }



}
