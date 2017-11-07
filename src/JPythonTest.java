/**
 * Created by weigangqiang on 2017/11/1.
 */
import org.python.core.*;
import org.python.util.PythonInterpreter;


import java.util.Properties;

public class JPythonTest {

    private static void init()
    {
        Properties path = PathUtils.readJythonPath();
        PySystemState sys = Py.getSystemState();
        sys.path.add(path.getProperty("libPath"));
        sys.path.add(path.getProperty("sitePackagePath"));
        Properties props = new Properties();
        props.put("python.console.encoding", "UTF-8");
        props.put("python.security.respectJavaAccessibility", "false");
        props.put("python.import.site", "false");
        Properties preprops = System.getProperties();
        PythonInterpreter.initialize(preprops, props, new String[0]);

    }

    public static void main(String[] args)
    {
        init();

        PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.execfile("src/restCall.py");
        funCall(interpreter, "mergePost");
        funCall(interpreter, "mergeGet");
    }

    private static void funCall(PythonInterpreter interpreter, String funname) {

        PyFunction func = (PyFunction) interpreter.get(funname,PyFunction.class);
        PyObject pyobj = func.__call__(new PyString("yugangqiang"), new PyString("bbbbbb"));
        System.out.println("the result is " + pyobj.toString());
    }
}