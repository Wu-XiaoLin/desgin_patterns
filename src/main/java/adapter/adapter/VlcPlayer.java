package adapter.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("VlcPlayer.playVlc" + " ---" + fileName);
    }

    @Override
    public void playMp4(String fileName) {
    }
}
