package top.twip.managementsystemtrainingplan.service.situation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.twip.managementsystemtrainingplan.entity.Situation;
import top.twip.managementsystemtrainingplan.utils.identify.SituationIdentify;
import top.twip.managementsystemtrainingplan.utils.result.WebResult;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 8:36
 */
@Service
public class ChangeSituationService {
    private final SituationIdentify situationIdentify;

    @Autowired
    public ChangeSituationService(SituationIdentify situationIdentify) {
        this.situationIdentify = situationIdentify;
    }

    //创建一个状态
    public WebResult<Situation> createNewSituation(Situation situation){
        return null;
    }

    //修改一个状态
    public WebResult<Situation> changeSituation(Situation situation){
        return null;
    }
}
