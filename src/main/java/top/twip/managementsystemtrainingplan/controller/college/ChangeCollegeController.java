package top.twip.managementsystemtrainingplan.controller.college;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import top.twip.managementsystemtrainingplan.entity.College;
import top.twip.managementsystemtrainingplan.service.college.ChangeCollegeService;
import top.twip.managementsystemtrainingplan.utils.result.WebResult;

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

    @PostMapping(value = "/createNewCollege")
    public WebResult<College> createNewCollege(@RequestBody String webData){
        College college = JSONObject.parseObject(webData, College.class);
        return changeCollegeService.createNewCollege(college);
    }

    @PostMapping(value = "/changeCollegeName")
    public WebResult<College> changeCollegeName(@RequestBody String webData){
        College college = JSONObject.parseObject(webData, College.class);
        return changeCollegeService.changeCollegeName(college);
    }
}
