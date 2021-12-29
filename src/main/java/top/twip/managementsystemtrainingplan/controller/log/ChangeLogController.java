package top.twip.managementsystemtrainingplan.controller.log;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import top.twip.managementsystemtrainingplan.entity.Log;
import top.twip.managementsystemtrainingplan.service.log.ChangeLogService;
import top.twip.managementsystemtrainingplan.utils.result.WebResult;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 16:18
 */
@RestController(value = "/logChange")
public class ChangeLogController {
    private final ChangeLogService changeLogService;

    @Autowired
    public ChangeLogController(ChangeLogService changeLogService) {
        this.changeLogService = changeLogService;
    }

    @PostMapping(value = "/createNewLog")
    public WebResult<Log> createNewLog(@RequestBody String webData){
        Log log = JSONObject.parseObject(webData, Log.class);
        return changeLogService.createNewLog(log);
    }
}
