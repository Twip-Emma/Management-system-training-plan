package top.twip.managementsystemtrainingplan.service.situation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.twip.managementsystemtrainingplan.entity.Situation;
import top.twip.managementsystemtrainingplan.utils.identify.SituationIdentify;
import top.twip.managementsystemtrainingplan.utils.result.WebResult;

import java.util.List;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 8:36
 */
@Service
public class ShowSituationService {
    private final SituationIdentify situationIdentify;

    @Autowired
    public ShowSituationService(SituationIdentify situationIdentify) {
        this.situationIdentify = situationIdentify;
    }

    //无条件查询所有状态
    public WebResult<List<Situation>> findAllSituation(){
        List<Situation> allSituation = situationIdentify.findAllSituation();
        return getListWebResult(allSituation);
    }

    //根据用户ID查询对应状态
    public WebResult<List<Situation>> findSituationByUserId(Situation situation){
        List<Situation> situationByUserId = situationIdentify.findSituationByUserId(situation.getUserId());
        return getListWebResult(situationByUserId);
    }

    //根据课程ID查询对应状态
    public WebResult<List<Situation>> findSituationBySourseId(Situation situation){
        List<Situation> situationBySourseId = situationIdentify.findSituationBySourseId(situation.getSourseId());
        return getListWebResult(situationBySourseId);
    }

    private WebResult<List<Situation>> getListWebResult(List<Situation> situationBySourseId) {
        if(situationBySourseId != null){
            WebResult<List<Situation>> result = new WebResult<>(10000, "请求成功");
            result.setData(situationBySourseId);
            return result;
        }else{
            return new WebResult<>(40000,"请求失败");
        }
    }
}
