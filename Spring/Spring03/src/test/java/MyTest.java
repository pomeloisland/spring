import com.pomeloisland.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        //Spring容容器，就类似于婚介网站！
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContest.xml");

        User user = (User) context.getBean("u2");
        user.show();
    }
}
