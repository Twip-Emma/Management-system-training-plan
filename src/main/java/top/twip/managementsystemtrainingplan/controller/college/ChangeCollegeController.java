package top.twip.managementsystemtrainingplan.controller.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import top.twip.managementsystemtrainingplan.service.college.ChangeCollegeService;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 16:18
 */
@RestController(value = "/college")
public class ChangeCollegeController {
    private final ChangeCollegeService changeCollegeService;

    @Autowired
    public ChangeCollegeController(ChangeCollegeService changeCollegeService) {
        this.changeCollegeService = changeCollegeService;
    }
}
