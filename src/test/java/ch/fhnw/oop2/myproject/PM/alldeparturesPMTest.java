package ch.fhnw.oop2.myproject.PM;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;

/**
 * Created by jasondimitratos on 02.05.16.
 */
public class alldeparturesPMTest {
    SelectedDeparturesPM myselectedD;
    alldeparturesPM myDepartures;
    @Before
    public void init(){
        myselectedD=new SelectedDeparturesPM();
        myDepartures=new alldeparturesPM(myselectedD);
    }

    @Test
    public void testsave(){

        int numofdepartures=myDepartures.getDepartures().size();


        myDepartures.addDeparture();
        myDepartures.save();
        int numofdepartures2=myDepartures.getDepartures().size();

       assertFalse(numofdepartures==numofdepartures2);
    }
    @Test
    public void testaddDeparture(){
        int size1=myDepartures.getDepartures().size();

        myDepartures.addDeparture();

        assertFalse(size1==myDepartures.getDepartures().size());
    }
    



}
