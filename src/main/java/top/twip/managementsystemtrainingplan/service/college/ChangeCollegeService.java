package top.twip.managementsystemtrainingplan.service.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.twip.managementsystemtrainingplan.entity.College;
import top.twip.managementsystemtrainingplan.utils.identify.CollegeIdentify;
import top.twip.managementsystemtrainingplan.utils.result.WebResult;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 15:35
 */
@Service
public class ChangeCollegeService {
    private final CollegeIdentify collegeIdentify;

    @Autowired
    public ChangeCollegeService(CollegeIdentify collegeIdentify) {
        this.collegeIdentify = collegeIdentify;
    }

    //新增一个学院
    public WebResult<College> createNewCollege(College college){
        Boolean newCollege = collegeIdentify.createNewCollege(college);
        if(newCollege){
            return new WebResult<>(10000,"添加成功");
        }else{
            return new WebResult<>(40000,"添加失败");
        }
    }

    //修改学院名称
    public WebResult<College> changeCollegeName(College college){
        Boolean aBoolean = collegeIdentify.changeCollegeName(college);
        if(aBoolean){
            return new WebResult<>(10000,"请求成功");
        }else{
            return new WebResult<>(40000,"添加失败");
        }
    }
}
