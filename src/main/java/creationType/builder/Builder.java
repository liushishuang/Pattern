package creationType.builder;

import java.util.List;

public interface Builder {
     abstract void buildBurger();

     abstract void buildCake();

     abstract Meal getResult();
}
