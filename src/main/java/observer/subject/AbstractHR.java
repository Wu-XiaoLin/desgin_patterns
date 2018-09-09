package observer.subject;

import observer.observer.ITalent;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractHR {

    protected List<ITalent> allTalents = new ArrayList<ITalent>();

    /**
     * 发布工作
     * @param job
     */
    public abstract void publishJob(String job);

    public void addTalent(ITalent talent) {
        allTalents.add(talent);
    }

    public void removeTalent(ITalent talent) {
        allTalents.remove(talent);
    }

}
