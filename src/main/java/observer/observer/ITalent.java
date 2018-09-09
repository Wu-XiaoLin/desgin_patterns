package observer.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface ITalent {

    public static final Logger log = LoggerFactory.getLogger(ITalent.class);

    void newJob(String job);
}
