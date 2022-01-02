package top.twip.managementsystemtrainingplan.controller.college;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;
import top.twip.managementsystemtrainingplan.entity.College;
import top.twip.managementsystemtrainingplan.service.college.ShowCollegeService;
import top.twip.managementsystemtrainingplan.utils.result.WebResult;

import java.util.List;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 16:16
 */
@RestController
@RequestMapping(value = "/collegeShow")
public class ShowCollegeController {
    private final ShowCollegeService showCollegeService;

    public ShowCollegeController(ShowCollegeService showCollegeService) {
        this.showCollegeService = showCollegeService;
    }

    @GetMapping(value = "/showAllCollege")
    public WebResult<List<College>> showAll(){
        return showCollegeService.findAllCollege();
    }

    @GetMapping(value = "/showCollegeById")
    public WebResult<College> showCollegeById(@RequestBody String webData){
        College college = JSONObject.parseObject(webData, College.class);
        return showCollegeService.findCollegeById(college.getCollegeId());
    }

    @GetMapping(value = "/showCollegeByName")
    public WebResult<College> showCollegeByName(@RequestBody String webData){
        College college = JSONObject.parseObject(webData, College.class);
        return showCollegeService.findCollegeByName(college.getCollegeName());
    }
}
