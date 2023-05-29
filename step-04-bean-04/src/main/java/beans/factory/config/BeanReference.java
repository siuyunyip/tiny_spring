package beans.factory.config;

/**
 * @author Siuyun Yip
 * @version 1.0
 * @date 2023/5/21 17:01
 */
public class BeanReference {
    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}

