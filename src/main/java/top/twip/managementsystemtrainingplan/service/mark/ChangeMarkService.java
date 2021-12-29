package top.twip.managementsystemtrainingplan.service.mark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.twip.managementsystemtrainingplan.entity.Mark;
import top.twip.managementsystemtrainingplan.utils.identify.MarkIdentify;
import top.twip.managementsystemtrainingplan.utils.result.WebResult;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 11:41
 */
@Component
public class ChangeMarkService {
    private final MarkIdentify markIdentify;

    @Autowired
    public ChangeMarkService(MarkIdentify markIdentify) {
        this.markIdentify = markIdentify;
    }

    //新增一个成绩（需判断是否重复）
    public WebResult<Mark> createNewMark(Mark mark){
        Boolean newMark = markIdentify.createNewMark(mark);
        Mark markByUserIdAndSourseId = markIdentify.findMarkByUserIdAndSourseId(mark);
        WebResult<Mark> result;
        if(newMark){
            result = new WebResult<>(10000, "添加成功");
        }else{
            result = new WebResult<>(10001, "已存在，已自动更新成绩");
        }
        result.setData(markByUserIdAndSourseId);
        return result;
    }

    //修改一个成绩（需判断是否存在）
    public WebResult<Mark> changeMark(Mark mark){
        Boolean aBoolean = markIdentify.changeMark(mark);
        if(aBoolean){
            WebResult<Mark> result = new WebResult<>(10000, "修改成功");
            Mark markByUserIdAndSourseId = markIdentify.findMarkByUserIdAndSourseId(mark);
            result.setData(markByUserIdAndSourseId);
            return result;
        }else{
            return new WebResult<>(40000,"修改失败，未能找到这个用户");
        }
    }
}
