package top.twip.managementsystemtrainingplan.utils.identify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.twip.managementsystemtrainingplan.dao.SituationDao;
import top.twip.managementsystemtrainingplan.entity.Situation;
import top.twip.managementsystemtrainingplan.utils.tool.GetUUID;

import java.util.List;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 8:36
 */
@Component
public class SituationIdentifyTool {
    private final SituationDao situationDao;
    private final GetUUID getUUID;

    @Autowired
    public SituationIdentifyTool(SituationDao situationDao, GetUUID getUUID) {
        this.situationDao = situationDao;
        this.getUUID = getUUID;
    }

    //根据状态ID搜索状态
    public Situation findSituationById(String situationId){
        return situationDao.findSituationById(situationId);
    }

    //根据学生ID搜索对应所有状态
    public List<Situation> findSituationByUserId(String userId){
        return situationDao.findSituationByUserId(userId);
    }

    //根据课程课程ID搜索对应所有状态
    public List<Situation> findSituationBySourseId(String sourseId){
        return situationDao.findSituationBySourseId(sourseId);
    }

    //根据学生ID和课程ID搜索对应状态
    public List<Situation> findSituationByUserIdAndSourseId(String userId, String sourseId){
        return situationDao.findSituationByUserIdAndSourseId(userId,sourseId);
    }

    //创建一个状态
    public void createNewSituation(String userId,String sourseId,String state){
        String situationUUID = getUUID.getSituationUUID();
        situationDao.createNewSituation(situationUUID,userId,sourseId,state);
    }

    //修改一个状态
    public void changeSituationState(String newState,String situationId){
        situationDao.changeMarkResult(newState, situationId);
    }
}
