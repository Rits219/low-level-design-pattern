package LLDChainResponsibilityDesignPattern;

public class Main {
    public static void main(String args[]) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

//        logProcessor.log(LogProcessor.ERROR, "message");
//        logProcessor.log(LogProcessor.DEBUG, "message");
//        logProcessor.log(LogProcessor.INFO, "message");
        logProcessor.log(LogProcessor.NOT_INFO, "message");

    }
}
