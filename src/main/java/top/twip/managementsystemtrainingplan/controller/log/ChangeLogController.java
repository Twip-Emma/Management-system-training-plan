package top.twip.managementsystemtrainingplan.controller.log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import top.twip.managementsystemtrainingplan.service.log.ChangeLogService;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 16:18
 */
@RestController(value = "/log")
public class ChangeLogController {
    private final ChangeLogService changeLogService;

    @Autowired
    public ChangeLogController(ChangeLogService changeLogService) {
        this.changeLogService = changeLogService;
    }
}
