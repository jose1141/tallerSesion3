package utils;

public class ConfigOWASP {

    public static final String HOST="http://localhost:8888";
    public static final String START_SCANER=HOST+"/JSON/ascan/action/scan/?url=";
    public static final String PROGRESS_SCANER=HOST+"/JSON/ascan/view/status/?scanId=";
    public static final String GENERATE_REPORT=HOST+"/OTHER/core/other/htmlreport/?";
    public static final String ATTACK_LIST=HOST+"/HTML/ascan/view/scanProgress/?scanId=";
    public static final String ALERTS=HOST+"/JSON/alert/view/alertsByRisk/?url=&recurse=";
}
