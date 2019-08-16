package pattern.behavioralType;

import pattern.behavioralType.iterator.Iterator;
import pattern.behavioralType.iterator.NameRepository;
import org.junit.Test;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 9:24 2018-7-25
 * 迭代器模式就是分离了集合对象的遍历行为，抽象出一个迭代器类来负责，
 * 这样既可以做到不暴露集合的内部结构，又可让外部代码透明地访问集合内部的数据。
 */
public class IteratorTest {
    @Test
    public void testIterator() {
        String[] names = {"a","b","c"};

        NameRepository namesRepository = new NameRepository(names);

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
