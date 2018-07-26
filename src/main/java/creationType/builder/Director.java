package creationType.builder;

/**
 * @Author: LiuShishuang
 * @Description:TODO
 * @Date: 22:41 2018/7/26
 */
public class Director {
    public void Construct(Builder builder) {
        builder.buildBurger();
        builder.buildCake();
    }
}
