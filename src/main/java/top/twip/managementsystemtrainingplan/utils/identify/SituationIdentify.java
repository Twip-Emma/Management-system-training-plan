package top.twip.managementsystemtrainingplan.utils.identify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.twip.managementsystemtrainingplan.entity.Situation;

import java.util.List;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 8:37
 */
@Component
public class SituationIdentify {
    private final SituationIdentifyTool situationIdentifyTool;

    @Autowired
    public SituationIdentify(SituationIdentifyTool situationIdentifyTool) {
        this.situationIdentifyTool = situationIdentifyTool;
    }

    //创建一个状态(直接加，无需查重)
    public void createNewSituation(Situation situation){
        situationIdentifyTool.createNewSituation(situation.getUserId(), situation.getSourseId(), situation.getState());
    }

    //修改某个状态
    public Boolean changeSituation(String userId,String sourseId,String newState){
        Situation situationByUserIdAndSourseId = situationIdentifyTool.findSituationByUserIdAndSourseId(userId, sourseId);
        if(situationByUserIdAndSourseId != null){
            situationIdentifyTool.changeSituationState(newState,situationByUserIdAndSourseId.getSituationId());
            return true;
        }else{
            return false;
        }
    }

    //根据用户ID和课程ID查询状态
    public Situation findSituationByUserIdAndSourseId(String userId,String sourseId){
        return situationIdentifyTool.findSituationByUserIdAndSourseId(userId, sourseId);
    }

    //无条件查询所有状态
    public List<Situation> findAllSituation(){
        return situationIdentifyTool.findAllSituation();
    }

    //根据用户ID查询对应状态
    public List<Situation> findSituationByUserId(String userId){
        return situationIdentifyTool.findSituationByUserId(userId);
    }

    //根据课程ID查询对应状态
    public List<Situation> findSituationBySourseId(String sourseId){
        return situationIdentifyTool.findSituationBySourseId(sourseId);
    }
}
