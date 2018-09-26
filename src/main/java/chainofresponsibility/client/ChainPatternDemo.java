package chainofresponsibility.client;

import chainofresponsibility.base.AbstractLogger;
import chainofresponsibility.base.impl.ConsoleLogger;
import chainofresponsibility.base.impl.ErrorLogger;
import chainofresponsibility.base.impl.FileLogger;

/**
 * 责任链模式
 * 使用场景：1、有多个对象可以处理同一请求，具体哪个对象处理该请求由运时刻自动确定。
 *          2、子啊不明确指定接收者的情况下，向多个对象中的一个提交一个请求。
 *          3、可动态指定一组对象处理请求
 */
public class ChainPatternDemo {

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLogger();

        loggerChain.logMessage(AbstractLogger.INFO,"This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,"This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }

    private static AbstractLogger getChainOfLogger() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
}
