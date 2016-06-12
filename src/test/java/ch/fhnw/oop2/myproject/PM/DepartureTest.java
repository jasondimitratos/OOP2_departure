package ch.fhnw.oop2.myproject.PM;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by jasondimitratos on 18.04.16.
 */
public class DepartureTest {
    @Before
    public void setUp(){

    }
    @Test
    public void testinfoAsLine(){
        String[] testarray={"0","12:00","Zürich","IC34","6","12:30 brugg"};
        Departure testSub=new Departure(testarray);
        String StringSub= testSub.infoAsLine();
        assertEquals(StringSub,"0;12:00;Zürich;IC34;6;12:30 brugg");
    }



}
