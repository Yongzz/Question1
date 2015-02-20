package za.ac.cput.CollectionsApp;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/02/17.
 */
public class PhoneNumbersTest extends TestCase {


    @Test
    public void testGetPhoneNo() throws Exception {

        PhoneNumbers p = new PhoneNumbers();
        PhoneNumbers p1 = new PhoneNumbers();
        p.getPhoneNo().add("0787063006");
        p.getPhoneNo().add("0787063007");

        p1.getPhoneNo().add("0787063006");
        p1.getPhoneNo().add("0787063007");
        assertEquals(p.getPhoneNo(),p1.getPhoneNo());
    }
}
