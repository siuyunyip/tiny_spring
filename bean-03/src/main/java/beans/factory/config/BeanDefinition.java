package beans.factory.config;

/**
 * @author Siuyun Yip
 * @version 1.0
 * @date 2023/5/16 15:51
 */
public class BeanDefinition {
    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
