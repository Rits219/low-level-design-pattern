package LLDChainResponsibilityDesignPattern;

public class ErrorLogProcessor extends LogProcessor {
    ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel, String message) {
        if (logLevel != LogProcessor.ERROR) {
            super.log(logLevel, message);
        } else {
            System.out.println("ERROR" + message);
        }

    }


}
