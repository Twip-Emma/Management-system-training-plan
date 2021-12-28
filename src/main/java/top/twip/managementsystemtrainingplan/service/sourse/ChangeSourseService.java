package top.twip.managementsystemtrainingplan.service.sourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.twip.managementsystemtrainingplan.entity.Sourse;
import top.twip.managementsystemtrainingplan.utils.identify.SourseIdentify;
import top.twip.managementsystemtrainingplan.utils.result.WebResult;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/28 16:01
 */
@Service
public class ChangeSourseService {
    private final SourseIdentify sourseIdentify;

    @Autowired
    public ChangeSourseService(SourseIdentify sourseIdentify) {
        this.sourseIdentify = sourseIdentify;
    }

    //添加课程
    public WebResult<Sourse> createNewSourse(Sourse sourse){
        Boolean aBoolean = sourseIdentify.createNewSourseCheck(sourse);
        if (aBoolean){
            sourseIdentify.createNewSourse(sourse);
            Sourse sourseByName = sourseIdentify.findSourseByName(sourse.getSourseName());
            WebResult<Sourse> webResult = new WebResult<>(10000, "创建成功");
            webResult.setData(sourseByName);
            return webResult;
        }else{
            return new WebResult<>(40000,"创建失败，请检查是否名称冲突了");
        }
    }
}
