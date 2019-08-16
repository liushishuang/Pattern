package pattern.structuralType;

import org.junit.Test;
import pattern.structuralType.proxy.DynamicProxyImage;
import pattern.structuralType.proxy.Image;
import pattern.structuralType.proxy.ProxyImage;
import pattern.structuralType.proxy.RealImage;

import java.lang.reflect.Proxy;

/**
 * 1. Image接口和RealImage实现类
 * 2. ProxyImage代理类, 注入RealImage对象 + 相同属性 + 实现相同接口
 */
public class ProxyTest {

    @Test
    public void testProxy() {
        Image image = new ProxyImage("hello.jpg");
        image.display();

    }

    @Test
    public void testProxy2() {
        Image realImage = new RealImage("test");
        DynamicProxyImage handler = new DynamicProxyImage(realImage);

        Image image = (Image) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Image.class}, handler);
        image.display();

    }
}
