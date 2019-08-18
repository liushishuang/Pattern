package concurrent.chapter7;


import lombok.Getter;
import lombok.ToString;

// 不会继承
@Getter
@ToString
final public class Person {
    private final String name;
    private final String address;

    // 构造后,不允许修改
    public Person(final String name, final String address) {
        this.name = name;
        this.address = address;
    }
}