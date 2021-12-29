package top.twip.managementsystemtrainingplan.utils.identify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.twip.managementsystemtrainingplan.dao.LogDao;
import top.twip.managementsystemtrainingplan.utils.tool.GetUUID;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 10:06
 */
@Component
public class LogIdentifyTool {
    private final LogDao logDao;
    private final GetUUID getUUID;

    @Autowired
    public LogIdentifyTool(LogDao logDao, GetUUID getUUID) {
        this.logDao = logDao;
        this.getUUID = getUUID;
    }
}
