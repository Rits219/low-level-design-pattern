package LLDChainResponsibilityDesignPattern;

public class InfoLogProcessor extends LogProcessor {
    InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel, String message) {
        if (logLevel != LogProcessor.INFO) {
            super.log(logLevel, message);
        } else {
            System.out.println("INFO" + message);
        }

    }


}
