package top.twip.managementsystemtrainingplan.utils.identify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.twip.managementsystemtrainingplan.entity.College;

import java.util.List;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 10:05
 */
@Component
public class CollegeIdentify {
    private final CollegeIdentifyTool collegeIdentifyTool;

    @Autowired
    public CollegeIdentify(CollegeIdentifyTool collegeIdentifyTool) {
        this.collegeIdentifyTool = collegeIdentifyTool;
    }

    //无条件搜索学院
    public List<College> findAllCollege(){
        return collegeIdentifyTool.findAllCollege();
    }

    //根据ID搜索学院
    public College findCollegeById(String collegeId){
        return collegeIdentifyTool.findCollegeById(collegeId);
    }

    //根据名称搜索学院
    public College findCollegeByName(String collegeName){
        return collegeIdentifyTool.findCollegeByName(collegeName);
    }

    //新增一个学院
    public Boolean createNewCollege(College college){
        College collegeByName = collegeIdentifyTool.findCollegeByName(college.getCollegeName());
        if(collegeByName != null){
            return false;
        }else{
            collegeIdentifyTool.createNewCollege(college);
            return true;
        }
    }

    //修改学院名称
    public Boolean changeCollegeName(College college){
        College collegeByName = collegeIdentifyTool.findCollegeByName(college.getCollegeName());
        if(collegeByName == null){
            return false;
        }else{
            collegeIdentifyTool.changeCollegeName(college);
            return true;
        }
    }
}
