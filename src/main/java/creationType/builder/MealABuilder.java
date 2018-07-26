package creationType.builder;

import java.util.List;

/**
 * @Author: LiuShishuang
 * @Description:TODO
 * @Date: 22:34 2018/7/26
 */
public class MealABuilder implements Builder {
    private Meal meal = new Meal();
    public void buildBurger() {

        meal.addItem(new VegBurger());
    }

    public void buildCake() {
        meal.addItem(new Coke());
    }

    public Meal getResult() {
        return meal;
    }
}
