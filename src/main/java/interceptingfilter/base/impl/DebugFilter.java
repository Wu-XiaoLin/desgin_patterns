package interceptingfilter.base.impl;

import interceptingfilter.base.Filter;

public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
