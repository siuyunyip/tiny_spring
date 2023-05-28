package beans;

/**
 * @author Siuyun Yip
 * @version 1.0
 * @date 2023/5/21 17:00
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
