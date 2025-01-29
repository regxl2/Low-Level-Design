package _16_chain_of_responsibility_pattern.design_logger;

public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(LogType logType, String message) {
        if(logType == LogType.DEBUG){
            System.out.println(message);
        }
        else{
            super.log(logType, message);
        }
    }
}
