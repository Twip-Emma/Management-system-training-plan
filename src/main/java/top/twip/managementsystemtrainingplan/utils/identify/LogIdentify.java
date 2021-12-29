package top.twip.managementsystemtrainingplan.utils.identify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 10:06
 */
@Component
public class LogIdentify {
    private final LogIdentifyTool logIdentifyTool;

    @Autowired
    public LogIdentify(LogIdentifyTool logIdentifyTool) {
        this.logIdentifyTool = logIdentifyTool;
    }
}
