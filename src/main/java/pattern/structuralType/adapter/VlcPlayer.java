package pattern.structuralType.adapter;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 16:29 2018-7-24
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("演奏VLC类型音乐"+fileName);
    }

    public void playMp4(String fileName) {

    }
}
