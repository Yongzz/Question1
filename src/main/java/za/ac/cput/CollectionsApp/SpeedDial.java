package za.ac.cput.CollectionsApp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/02/17.
 */
public class SpeedDial {
    Map sd = new HashMap();

    public void setSd(int key,String phoneNummber) {
        sd.put(key,phoneNummber);
    }


    public Map getSd()
    {
        return sd;
    }
}
