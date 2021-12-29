package top.twip.managementsystemtrainingplan.controller.log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import top.twip.managementsystemtrainingplan.service.log.ShowLogService;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 16:16
 */
@RestController(value = "/log")
public class ShowLogController {
    private final ShowLogService showLogService;

    @Autowired
    public ShowLogController(ShowLogService showLogService) {
        this.showLogService = showLogService;
    }
}
