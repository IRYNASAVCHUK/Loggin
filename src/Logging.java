import java.util.logging.Level;
import java.util.logging.Logger;

public class Logging {
    Logger logger = Logger.getLogger("First Log Tester");

    public Logging() {
        super();
        logger.setLevel(Level.ALL);
    }
    // Loging with the different level

    public  void MethodSevere() {
        logger.entering("Logging", "MethodSevere");
        logger.severe("Severe Error");
        logger.exiting("Logging", "MethodSevere");
    }
    public  void MethodWarning() {
        logger.warning("Warning Error");
    }
     public  void MethodInfo() {
        logger.info("Info Error");
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Logging obj = new Logging();
        obj.MethodSevere();
        obj.MethodWarning();
        obj.MethodInfo();
        
        //HandlerFile file = new HandlerFile();
        //file.TestLogs();
    }
}
