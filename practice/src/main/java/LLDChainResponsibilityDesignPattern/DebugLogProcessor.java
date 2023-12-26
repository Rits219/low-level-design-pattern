package LLDChainResponsibilityDesignPattern;

public class DebugLogProcessor extends LogProcessor {
    DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel, String message) {
        if (logLevel != LogProcessor.DEBUG) {
            super.log(logLevel, message);
        } else {
            System.out.println("DEBUG" + message);
        }

    }


}
