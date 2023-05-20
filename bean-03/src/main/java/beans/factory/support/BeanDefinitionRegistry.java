package beans.factory.support;

import beans.factory.config.BeanDefinition;

/**
 * @author Siuyun Yip
 * @version 1.0
 * @date 2023/5/16 16:21
 */
public interface BeanDefinitionRegistry {
    /**
     * interface of register a bean definition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
