package behavioralType.mediator;

import java.util.Date;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 9:45 2018-7-25
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
