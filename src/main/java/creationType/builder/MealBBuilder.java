package creationType.builder;

/**
 * @Author: LiuShishuang
 * @Description:TODO
 * @Date: 22:37 2018/7/26
 */
public class MealBBuilder implements Builder {
    private Meal meal = new Meal();
    public void buildBurger() {

        meal.addItem(new ChickenBurger());

    }

    public void buildCake() {
        meal.addItem(new Pepsi());

    }

    public Meal getResult() {
        return meal;
    }
}
