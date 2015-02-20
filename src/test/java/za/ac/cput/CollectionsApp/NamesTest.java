package za.ac.cput.CollectionsApp;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/02/17.
 */
public class NamesTest extends TestCase{
    @Test
    public void testGetNames() throws Exception {
        Names n = new Names();

        n.getNames().add("Andisiwe");
        n.getNames().add("Ngwenduna");
        Assert.assertEquals(n.getNames().get(0), "Andisiwe");
    }
}
