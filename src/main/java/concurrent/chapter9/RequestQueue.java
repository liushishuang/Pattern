package concurrent.chapter9;

import java.util.LinkedList;

/**
 * 请求队列存放请求
 * 获取: 安全获取(remove)
 * 存放: 安全存放(add),notify
 */
public class RequestQueue {

    private final LinkedList<Request> queue = new LinkedList<>();

    public Request getRequest() {
        synchronized (queue) {
            while (queue.size() <= 0) {
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    return null;
                }
            }

            Request request = queue.removeFirst();
            return request;
        }
    }

    public void putRequest(Request request) {
        synchronized (queue) {
            queue.addLast(request);
            queue.notifyAll();
        }
    }
}