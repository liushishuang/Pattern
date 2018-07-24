package structuralType.adapter;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 16:25 2018-7-24
 * 适配器实现这个接口,根据类型演奏音乐,而不是只有以前的两种
 */
public interface MediaPlayer {
    void play(String audioType, String fileName);
}
