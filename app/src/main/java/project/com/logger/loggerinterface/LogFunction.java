package project.com.logger.loggerinterface;

/**
 * Created by Bharat Ghimire on 3/2/16.
 */
public interface LogFunction {

    void d(String tag, String message);
    void e(String tag, String message);
    void i(String tag, String message);
    void json(String tag, String message);
    void v(String tag, String message);

}
