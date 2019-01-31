package concurrent.chapter12;

/**
 * Balking design pattern
 * 不使用线程通讯
 */
public class BalkingClient {
    public static void main(String[] args) {
        BalkingData balkingData = new BalkingData("C:\\Users\\wangwenjun\\IdeaProjects\\java-concurrency\\design_pattern\\balking.txt", "===BEGIN====");
        new CustomerThread(balkingData).start();
        new WaiterThread(balkingData).start();
    }
}