import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class HandlerFile {
    Logger theLogger;


    public HandlerFile() {
        LogManager logManager = LogManager.getLogManager();
        String loggerName = Logger.GLOBAL_LOGGER_NAME;
        theLogger = logManager.getLogger(loggerName);
        theLogger.setLevel(Level.ALL);
        try {
            FileHandler fileHandler = new FileHandler("/Users/irynasavchuk/Desktop/TESI/prova/provaLogger/src/TheLog_%g.log", 1000, 10);
            fileHandler.setLevel(Level.SEVERE);
            //Add the File Handler to Logger
            theLogger.addHandler(fileHandler);   
            //Change XML Formatter to Simple Formatter
            fileHandler.setFormatter(new SimpleFormatter());
        }
        catch (IOException ex)
      {
          Logger.getLogger(
           HandlerFile.class.getName()).log(Level.SEVERE, null, ex);
      }
      catch (SecurityException ex)
      {
          Logger.getLogger(HandlerFile.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    public void TestLogs()
  {
    for (int i = 0; i < 100; i++)
    {
      //Snippet 05: Test Log Entries with Different
      //Logging level
      //5.1: Log a Fatal Error
      theLogger.log(Level.SEVERE, "Fatal Error 17: Message" );
      //5.2: Log Some Warning Messages
      theLogger.log(Level.WARNING, "Warning 1: Warning Message");
      theLogger.log(Level.WARNING, "Warning 2: Warning Message");
      //5.3: Log Some Informational Messages
      theLogger.log(Level.INFO , "Info 1: The Message");
      theLogger.log(Level.INFO , "Info 2: The Message");
      theLogger.log(Level.INFO , "Info 3: The Message");
      theLogger.log(Level.INFO , "Info 4: The Message");
      theLogger.log(Level.INFO , "Info 5: The Message");
      theLogger.log(Level.INFO , "Info 6: The Message");
      //5.4: Log Some Informational Messages
      theLogger.log(Level.FINE  , "Fine 1: The Message");
      theLogger.log(Level.FINE , "Fine 2: The Message");
      theLogger.log(Level.FINE , "Fine 3: The Message");    
    }
  }
}
