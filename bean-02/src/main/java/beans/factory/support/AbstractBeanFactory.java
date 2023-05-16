package beans.factory.support;

import beans.BeansException;
import beans.factory.BeanFactory;
import beans.factory.config.BeanDefinition;

/**
 * @author Siuyun Yip
 * @version 1.0
 * @date 2023/5/16 16:02
 *
 * Design pattern: Template method pattern
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
