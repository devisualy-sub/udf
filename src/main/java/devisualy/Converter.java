package devisualy;

import org.apache.hadoop.hive.ql.exec.UDF;

public class Converter extends UDF {
    public String evaluate(String method) {
        if (method.equals("GET")) {
          return "ゲット";
        }
        return method;
    }
}
