package adapter.adapter;

import adapter.base.MediaPlayer;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if("mp4".equalsIgnoreCase(audioType)){
            advancedMediaPlayer = new Mp4Player();
        } else if("vlc".equalsIgnoreCase(audioType)){
            advancedMediaPlayer = new VlcPlayer();
        }
    }
    @Override
    public void paly(String audioType, String fileName) {
        if("mp4".equalsIgnoreCase(audioType)){
            advancedMediaPlayer.playMp4(fileName);
        } else if("vlc".equalsIgnoreCase(audioType)){
            advancedMediaPlayer.playVlc(fileName);
        }
    }
}
