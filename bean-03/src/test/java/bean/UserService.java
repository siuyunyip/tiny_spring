package bean;

/**
 * @author Siuyun Yip
 * @version 1.0
 * @date 2023/5/16 16:47
 */
public class UserService {
    private String name;

    public UserService(String name) {
        this.name = name;
    }
    public void queryUserInfo() {
        System.out.println("name: " + name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("").append(name);
        return sb.toString();
    }
}
