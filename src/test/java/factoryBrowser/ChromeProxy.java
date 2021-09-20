package factoryBrowser;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ChromeProxy implements IBrowser {
    @Override
    public WebDriver create() {
        String rutaDriver="src/test/resources/driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",rutaDriver);

        // PROXY - ZAP
        Map<String ,Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service",false);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("ignore-certificate-errors");
        options.setExperimentalOption("prefs",prefs);

        Proxy proxy= new Proxy();
        proxy.setHttpProxy("127.0.0.1:8888");
        proxy.setSslProxy("127.0.0.1:8888");

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability("proxy",proxy);
        capabilities.setCapability(ChromeOptions.CAPABILITY,options);

        ChromeDriver driver = new ChromeDriver(capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return driver;
    }
}
