package behavioralType.strategy;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 15:15 2018-7-25
 */
public class OperationSubstract implements Strategy{

    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
