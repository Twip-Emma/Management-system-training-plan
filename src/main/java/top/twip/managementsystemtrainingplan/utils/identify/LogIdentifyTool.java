package top.twip.managementsystemtrainingplan.utils.identify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.twip.managementsystemtrainingplan.dao.LogDao;
import top.twip.managementsystemtrainingplan.entity.Log;
import top.twip.managementsystemtrainingplan.utils.tool.GetUUID;

import java.util.Date;
import java.util.List;

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

    //无条件搜索全部选课记录
    public List<Log> findAllLog(){
        return logDao.findAll();
    }

    //根据学生ID搜索选课记录
    public List<Log> findLogByUserId(String userId){
        return logDao.findLogByUserId(userId);
    }

    //根据课程ID搜索选课记录
    public List<Log> findLogBySourseId(String sourseId){
        return logDao.findLogBySourseId(sourseId);
    }

    //增加一个选课记录
    public void createNewLog(Log log){
        String logUUID = getUUID.getLogUUID();
        String nowTime = new Date().toString();
        logDao.createNewLog(logUUID,log.getUserId(),log.getSourseId(),nowTime);
    }
}
