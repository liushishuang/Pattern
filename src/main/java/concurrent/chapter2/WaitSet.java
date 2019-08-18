package concurrent.chapter2;

/**
 * WaitSet in synchronized monitor
 * Wait和notify的内部机制=> waitset是线程的休息室,放到monitor锁中
 */
public class WaitSet {

    private static final Object LOCK = new Object();

    private static void work() {
        synchronized (LOCK) {
            System.out.println("Begin....");

            try {
                System.out.println("Thread will coming");
                LOCK.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread will out.");
        }
    }

    /**
     * 1.所有的对象都会有一个wait set,用来存放调用了该对象wait方法之后进入block状态线程
     * 2.线程被notify之后，不一定立即得到执行
     * 3.线程从wait set中被唤醒顺序不一定是FIFO.
     * 4.线程被唤醒后，必须重新获取锁
     *
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        new Thread(WaitSet::work).start();

        Thread.sleep(1000);
        synchronized (LOCK) {
            LOCK.notify();
        }
    }
}