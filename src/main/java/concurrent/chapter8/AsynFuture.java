package concurrent.chapter8;

/**
 *  Future Design Pattern 未来者
 *
 *  AsyncFuture异步Future
 */
public class AsynFuture<T> implements Future<T> {

    private volatile boolean done = false;

    private T result;

    /**
     * 判断是否完成
     * @param result
     */
    public void done(T result) {
        synchronized (this) {
            this.result = result;
            this.done = true;
            this.notifyAll();
        }
    }

    @Override
    public T get() throws InterruptedException {
        //如果没有完成,等待
        synchronized (this) {
            while (!done) {
                this.wait();
            }
        }
        return result;
    }
}
