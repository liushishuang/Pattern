package pattern.structuralType.adapter;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 16:30 2018-7-24
 */
public class Mp4Player implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {

    }

    public void playMp4(String fileName) {
        System.out.println("演奏Mp4音乐"+fileName);
    }
}
