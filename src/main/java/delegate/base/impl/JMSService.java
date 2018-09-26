package delegate.base.impl;

import delegate.base.BusinessService;

public class JMSService implements BusinessService{
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
