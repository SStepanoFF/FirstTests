package mainPack;

import org.sikuli.script.Screen;

/**
 * Created by Sergey on 07.12.2014.
 */
public class Driver {

    private static Screen driver;

    public synchronized static Screen getInstatnce()
    {
        if (driver==null)
        {
            driver=new Screen();
        }
        return driver;
    }
}
