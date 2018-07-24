package structuralType;

import org.junit.Test;
import structuralType.proxy.DynamicProxyImage;
import structuralType.proxy.Image;
import structuralType.proxy.ProxyImage;
import structuralType.proxy.RealImage;

import java.lang.reflect.Proxy;

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
