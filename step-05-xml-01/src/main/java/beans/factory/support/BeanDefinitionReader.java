package beans.factory.support;

import beans.BeansException;
import core.io.Resource;
import core.io.ResourceLoader;

/**
 * @author Siuyun Yip
 * @version 1.0
 * @date 2023/5/21 19:10
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;
}
