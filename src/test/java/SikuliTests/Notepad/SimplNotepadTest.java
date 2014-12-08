package SikuliTests.Notepad;

import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import mainPack.MainScreen;
/**
 * Created by Sergey on 07.12.2014.
 */
public class SimplNotepadTest {

    private Screen screen = new Screen();
    private App notepad = App.open("c:\\Windows\\System32\\notepad.exe");   //Open Notepad
    private MainScreen mainScreen;

    @BeforeMethod
    public void setup() throws FindFailed {
        mainScreen=new MainScreen();
    }

    @Test
    public void TextEnterTest() throws FindFailed, InterruptedException {
        //MainScreen mainScreen=new MainScreen();
        mainScreen.EnterText("Hello!");
        //assert
    }

     @Test
     public void SaveTest()throws FindFailed{
        //MainScreen mainScreen=new MainScreen();
        mainScreen.Save();
    }
}
