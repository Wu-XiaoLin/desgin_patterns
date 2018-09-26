package delegate.base;

public class BusinessDelegate {
    BusinessLookUp lookup = new BusinessLookUp();
    BusinessService businessService;
    String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask(){
        businessService = lookup.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
