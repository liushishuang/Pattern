package pattern.behavioralType.strategy.strategyformath;

/**
 * @Author: LiuShishuang
 * @Description:TODO
 * @Date: 23:22 2019/8/19
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

    }
}
