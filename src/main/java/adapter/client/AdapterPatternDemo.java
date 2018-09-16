package adapter.client;

public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.paly("Mp3","爱是你我.mp3");
        audioPlayer.paly("Mp4","永远永远.mp4");
        audioPlayer.paly("vlc","away.vlc");
        audioPlayer.paly("flv","北京爱情故事.flv");


    }
}
