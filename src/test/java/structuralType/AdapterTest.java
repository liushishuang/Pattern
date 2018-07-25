package structuralType;

import org.junit.Test;
import structuralType.adapter.AudioPlayer;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 16:02 2018-7-24
 *
 * => 对原有的类进行改造, 适应新接口参数
 *
 * 1.原始具有AdvancedMediaPlayer接口,播放vlc音乐和mp4音乐方法,直接传入fileName 想要它们实现新的接口MediaPlayer直接根据audioType,播放音乐
 * 2.接口为MediaPlayer   void play(String audioType, String fileName) 适配器实现这个接口,并注入AdvancedMedaiPlayer
 * 3. 适配器类构造方法 根据audioType方法,创建不同的对象,调用不同的方法->关联了接口,合成了具体的对象和方法
 * 4. audioPlayer类,注入适配器, 统一一个方法进行播放操作
 */
public class AdapterTest {
    @Test
    public void testAdapterType() {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");

    }
}
