package top.twip.managementsystemtrainingplan.controller.mark;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.twip.managementsystemtrainingplan.entity.Mark;
import top.twip.managementsystemtrainingplan.service.mark.ChangeMarkService;
import top.twip.managementsystemtrainingplan.utils.result.WebResult;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 16:19
 */
@RestController
@RequestMapping(value = "/markChange")
public class ChangeMarkController {
    private final ChangeMarkService changeMarkService;

    @Autowired
    public ChangeMarkController(ChangeMarkService changeMarkService) {
        this.changeMarkService = changeMarkService;
    }

    @PostMapping(value = "/createNewMark")
    public WebResult<Mark> createNewMark(@RequestBody String webData){
        Mark mark = JSONObject.parseObject(webData, Mark.class);
        return changeMarkService.createNewMark(mark);
    }

    @PostMapping(value = "/changeMark")
    public WebResult<Mark> changeMark(@RequestBody String webData){
        Mark mark = JSONObject.parseObject(webData, Mark.class);
        System.out.println(mark);
        return changeMarkService.changeMark(mark);
    }
}
