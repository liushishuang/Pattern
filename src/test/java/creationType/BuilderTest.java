package creationType;

import creationType.builder.Director;
import creationType.builder.Meal;
import creationType.builder.MealABuilder;
import creationType.builder.MealBuilder;
import org.junit.Test;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 14:36 2018-7-24
 * 我们假设一个快餐店的商业案例，其中，一个典型的套餐可以是一个汉堡（Burger）和一杯冷饮（Cold drink）。
 * 汉堡（Burger）可以是素食汉堡（Veg Burger）或鸡肉汉堡（Chicken Burger），它们是包在纸盒中。
 * 冷饮（Cold drink）可以是可口可乐（coke）或百事可乐（pepsi），它们是装在瓶子中。
 *
 * => 对象很复杂,但是结构很清晰
 *
 * 1. Item接口表示事物,不同之处在于包装Packing
 * 2. 定义Packing接口,和两种包装Wrapping和Bottle
 * 3. 定义ColeDrink抽象类使用Bottle, Burger使用Wrapping 并定义Coke,Pepsi,ChickenBurger,MealBurger
 * 4. 定义Meal类套餐 具有Item的List,以及add和展示 方法
 * 5. MealBuilder来构建具体的套餐...前台直接使用就好了
 *
 */
public class BuilderTest {

    @Test
    public void testBuilder() {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }

    @Test
    public void testBuilder2() {
        Director director = new Director();
        MealABuilder mealABuilder = new MealABuilder();
       director.Construct(mealABuilder);
        Meal result = mealABuilder.getResult();
        result.showItems();

    }
}
