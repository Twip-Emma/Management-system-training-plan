package top.twip.managementsystemtrainingplan.controller.sourse;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import top.twip.managementsystemtrainingplan.entity.College;
import top.twip.managementsystemtrainingplan.entity.Sourse;
import top.twip.managementsystemtrainingplan.service.sourse.ShowSourseService;
import top.twip.managementsystemtrainingplan.utils.result.WebResult;

import java.util.List;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/28 15:39
 */
@RestController(value = "/sourse")
public class ShowSourseController {
    private final ShowSourseService showSourseService;

    @Autowired
    public ShowSourseController(ShowSourseService showSourseService) {
        this.showSourseService = showSourseService;
    }

    //直接获取所有课程
    @GetMapping(value = "/getAllSourse")
    public WebResult<List<Sourse>> findAllSourse(){
        return showSourseService.findAllSourseByNone();
    }

    //根据College的ID获取对应课程
    @GetMapping(value = "/getSourseByCollegeId")
    public WebResult<List<Sourse>> findSourseByCollegeId(@RequestBody String webData){
        College college = JSONObject.parseObject(webData, College.class);
        return showSourseService.findSourseByCollege(college.getCollegeId());
    }
}
