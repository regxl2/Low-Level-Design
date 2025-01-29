package _16_chain_of_responsibility_pattern.design_logger;

public class Demo {
    public static void main(String[] args) {
        LogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logger.log(LogType.INFO, "This is info logger");
        logger.log(LogType.ERROR, "This is error logger");
        logger.log(LogType.DEBUG, "This is debug logger");
    }
}
