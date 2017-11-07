import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by weigangqiang on 2017/11/7.
 */
public class PathUtils {
    public static Properties readJythonPath()
    {
        Properties pro = new Properties();
        try {
            FileInputStream in = new FileInputStream("jythonPath.properties");
            pro.load(in);
            in.close();
        }
        catch (IOException e)
        {
            System.out.println("read file error" + e);
        }
        return pro;
    }
}
