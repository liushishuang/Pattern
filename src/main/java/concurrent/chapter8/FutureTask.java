package concurrent.chapter8;

/**
 * @author LiuShishuang
 * 在Call里面真正做事情
 */
public interface FutureTask<T> {

    T call();
}
