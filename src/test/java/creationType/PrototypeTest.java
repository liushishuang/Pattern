package creationType;

import org.junit.Test;
import creationType.prototype.Mail;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 15:00 2018-7-24
 */
public class PrototypeTest {
    @Test
    public void testPrototype() {
        Mail mail = new Mail();
        mail.setContent("hello world");

        Mail mail2 = mail.clone();

        System.out.println(mail2);

    }

}
