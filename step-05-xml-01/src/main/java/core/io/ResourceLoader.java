package core.io;

/**
 * @author Siuyun Yip
 * @version 1.0
 * @date 2023/5/21 19:13
 */
public interface ResourceLoader {
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
