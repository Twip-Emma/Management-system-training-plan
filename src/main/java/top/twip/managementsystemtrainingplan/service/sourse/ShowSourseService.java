package top.twip.managementsystemtrainingplan.service.sourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.twip.managementsystemtrainingplan.entity.Sourse;
import top.twip.managementsystemtrainingplan.utils.identify.SourseIdentify;
import top.twip.managementsystemtrainingplan.utils.result.WebResult;

import java.util.List;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/28 15:40
 */
@Service
public class ShowSourseService {
    private final SourseIdentify sourseIdentify;

    @Autowired
    public ShowSourseService(SourseIdentify sourseIdentify) {
        this.sourseIdentify = sourseIdentify;
    }

    //无条件搜索所有课程
    public WebResult<List<Sourse>> findAllSourseByNone(){
        return null;
    }

    //根据学院搜索课程
    public WebResult<List<Sourse>> findSourseByCollege(String collegeId){
        return null;
    }
}
