package mainPack;

import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

/**
 * Created by Sergey on 07.12.2014.
 */
public class MainScreen {
    private Screen mainWind;
    private Pattern mainView;
    private Pattern text;
    private Pattern rewriteMes;
    private Pattern yesBut;
    private Pattern fileButton;
    private Pattern nameDocTextField;
    private Pattern saveDocBut;
    private Pattern saveButton;
    //public App notepad= App.open("c:\\Windows\\System32\\notepad.exe");

    public MainScreen() throws FindFailed
    {
        mainView= new Pattern("D:\\My\\Study\\JavaTest\\FirstTests\\src\\main\\resources\\MainView.jpg");  //Create Pattern of program view
        text= new Pattern("D:\\My\\Study\\JavaTest\\FirstTests\\src\\main\\resources\\Text.jpg");
        fileButton=new Pattern("D:\\My\\Study\\JavaTest\\FirstTests\\src\\main\\resources\\File.jpg");
        nameDocTextField=new Pattern("D:\\My\\Study\\JavaTest\\FirstTests\\src\\main\\resources\\SaveTextField.jpg");
        saveDocBut=new Pattern("D:\\My\\Study\\JavaTest\\FirstTests\\src\\main\\resources\\SaveDocBut.jpg");
        saveButton=new Pattern("D:\\My\\Study\\JavaTest\\FirstTests\\src\\main\\resources\\SaveBut.jpg");
        rewriteMes=new Pattern("D:\\My\\Study\\JavaTest\\FirstTests\\src\\main\\resources\\RewriteMes.jpg");
        yesBut=new Pattern("D:\\My\\Study\\JavaTest\\FirstTests\\src\\main\\resources\\YesBut.jpg");
        //mainWind=getDriver().wait(mainView);
        mainWind=new Screen();
        mainWind.wait(mainView);
    }

    public MainScreen EnterText(String text) throws FindFailed, InterruptedException {
        mainWind.type(mainView,text);
        return this;
    }

    public MainScreen WaitandClick(Pattern pat) throws  FindFailed
    {
        mainWind.wait(pat,3);
        mainWind.click(pat);
        return this;
    }

    public MainScreen Save() throws FindFailed {
        WaitandClick(fileButton);
        WaitandClick(saveButton);
        mainWind.wait(nameDocTextField);
        mainWind.type("d:\\Temp\\TempDoc.txt");
        WaitandClick(saveDocBut);
        RewriteDoc();
        return this;
    }

    public MainScreen RewriteDoc() throws FindFailed {
        mainWind.wait(rewriteMes,1);
        mainWind.click(yesBut);
        return this;
    }

    /*protected Screen getDriver()
    {
        return mainPack.Driver.getInstatnce();
    }*/
}
