package core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Siuyun Yip
 * @version 1.0
 * @date 2023/5/21 19:12
 */
public interface Resource {
    InputStream getInputStream() throws IOException;
}
