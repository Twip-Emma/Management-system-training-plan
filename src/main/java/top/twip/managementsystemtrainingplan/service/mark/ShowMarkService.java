package top.twip.managementsystemtrainingplan.service.mark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.twip.managementsystemtrainingplan.entity.Mark;
import top.twip.managementsystemtrainingplan.utils.identify.MarkIdentify;
import top.twip.managementsystemtrainingplan.utils.result.WebResult;

import java.util.List;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 11:41
 */
@Component
public class ShowMarkService {
    private final MarkIdentify markIdentify;

    @Autowired
    public ShowMarkService(MarkIdentify markIdentify) {
        this.markIdentify = markIdentify;
    }

    //无条件展示所有成绩
    public WebResult<List<Mark>> findAllMark(){
        List<Mark> allMark = markIdentify.findAllMark();
        return getListWebResult(allMark);
    }

    //根据用户查询对应成绩
    public WebResult<List<Mark>> findMarkByUserId(Mark mark){
        List<Mark> markByUserId = markIdentify.findMarkByUserId(mark.getUserId());
        return getListWebResult(markByUserId);
    }

    //根据课程ID查询成绩
    public WebResult<List<Mark>> findAllMark(Mark mark){
        List<Mark> markBySourseId = markIdentify.findMarkBySourseId(mark.getSourseId());
        return getListWebResult(markBySourseId);
    }

    private WebResult<List<Mark>> getListWebResult(List<Mark> markBySourseId) {
        if(markBySourseId != null){
            WebResult<List<Mark>> result = new WebResult<>(10000, "请求成功");
            result.setData(markBySourseId);
            return result;
        }else{
            return new WebResult<>(40000, "请求失败");
        }
    }
}
