package creationType.builder;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 14:35 2018-7-24
 * 这里是具体的建造者,也许不是最好的选择
 */
public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
