package observer.observer;

public class Architect implements ITalent {
    @Override
    public void newJob(String job) {
        log.info("这是一份很有挑战性的工作吗》》 {}" , job);
    }
}
