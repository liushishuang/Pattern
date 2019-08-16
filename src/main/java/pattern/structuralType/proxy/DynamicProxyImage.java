package pattern.structuralType.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyImage implements InvocationHandler {
    private Image realImage;

    public DynamicProxyImage(Image realImage) {
        this.realImage = realImage;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        return method.invoke(realImage,args);
    }
}
