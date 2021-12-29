package top.twip.managementsystemtrainingplan.controller.mark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import top.twip.managementsystemtrainingplan.service.mark.ChangeMarkService;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 16:19
 */
@RestController(value = "/mark")
public class ChangeMarkController {
    private final ChangeMarkService changeMarkService;

    @Autowired
    public ChangeMarkController(ChangeMarkService changeMarkService) {
        this.changeMarkService = changeMarkService;
    }
}
