package adapter.client;

import adapter.adapter.MediaAdapter;
import adapter.base.MediaPlayer;
import adapter.base.Mp3Player;

public class AudioPlayer implements MediaPlayer {

    MediaPlayer mediaPlayer;

    @Override
    public void paly(String audioType, String fileName) {

        if ("mp3".equalsIgnoreCase(audioType)) {
            mediaPlayer = new Mp3Player();
            mediaPlayer.paly(audioType,fileName);
        } else if ("mp4".equalsIgnoreCase(audioType) || "vlc".equalsIgnoreCase(audioType)) {
            mediaPlayer = new MediaAdapter(audioType);
            mediaPlayer.paly(audioType,fileName);
        }else{
            System.out.println("cannot palyer");
        }
    }
}
