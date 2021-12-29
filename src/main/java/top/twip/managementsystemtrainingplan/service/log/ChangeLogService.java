package top.twip.managementsystemtrainingplan.service.log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.twip.managementsystemtrainingplan.entity.Log;
import top.twip.managementsystemtrainingplan.utils.identify.LogIdentify;
import top.twip.managementsystemtrainingplan.utils.result.WebResult;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 15:09
 */
@Service
public class ChangeLogService {
    private final LogIdentify logIdentify;

    @Autowired
    public ChangeLogService(LogIdentify logIdentify) {
        this.logIdentify = logIdentify;
    }

    //新增选课记录
    public WebResult<Log> createNewLog(Log log){
        logIdentify.createNewLog(log);
        return new WebResult<>(10000,"新增成功");
    }
}
