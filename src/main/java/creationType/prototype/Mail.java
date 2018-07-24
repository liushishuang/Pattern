package creationType.prototype;

import lombok.*;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 14:58 2018-7-24
 */
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor()
@ToString(exclude = {"subject"})
@Data
public class Mail implements Cloneable {
     @NonNull  private String receiver;
     private String subject;
     private String content;
     private String tail;

    //重写clone方法
    @Override
    public Mail clone() {
        Mail mail = null;
        try {
            //手动进行深度克隆
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return mail;
    }

}
