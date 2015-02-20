package za.ac.cput.CollectionsApp;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/02/18.
 */
public class SpeedDialTest extends TestCase{
    @Test
    public void testGetSd() throws Exception {
        SpeedDial s = new SpeedDial();
        s.setSd(1,"0787063006");
        s.setSd(2, "0787063007");
        assertEquals((String)s.getSd().get(1),"0787063006");
    }


}
