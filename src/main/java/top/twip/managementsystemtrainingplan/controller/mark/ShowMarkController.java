package top.twip.managementsystemtrainingplan.controller.mark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import top.twip.managementsystemtrainingplan.service.mark.ShowMarkService;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 16:16
 */
@RestController(value = "/mark")
public class ShowMarkController {
    private final ShowMarkService showMarkService;

    @Autowired
    public ShowMarkController(ShowMarkService showMarkService) {
        this.showMarkService = showMarkService;
    }
}
