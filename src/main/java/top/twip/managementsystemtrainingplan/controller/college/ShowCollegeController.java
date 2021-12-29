package top.twip.managementsystemtrainingplan.controller.college;

import org.springframework.web.bind.annotation.RestController;
import top.twip.managementsystemtrainingplan.service.college.ShowCollegeService;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 16:16
 */
@RestController(value = "/college")
public class ShowCollegeController {
    private final ShowCollegeService showCollegeService;

    public ShowCollegeController(ShowCollegeService showCollegeService) {
        this.showCollegeService = showCollegeService;
    }
}
