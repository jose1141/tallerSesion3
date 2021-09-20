package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginModal {
    public TextBox emailTxt= new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail"));
    public TextBox passwordTxt= new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword"));
    public Button loginButon= new Button(By.id("ctl00_MainContent_LoginControl1_ButtonLogin"));

}
