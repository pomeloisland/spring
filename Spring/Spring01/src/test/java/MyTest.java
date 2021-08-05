import com.pomeloisland.dao.UserDaoMySqlImpl;
import com.pomeloisland.dao.UserDaoOracleImpl;
import com.pomeloisland.service.UserService;
import com.pomeloisland.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取ApplicationContext；拿到spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContest.xml");

        //需要什么就get什么！
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");

        userServiceImpl.getUser();
    }
}
