package concurrent.chapter6;

/***************************************
 * @author:Alex Wang
 * @Date:2017/3/19 QQ:532500648
 * QQ交流群:286081824
 ***************************************/
public class ReadWriteLock {
    private int readingReaders = 0;
    private int waitingReaders = 0;
    private int writingWriters = 0;
    private int waitingWriters = 0;
    private boolean preferWriter = true; //是否更喜欢Writer

    public ReadWriteLock() {
        this(true);
    }

    public ReadWriteLock(boolean preferWriter) {
        this.preferWriter = preferWriter;
    }

    public synchronized void readLock() throws InterruptedException {
        this.waitingReaders++; //读等待队列 ++
        try {
            //如果正在写 或 更喜欢写并写有人在等待写
            while (writingWriters > 0 || (preferWriter && waitingWriters > 0)) {
                this.wait();
            }
            this.readingReaders++;  //读队列++
        } finally {
            this.waitingReaders--; //读等待队列 --
        }
    }

    public synchronized void readUnlock() {
        this.readingReaders--; //读队列--
        this.notifyAll(); //唤醒
    }

    public synchronized void writeLock() throws InterruptedException {
        this.waitingWriters++; //写等待++
        try {
            //正在读 或正在写
            while (readingReaders > 0 || writingWriters > 0) {
                this.wait();
            }
            this.writingWriters++; //写队列++
        } finally {
            this.waitingWriters--; //写等待队列--
        }
    }

    public synchronized void writeUnlock() {
        this.writingWriters--; //写等待--
        this.notifyAll(); //唤醒
    }
}