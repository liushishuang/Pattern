package pattern.structuralType;

import org.junit.Test;
import pattern.structuralType.composite.Composite;
import pattern.structuralType.composite.Employee;
import pattern.structuralType.composite.Leaf;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 18:18 2018-7-24
 * 在使用  组合模式  时，其叶子和树枝的声明都是实现类，而不是接口，违反了依赖倒置原则。
 * 树枝和叶子实现统一接口, 树枝内部List组合接口
 *
 * =>将对象组合成树形结构来表示"部分-整体"的层次关系,,单个对象和组合对象的使用具有一致性
 *
 * - 定义的类,聚合了自身的数组, 定义了add/remove/遍历的方法
 *
 */
public class CompositeTest {

    @Test
    public void testComposite1() {
        Employee CEO = new Employee("John","CEO", 30000);

        Employee headSales = new Employee("Robert","Head Sales", 20000);

        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //打印该组织的所有员工
        System.out.println(CEO);

        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }

    }

    @Test
    public void testComposite2() {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));

        root.add(comp);

        Composite comp2 = new Composite("Composite XY");
        comp2.add(new Leaf("Leaf XYA"));
        comp2.add(new Leaf("Leaf XYB"));
        comp.add(comp2);

        root.add(new Leaf("Leaf C"));

        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);

        root.display(1);
    }
}
