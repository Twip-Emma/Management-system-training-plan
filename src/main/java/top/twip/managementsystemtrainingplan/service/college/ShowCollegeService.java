package top.twip.managementsystemtrainingplan.service.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.twip.managementsystemtrainingplan.entity.College;
import top.twip.managementsystemtrainingplan.utils.identify.CollegeIdentify;
import top.twip.managementsystemtrainingplan.utils.result.WebResult;

import java.util.List;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 15:35
 */
@Service
public class ShowCollegeService {
    private final CollegeIdentify collegeIdentify;

    @Autowired
    public ShowCollegeService(CollegeIdentify collegeIdentify) {
        this.collegeIdentify = collegeIdentify;
    }

    //无条件搜索学院
    public WebResult<List<College>> findAllCollege(){
        List<College> allCollege = collegeIdentify.findAllCollege();
        if(allCollege != null){
            WebResult<List<College>> result = new WebResult<>(10000, "请求成功");
            result.setData(allCollege);
            return result;
        }else{
            return new WebResult<>(40001,"请求为空");
        }
    }

    //根据ID搜索学院
    public WebResult<College> findCollegeById(String collegeId){
        College collegeById = collegeIdentify.findCollegeById(collegeId);
        if(collegeById != null){
            WebResult<College> result = new WebResult<>(10000, "请求成功");
            result.setData(collegeById);
            return result;
        }else{
            return new WebResult<>(40000,"请求失败");
        }
    }

    //根据名称搜索学院
    public WebResult<College> findCollegeByName(String collegeName){
        College collegeByName = collegeIdentify.findCollegeByName(collegeName);
        if(collegeByName != null){
            WebResult<College> result = new WebResult<>(10000, "请求成功");
            result.setData(collegeByName);
            return result;
        }else{
            return new WebResult<>(40000,"请求失败");
        }
    }
}
