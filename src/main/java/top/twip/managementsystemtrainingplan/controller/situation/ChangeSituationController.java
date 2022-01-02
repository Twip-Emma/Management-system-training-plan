package top.twip.managementsystemtrainingplan.controller.situation;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.twip.managementsystemtrainingplan.entity.Situation;
import top.twip.managementsystemtrainingplan.service.situation.ChangeSituationService;
import top.twip.managementsystemtrainingplan.service.sourse.ChangeSourseService;
import top.twip.managementsystemtrainingplan.utils.result.WebResult;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 8:35
 */
@RestController
@RequestMapping(value = "/situationChange")
public class ChangeSituationController {
    private final ChangeSituationService changeSituationService;

    @Autowired
    public ChangeSituationController(ChangeSituationService changeSituationService) {
        this.changeSituationService = changeSituationService;
    }

    //新建一个状态
    @PostMapping(value = "/createNewSituation")
    public WebResult<Situation> createNewSituation(@RequestBody String webData){
        Situation situation = JSONObject.parseObject(webData, Situation.class);
        return changeSituationService.createNewSituation(situation);
    }

    //修改一个状态
    @PostMapping(value = "/changeSituation")
    public WebResult<Situation> changeSituation(@RequestBody String webData){
        Situation situation = JSONObject.parseObject(webData, Situation.class);
        return changeSituationService.changeSituation(situation);
    }
}
