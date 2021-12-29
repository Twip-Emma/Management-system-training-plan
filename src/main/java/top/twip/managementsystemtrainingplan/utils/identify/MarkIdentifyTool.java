package top.twip.managementsystemtrainingplan.utils.identify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.twip.managementsystemtrainingplan.dao.MarkDao;
import top.twip.managementsystemtrainingplan.entity.Mark;

import java.util.List;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 10:07
 */
@Component
public class MarkIdentifyTool {
    private final MarkDao markDao;

    @Autowired
    public MarkIdentifyTool(MarkDao markDao) {
        this.markDao = markDao;
    }

    //无条件查询所有成绩
    public List<Mark> findAllMark(){
        return markDao.findAll();
    }

    //查询某个用户的成绩
    public List<Mark> findMarkByUserId(String userId){
        return markDao.findMarkByUserId(userId);
    }

    //查询某个课程的所有成绩
    public List<Mark> findMarkBySourseId(String sourseId){
        return markDao.findMarkBySourseId(sourseId);
    }

    //根据用户ID和课程ID查询对应成绩
    public Mark findMarkByUserIdAndSourseId(String userId,String sourseId){
        return markDao.findMarkByUserIdAndSourseId(userId,sourseId);
    }

    //修改成绩
    public void changeMarkResult(Integer result,String userId,String sourseId){
        markDao.changeMarkResult(result, userId, sourseId);
    }

    //新增一个成绩
    public void createNewMark(Mark mark){
        markDao.createNewMark(mark.getUserId(), mark.getSourseId(), mark.getResult());
    }
}
