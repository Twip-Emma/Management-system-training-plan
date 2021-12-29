package top.twip.managementsystemtrainingplan.controller.sourse;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import top.twip.managementsystemtrainingplan.entity.Sourse;
import top.twip.managementsystemtrainingplan.service.sourse.ChangeSourseService;
import top.twip.managementsystemtrainingplan.utils.result.WebResult;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 8:16
 */
@RestController(value = "/sourse")
public class ChangeSourseController {
    private final ChangeSourseService changeSourseService;

    @Autowired
    public ChangeSourseController(ChangeSourseService changeSourseService) {
        this.changeSourseService = changeSourseService;
    }

    //创建一个新课程
    @PostMapping(value = "/create")
    public WebResult<Sourse> createNewSourse(@RequestBody String webData){
        Sourse sourse = JSONObject.parseObject(webData, Sourse.class);
        return changeSourseService.createNewSourse(sourse);
    }
}
