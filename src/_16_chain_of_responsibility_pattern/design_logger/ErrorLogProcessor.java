package _16_chain_of_responsibility_pattern.design_logger;

public class ErrorLogProcessor extends LogProcessor{
    public ErrorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }
    @Override
    public void log(LogType logType, String message){
        if(logType == LogType.ERROR){
            System.out.println(message);
        }
        else{
            super.log(logType, message);
        }
    }
}
