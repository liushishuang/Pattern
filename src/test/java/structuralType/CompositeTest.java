package structuralType;

import org.junit.Test;
import structuralType.composite.Employee;

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
}
