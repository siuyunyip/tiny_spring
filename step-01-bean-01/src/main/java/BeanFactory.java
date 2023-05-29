import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Siuyun Yip
 * @version 1.0
 * @date 2023/5/16 14:43
 */
public class BeanFactory {
    // use hashmap as a container to store bean
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    // get bean by bean's name
    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    // key: bean name; val: bean definition
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}
