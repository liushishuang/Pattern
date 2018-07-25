package behavioralType.strategy;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 15:16 2018-7-25
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
