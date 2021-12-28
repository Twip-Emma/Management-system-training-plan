package top.twip.managementsystemtrainingplan.utils.identify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.twip.managementsystemtrainingplan.dao.SourseDao;
import top.twip.managementsystemtrainingplan.entity.Sourse;
import top.twip.managementsystemtrainingplan.utils.tool.GetUUID;

import java.util.List;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/28 16:00
 */
@Component
public class SourseIdentifyTool {
    private final SourseDao sourseDao;
    private final GetUUID getUUID;

    @Autowired
    public SourseIdentifyTool(SourseDao sourseDao,GetUUID getUUID) {
        this.sourseDao = sourseDao;
        this.getUUID = getUUID;
    }

    //查询所有课程
    public List<Sourse> findAllSourseByNone(){
        return sourseDao.findAll();
    }

    //根据ID查询课程
    public Sourse findSourseById(String sourseId){
        return sourseDao.findSourseById(sourseId);
    }

    //根据名称查询课程
    public Sourse findSourseByName(String sourseName){
        return sourseDao.findSourseByName(sourseName);
    }

    //根据College查询课程
    public List<Sourse> findSourseByCollege(String collegeId){
        return sourseDao.findSourseByCollege(collegeId);
    }

    //创建一个新的Sourse
    public void createNewSourse(Sourse sourse){
        String sourseUUID = getUUID.getSourseUUID();
        sourseDao.createNewSourse(sourseUUID, sourse.getSourseName(),sourse.getMark(),sourse.getTheoryTime(),
                sourse.getTestTime(),sourse.getFieldTime(),sourse.getTermTime(),sourse.getCollegeId(),sourse.getMoreText());
    }
}
