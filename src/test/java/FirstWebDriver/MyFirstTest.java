package FirstWebDriver;

import org.junit.internal.runners.statements.Fail;
import org.sikuli.api.DesktopScreenRegion;
import org.sikuli.api.ImageTarget;
import org.sikuli.api.ScreenRegion;
import org.sikuli.api.Target;
import org.sikuli.api.visual.Canvas;
import org.sikuli.api.visual.DesktopCanvas;
import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import javax.swing.plaf.synth.Region;
import java.io.File;

public class MyFirstTest {

    @Test
    public void newTest() throws FindFailed {
        Screen screen = new Screen();
        //ScreenRegion test=new DesktopScreenRegion();
        // mainView= new Pattern("d:\\Work\\Programming\\Sikuli\\Foto\\Notepad\\MainView.png");  //Create Pattern of program view
        App notepad = App.open("c:\\Windows\\System32\\notepad.exe");   //Open Notepad
        Pattern mainView= new Pattern("d:\\Work\\Programming\\Sikuli\\Foto\\Notepad\\MainView.png");  //Create Pattern of program view
        Pattern saveButton=new Pattern("d:\\Work\\Programming\\Sikuli\\Foto\\Notepad\\SaveBut.png");
        Pattern nameDocTextField=new Pattern("d:\\Work\\Programming\\Sikuli\\Foto\\Notepad\\SaveTextField.png");
        Pattern saveDocBut=new Pattern("d:\\Work\\Programming\\Sikuli\\Foto\\Notepad\\SaveDocBut.png");

        screen.wait(mainView); //Wait mainView img

        screen.type(screen.getCenter(),"He  llo!");
        //Pattern text=new Pattern("d:\\Work\\Programming\\Sikuli\\Foto\\Notepad\\Text.png");
        Pattern text= new Pattern("d:\\Work\\Programming\\Sikuli\\Foto\\Notepad\\Text.png");

        try
        {
            screen.wait(text,2);
           ScreenRegion textR= new DesktopScreenRegion();
            //Create canvas with box and labels
            Canvas canvas=new DesktopCanvas();
            canvas.addBox(textR);
            canvas.addLabel(textR,"Correct text").display(3);
        }
        catch (FindFailed e)
        {
            screen.type(screen,"  WRONG TEXT!!!");
            System.out.println("Incorrect TEXT!!!");
        }
        //Save document
        Pattern FileButton=new Pattern("d:\\Work\\Programming\\Sikuli\\Foto\\Notepad\\File.jpg");
        screen.click(FileButton);
        screen.wait(saveButton, 2);
        screen.click(saveButton);
        screen.wait(nameDocTextField,2);
        screen.type("d:\\Work\\Programming\\Sikuli\\Temp\\TempDoc.txt");
        screen.click(saveDocBut);
    }
}
