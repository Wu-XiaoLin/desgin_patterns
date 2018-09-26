package delegate.base;

import delegate.base.impl.EJBService;
import delegate.base.impl.JMSService;

public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType) {
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}
