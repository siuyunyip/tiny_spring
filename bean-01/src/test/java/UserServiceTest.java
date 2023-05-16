import bean.UserService;
import org.junit.Test;

/**
 * @author Siuyun Yip
 * @version 1.0
 * @date 2023/5/16 14:46
 */
public class UserServiceTest {

    @Test
    public void test_BeanFactory() {
        BeanFactory beanFactory = new BeanFactory();

        // register bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // get bean by bean's name
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
