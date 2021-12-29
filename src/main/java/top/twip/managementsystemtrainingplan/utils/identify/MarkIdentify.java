package top.twip.managementsystemtrainingplan.utils.identify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.twip.managementsystemtrainingplan.entity.Mark;

import java.util.List;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 10:07
 */
@Component
public class MarkIdentify {
    private final MarkIdentifyTool markIdentifyTool;

    @Autowired
    public MarkIdentify(MarkIdentifyTool markIdentifyTool) {
        this.markIdentifyTool = markIdentifyTool;
    }

    //新增一个成绩（需判断是否重复）
    public Boolean createNewMark(Mark mark){
        Mark markByUserIdAndSourseId = markIdentifyTool.findMarkByUserIdAndSourseId(mark.getUserId(), mark.getSourseId());
        if(markByUserIdAndSourseId != null){
            markIdentifyTool.changeMarkResult(mark.getResult(), mark.getUserId(), mark.getSourseId());
            return false;
        }else{
            markIdentifyTool.createNewMark(mark);
            return true;
        }
    }

    //修改一个成绩（需判断是否存在）
    public Boolean changeMark(Mark mark){
        Mark markByUserIdAndSourseId = markIdentifyTool.findMarkByUserIdAndSourseId(mark.getUserId(), mark.getSourseId());
        if(markByUserIdAndSourseId == null){
            return false;
        }else{
            markIdentifyTool.changeMarkResult(mark.getResult(), mark.getUserId(), mark.getSourseId());
            return true;
        }
    }

    //查找一个具体成绩
    public Mark findMarkByUserIdAndSourseId(Mark mark){
        return markIdentifyTool.findMarkByUserIdAndSourseId(mark.getUserId(), mark.getSourseId());
    }

    //无条件查询所有成绩
    public List<Mark> findAllMark(){
        return markIdentifyTool.findAllMark();
    }

    //查询某个用户的成绩
    public List<Mark> findMarkByUserId(String userId){
        return markIdentifyTool.findMarkByUserId(userId);
    }

    //查询某个课程的所有成绩
    public List<Mark> findMarkBySourseId(String sourseId){
        return markIdentifyTool.findMarkBySourseId(sourseId);
    }
}
