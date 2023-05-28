package beans.factory;

import beans.BeansException;

/**
 * @author Siuyun Yip
 * @version 1.0
 * @date 2023/5/16 15:09
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;
}
