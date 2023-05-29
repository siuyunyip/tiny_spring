package beans.factory.config;

/**
 * @author Siuyun Yip
 * @version 1.0
 * @date 2023/5/16 15:56
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
