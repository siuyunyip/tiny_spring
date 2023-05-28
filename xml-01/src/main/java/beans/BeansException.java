package beans;

/**
 * @author Siuyun Yip
 * @version 1.0
 * @date 2023/5/16 15:09
 *
 * define bean exception
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {super(msg);}

    public BeansException(String msg, Throwable cause) { super(msg, cause); }

}
