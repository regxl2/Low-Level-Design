package _16_chain_of_responsibility_pattern.design_logger;

public abstract class LogProcessor {
    LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor logProcessor){
        this.nextLogProcessor = logProcessor;
    }

    public void log(LogType logType, String message){
        if(nextLogProcessor == null){
            System.out.println("Sorry invalid log type");
        }
        else {
            nextLogProcessor.log(logType, message);
        }
    }
}
