import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 16:04 2018-7-24
 * CreationType:
 * 1. 工厂/抽象工厂:
 * 2. 单例模式: 饿汉,懒汉(线程安全/不安全/双重锁),静态内部类,枚举类
 * 3. 建造者模式: 对象比较复杂,但是结构比较固定,单个结构的组成也比较固定
 * 4. 原型模式: 创建对象成本大
 *
 * StructuralType:
 * 1. 适配器模式: 现有的类和接口无法满足新接口, 新建适配器,实现新接口,关联原接口并使用
 * 2. 桥接模式:两个类 . 这两种类型的类可被结构化改变而互不影响。继承会造成类爆炸问题
 * 3. 组合模式: 是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，用来表示部分以及整体层次。在自己内部关联一个自身的数组
 * 4. 装饰器模式: 向现有的对象添加新的功能,不改变结构. 装饰器抽象类实现接口+关联接口(多次装饰)
 * 5. 外观模式: 统一管理类和方法
 * 6. 享元模式: 依据内蕴,减少类创建的数量
 * 7. 代理模式: 相同属性/方法
 *
 * BehavioralType:
 * 1. 责任链模式: 多个对象处理同一个事件, 并且具有明显的链式关系.
 * 2. 命令模式: 记录对于对象的一系列操作命令. 关联的是对象
 * 3. 解释器模式:
 * 4. 迭代器模式:
 * 5. 中介者模式: 不同类之间通信复杂性. 互相依赖
 * 6. 备忘录模式: 继续对象中间状态
 * 7. 观察者模式: 一对多关系
 * 8. 状态模式: 不同状态对应不同行为
 * 11. 访问者模式:
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        creationType.AllTest.class,
        structuralType.AllTest.class,
        behavioralType.AllTest.class
})
public class AllTest {
    /**
     *
     * 1. 依赖倒转原则DIP (Dependence Inversion Principle): 针对接口编程,依赖抽象而不是依赖于具体, 是开闭原则的基础
     * 2. 开闭原则OCP  (Open Close Principle): 对扩展开放, 对修改关闭
     * 3. 里氏替换原则LSK  (Liskov Substitution Principle):只有当衍生类可以替换掉基类
     * 4. 接口隔离原则ISP  (Interface Segregation Principle): 单一接口原则
     * 5. 迪米特法则DP  (Demeter Principle): 不知道原则, 松耦合
     * 6. 合成复用原则CRP  (Composite Reuse Principle): 尽量使用合成/聚合方式, 而不是用继承
     */
}
