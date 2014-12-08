package SikuliTests.Notepad;

import org.junit.BeforeClass;
import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.*;

import mainPack.MainScreen;
import mainPack.Driver;
/**
 * Created by Sergey on 07.12.2014.
 */
public class SimpleNotepadTest {

    //private Screen screen = new Screen();
    private App notepad;   //Open Notepad
    //private Driver driver;
    private MainScreen mainScreen;


    @BeforeTest
    public void Setup() throws FindFailed {
        notepad = App.open("c:\\Windows\\System32\\notepad.exe");
        mainScreen=new MainScreen();
    }

    @AfterTest
    public void TearDown(){
        notepad.close();
    }

    @Test
    public void TextEnterTest() throws FindFailed, InterruptedException {
        mainScreen.EnterText("Hello!");
        //assert
    }

     @Test (dependsOnMethods = {"TextEnterTest"})
     public void SaveTest()throws FindFailed{
        mainScreen.Save();
    }
}
