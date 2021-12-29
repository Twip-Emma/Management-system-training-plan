package top.twip.managementsystemtrainingplan.controller.mark;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import top.twip.managementsystemtrainingplan.entity.Mark;
import top.twip.managementsystemtrainingplan.service.mark.ShowMarkService;
import top.twip.managementsystemtrainingplan.utils.result.WebResult;

import java.util.List;

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

    @GetMapping(value = "/findAll")
    public WebResult<List<Mark>> findAll(){
        return showMarkService.findAllMark();
    }

    @GetMapping(value = "/findMarkByUserId")
    public WebResult<List<Mark>> findMarkByUserId(@RequestBody String webData){
        Mark mark = JSONObject.parseObject(webData, Mark.class);
        return showMarkService.findMarkByUserId(mark);
    }

    @GetMapping(value = "/findMarkBySourseId")
    public WebResult<List<Mark>> findMarkBySourseId(@RequestBody String webData){
        Mark mark = JSONObject.parseObject(webData, Mark.class);
        return showMarkService.findMarkByUserId(mark);
    }
}
