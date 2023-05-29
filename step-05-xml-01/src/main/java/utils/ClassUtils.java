package utils;

/**
 * @author Siuyun Yip
 * @version 1.0
 * @date 2023/5/21 19:13
 */
public class ClassUtils {

    public static ClassLoader getDefaultClassLoader() {
        ClassLoader cl = null;
        try {
            cl = Thread.currentThread().getContextClassLoader();
        } catch (Throwable ex) {
            // cannot access thread context ClassLoader - falling back to system class loader...
        }

        if (cl == null) {
            // No thread context class loader -> use class loader of this class
            cl = ClassUtils.class.getClassLoader();
        }

        return cl;
    }
}
