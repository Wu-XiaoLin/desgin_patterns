package interceptingfilter.client;

import interceptingfilter.base.FilterManager;
import interceptingfilter.base.Target;
import interceptingfilter.base.impl.AuthenticationFilter;
import interceptingfilter.base.impl.DebugFilter;

/**
 * 拦截过滤器模式
 */
public class InterceptingFilterPatternDemo {

    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
