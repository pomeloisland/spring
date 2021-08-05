import com.pomeloisland.pojo.Student;
import com.pomeloisland.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContest.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }
    /*
   Student{
   name='柚屿',
   address=Address{address='西安'},
   books=[红楼梦, 西游记, 三国演义, 水浒传],
   hobbys=[听歌, 敲代码, 看电影],
   card={身份证=111111222222223333, 银行卡=1233484939459475497},
   games=[LOL, COC, BOB],
   wife='null',
   info={password=123456, url=男, driver=20190525, username=小明}}
    */
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("userOne");
        System.out.println(user.toString());
    }
}
