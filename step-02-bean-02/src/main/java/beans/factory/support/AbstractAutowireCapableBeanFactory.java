package beans.factory.support;

import beans.BeansException;
import beans.factory.config.BeanDefinition;

/**
 * @author Siuyun Yip
 * @version 1.0
 * @date 2023/5/16 16:13
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            // instantiate the bean with class information in bean definition
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        addSingleton(beanName, bean);
        return bean;
    }
}
