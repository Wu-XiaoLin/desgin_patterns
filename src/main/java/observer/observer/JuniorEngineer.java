package observer.observer;

public class JuniorEngineer implements ITalent {

    @Override
    public void newJob(String job) {
        log.info("{} 不知道这份工作适不适合初级工程师." , job);
    }
}
