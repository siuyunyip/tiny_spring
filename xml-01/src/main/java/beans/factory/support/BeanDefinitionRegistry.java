package beans.factory.support;

import beans.BeansException;
import beans.factory.config.BeanDefinition;

/**
 * @author Siuyun Yip
 * @version 1.0
 * @date 2023/5/16 16:21
 */
public interface BeanDefinitionRegistry {
    /**
     * register bean definition into container
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * query bean by bean name
     *
     * @param beanName
     * @return
     * @throws BeansException
     */
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * check if the container contained the bean definition of the beanName
     * @param beanName
     * @return
     */
    boolean containsBeanDefinition(String beanName);

    /**
     * return the names of all beans defined in this registry
     * @return
     */
    String[] getBeanDefinitionNames();
}
