package bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Siuyun Yip
 * @version 1.0
 * @date 2023/5/21 17:43
 */
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "Anne");
        hashMap.put("10002", "Marriane");
        hashMap.put("10003", "Rachel");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }
}
