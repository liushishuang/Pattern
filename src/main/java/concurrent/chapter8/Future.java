package concurrent.chapter8;

/**
 * @author LiuShishuang
 * 调用的时候返回Future,调用Get的时候真正返回
 */
public interface Future<T> {

    T get() throws InterruptedException;

}