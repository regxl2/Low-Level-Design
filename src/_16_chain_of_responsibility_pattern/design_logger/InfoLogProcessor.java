package _16_chain_of_responsibility_pattern.design_logger;

public class InfoLogProcessor extends LogProcessor{
    public InfoLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(LogType logType, String message) {
        if(logType == LogType.INFO){
            System.out.println(message);
        }
        else{
            super.log(logType, message);
        }
    }
}
