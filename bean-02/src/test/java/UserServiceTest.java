import bean.UserService;
import beans.factory.config.BeanDefinition;
import beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @author Siuyun Yip
 * @version 1.0
 * @date 2023/5/16 16:46
 */
public class UserServiceTest {

    @Test
    public void test_BeanFactory() {
        // initiate BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // register bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // the first time obtaining bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        // the second time obtaining bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
    }
}
