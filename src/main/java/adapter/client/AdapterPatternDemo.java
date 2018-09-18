package adapter.client;

/**
 * 适配器模式
 * 使用场景：
 * 1、系统中需要使用现有的类，而此类的接口不符合规范的时候。
 * 2、想要创建一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，包括一些可能在将来
 * 引进的类一起工作，这些源类不一定有一致的接口。
 * 3、通过接口转换，将一个类插入到另一个类中。（比如老虎和飞禽，现在多了一个飞虎，在不增加实体的需求下，
 * 增加一个适配器，在里面包容一个虎对象，实现飞的接口。）
 *
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.paly("Mp3","爱是你我.mp3");
        audioPlayer.paly("Mp4","永远永远.mp4");
        audioPlayer.paly("vlc","away.vlc");
        audioPlayer.paly("flv","北京爱情故事.flv");


    }
}
