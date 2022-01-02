package top.twip.managementsystemtrainingplan.controller.situation;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.twip.managementsystemtrainingplan.entity.Situation;
import top.twip.managementsystemtrainingplan.service.situation.ShowSituationService;
import top.twip.managementsystemtrainingplan.utils.result.WebResult;

import java.util.List;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 8:34
 */
@RestController
@RequestMapping(value = "/situationShow")
public class ShowSituationController {
    private final ShowSituationService showSituationService;

    @Autowired
    public ShowSituationController(ShowSituationService showSituationService) {
        this.showSituationService = showSituationService;
    }

    @GetMapping(value = "/findAllSituation")
    public WebResult<List<Situation>> findAll(){
        return showSituationService.findAllSituation();
    }

    @GetMapping(value = "/findSituationByUserId")
    public WebResult<List<Situation>> findSituationByUserId(@RequestBody String webData){
        Situation situation = JSONObject.parseObject(webData, Situation.class);
        return showSituationService.findSituationByUserId(situation);
    }

    @GetMapping(value = "/findSituationBySourseId")
    public WebResult<List<Situation>> findSituationBySourseId(@RequestBody String webData){
        Situation situation = JSONObject.parseObject(webData, Situation.class);
        return showSituationService.findSituationBySourseId(situation);
    }
}
