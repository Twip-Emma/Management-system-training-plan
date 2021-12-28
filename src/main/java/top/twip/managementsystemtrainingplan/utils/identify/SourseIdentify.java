package top.twip.managementsystemtrainingplan.utils.identify;

import org.springframework.stereotype.Component;
import top.twip.managementsystemtrainingplan.entity.Sourse;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/28 15:37
 */
@Component
public class SourseIdentify {
    private final SourseIdentifyTool sourseIdentifyTool;

    public SourseIdentify(SourseIdentifyTool sourseIdentifyTool) {
        this.sourseIdentifyTool = sourseIdentifyTool;
    }

    //检查是否可以新建课程(验证条件：课程名)
    public Boolean createNewSourseCheck(Sourse sourse){
        Sourse sourseByName = sourseIdentifyTool.findSourseByName(sourse.getSourseName());
        if(sourseByName != null){
            return false;//存在这个课程，不允许创建
        }else{
            return true;//找不到这个课程，可以创建
        }
    }

    //创建一个课程
    public void createNewSourse(Sourse sourse){
        sourseIdentifyTool.createNewSourse(sourse);
    }

    //根据名称搜索课程
    public Sourse findSourseByName(String sourseName){
        return sourseIdentifyTool.findSourseByName(sourseName);
    }
}
