package za.ac.cput.CollectionsApp;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/02/18.
 */
public class PeopleTest extends TestCase{
    @Test
    public void testGetCollection() throws Exception {
        People pp = new People();
        People pp1 = new People();
        assertEquals(pp,pp);

    }
}
