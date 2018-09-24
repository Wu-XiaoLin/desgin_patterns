package mediator.base;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + " - " + user.getName() + "说了一句：" + message);
    }
}
