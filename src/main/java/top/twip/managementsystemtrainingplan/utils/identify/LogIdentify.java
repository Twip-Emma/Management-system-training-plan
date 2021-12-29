package top.twip.managementsystemtrainingplan.utils.identify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.twip.managementsystemtrainingplan.entity.Log;

import java.util.Date;
import java.util.List;

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

    //无条件搜索全部选课记录
    public List<Log> findAllLog(){
        return logIdentifyTool.findAllLog();
    }

    //根据学生ID搜索选课记录
    public List<Log> findLogByUserId(String userId){
        return logIdentifyTool.findLogByUserId(userId);
    }

    //根据课程ID搜索选课记录
    public List<Log> findLogBySourseId(String sourseId){
        return logIdentifyTool.findLogBySourseId(sourseId);
    }

    //增加一个选课记录
    public void createNewLog(Log log){
        logIdentifyTool.createNewLog(log);
    }
}
