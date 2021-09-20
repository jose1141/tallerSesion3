package singletonSession;

import factoryBrowser.FactoryBrowser;
import org.openqa.selenium.WebDriver;

public class Session {
    // attributo del mismo tipo
    private static Session instance= null;
    private WebDriver driver;

    // contructor Privado
    private Session(){
        driver = FactoryBrowser.make(FactoryBrowser.PROXY).create();
    }

    // no usar synchronized cuando ejecutemo de forma paralela
    // metodo estatico publico que me retorne la instancia unica
    public static Session getSession(){
        if (instance==null)
            instance= new Session();
        return instance;
    }

    public void closeSession(){
        driver.quit();
        instance=null;
    }

    public WebDriver getDriver(){
        return driver;
    }

}
