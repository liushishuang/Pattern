package pattern.behavioralType.strategy.strategyformath;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 15:16 2018-7-25
 */
public class OperationMultiply implements Strategy {

    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
