package factoryBrowser;

public class FactoryBrowser {
    public static final String CHROME="chrome";
    public static final String PROXY="proxy";
    public static final String FIREFOX="firefox";

    public static IBrowser make(String type){
        IBrowser browser;

        switch (type){
            case CHROME:
                browser= new Chrome();
                break;
            case PROXY:
                browser= new ChromeProxy();
                break;
            case FIREFOX:
                browser = new Firefox();
                break;
            default:
                browser= new Edge();
                break;
        }

        return  browser;
    }
}
