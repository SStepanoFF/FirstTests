package mainPack;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

/**
 * Created by Sergey on 07.12.2014.
 */
public class MainScreen {
    private Pattern mainView;
    private Pattern text;
    private Screen mainWind;
    private Pattern fileButton;
    private Pattern nameDocTextField;
    private Pattern saveDocBut;
    private Pattern saveButton;

    public MainScreen() throws FindFailed
    {
        mainView= new Pattern("d:\\Work\\Programming\\Sikuli\\Foto\\Notepad\\MainView.png");  //Create Pattern of program view
        text= new Pattern("d:\\Work\\Programming\\Sikuli\\Foto\\Notepad\\Text.png");
        fileButton=new Pattern("d:\\Work\\Programming\\Sikuli\\Foto\\Notepad\\File.jpg");
        nameDocTextField=new Pattern("d:\\Work\\Programming\\Sikuli\\Foto\\Notepad\\SaveTextField.png");
        saveDocBut=new Pattern("d:\\Work\\Programming\\Sikuli\\Foto\\Notepad\\SaveDocBut.png");
        saveButton=new Pattern("d:\\Work\\Programming\\Sikuli\\Foto\\Notepad\\SaveBut.png");
        //mainWind=getDriver().wait(mainView);
        mainWind=new Screen();
        mainWind.wait(mainView);
    }

    public MainScreen EnterText(String text) throws FindFailed, InterruptedException {
        mainWind.type(mainView,text);
        //mainWind.wait(1);
        return this;
    }

    public MainScreen WaitandClick(Pattern pat) throws  FindFailed
    {
        mainWind.wait(pat);
        mainWind.click(pat);
        return this;
    }

    public MainScreen Save() throws FindFailed {
        WaitandClick(fileButton);
        WaitandClick(saveButton);
        mainWind.wait(nameDocTextField);
        mainWind.type("d:\\Work\\Programming\\Sikuli\\Temp\\TempDoc.txt");
        WaitandClick(saveDocBut);
        return this;
    }

    /*protected Screen getDriver()
    {
        return mainPack.Driver.getInstatnce();
    }*/
}
