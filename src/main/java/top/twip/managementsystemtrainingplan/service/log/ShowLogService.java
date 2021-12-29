package top.twip.managementsystemtrainingplan.service.log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.twip.managementsystemtrainingplan.entity.Log;
import top.twip.managementsystemtrainingplan.entity.Log;
import top.twip.managementsystemtrainingplan.utils.identify.LogIdentify;
import top.twip.managementsystemtrainingplan.utils.result.WebResult;

import java.util.List;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 15:09
 */
@Service
public class ShowLogService {
    private final LogIdentify logIdentify;

    @Autowired
    public ShowLogService(LogIdentify logIdentify) {
        this.logIdentify = logIdentify;
    }

    //无条件搜索全部选课记录
    public WebResult<List<Log>> findAllLog(){
        List<Log> allLog = logIdentify.findAllLog();
        return getListWebResult(allLog);
    }

    //根据学生ID搜索选课记录
    public WebResult<List<Log>> findLogByUserId(Log log){
        List<Log> logByUserId = logIdentify.findLogByUserId(log.getUserId());
        return getListWebResult(logByUserId);
    }

    //根据课程ID搜索选课记录
    public WebResult<List<Log>> findLogBySourseId(Log log){
        List<Log> logBySourseId = logIdentify.findLogBySourseId(log.getSourseId());
        return getListWebResult(logBySourseId);
    }

    private WebResult<List<Log>> getListWebResult(List<Log> logBySourseId) {
        if(logBySourseId != null){
            WebResult<List<Log>> result = new WebResult<>(10000, "请求成功");
            result.setData(logBySourseId);
            return result;
        }else{
            return new WebResult<>(40000,"请求失败");
        }
    }
}
