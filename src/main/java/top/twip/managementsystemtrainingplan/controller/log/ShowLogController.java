package top.twip.managementsystemtrainingplan.controller.log;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import top.twip.managementsystemtrainingplan.entity.Log;
import top.twip.managementsystemtrainingplan.entity.Log;
import top.twip.managementsystemtrainingplan.service.log.ShowLogService;
import top.twip.managementsystemtrainingplan.utils.result.WebResult;

import java.util.List;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 16:16
 */
@RestController(value = "/logShow")
public class ShowLogController {
    private final ShowLogService showLogService;

    @Autowired
    public ShowLogController(ShowLogService showLogService) {
        this.showLogService = showLogService;
    }

    @GetMapping(value = "/showAllLog")
    public WebResult<List<Log>> showAll(){
        return showLogService.findAllLog();
    }

    @GetMapping(value = "/showLogByUserId")
    public WebResult<List<Log>> showLogByUserId(@RequestBody String webData){
        Log log = JSONObject.parseObject(webData, Log.class);
        return showLogService.findLogByUserId(log);
    }

    @GetMapping(value = "/showLogByName")
    public WebResult<List<Log>> showLogByName(@RequestBody String webData){
        Log log = JSONObject.parseObject(webData, Log.class);
        return showLogService.findLogBySourseId(log);
    }
}
