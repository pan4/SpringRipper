package quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by andrii.peliak on 4/14/2016.
 */
public class Main {
    public static void main(String[] arg) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        context.getBean(Quotes.class);
    }
}
