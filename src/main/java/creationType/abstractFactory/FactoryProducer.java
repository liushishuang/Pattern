package creationType.abstractFactory;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 11:04 2018-7-24
 */
public  class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
