package concurrent.chapter9;

/**
 * 队列
 */
public class SuspensionClient {
    public static void main(String[] args) throws InterruptedException {

        final RequestQueue queue = new RequestQueue();
        new ClientThread(queue, "Alex").start();  //存放
        ServerThread serverThread = new ServerThread(queue); //收取
        serverThread.start();
        serverThread.join();

        Thread.sleep(10000);
        serverThread.close();
    }
}
