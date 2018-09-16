package adapter.base;

public class Mp3Player implements MediaPlayer {
    @Override
    public void paly(String audioType, String fileName) {
        System.out.println("Mp3Player.paly" + " ---" + fileName);
    }
}
