package Lesson_13;

import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

public class ForLog {
    private final Logger log = LoggerFactory.getLogger(ForLog.class);

    public void process(String info) {
        log.debug("Test is: {}", info);
        /*if (log.isDebugEnabled()) {
            log.info("Test is " + info);
        }*/
    }


}
