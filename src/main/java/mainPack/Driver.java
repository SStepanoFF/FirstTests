package mainPack;

import org.sikuli.script.App;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

/**
 * Created by Sergey on 07.12.2014.
 */
public class Driver {

    public App notepad;

    public Driver(){
        notepad=App.open("c:\\Windows\\System32\\notepad.exe");
    }

    public void Open(){
        notepad=App.open("c:\\Windows\\System32\\notepad.exe");
        //return this;
    }

    public void Close(){
        notepad.close();
        //return  this;
    }

    /*private static Screen driver;

    public synchronized static Screen getInstatnce()
    {
        if (driver==null)
        {
            driver=new Screen();
        }
        return driver;
    }*/
}
