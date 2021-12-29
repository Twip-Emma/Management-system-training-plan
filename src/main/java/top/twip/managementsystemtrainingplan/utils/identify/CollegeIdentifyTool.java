package top.twip.managementsystemtrainingplan.utils.identify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.twip.managementsystemtrainingplan.dao.CollegeDao;
import top.twip.managementsystemtrainingplan.entity.College;
import top.twip.managementsystemtrainingplan.utils.tool.GetUUID;

import java.util.List;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 10:06
 */
@Component
public class CollegeIdentifyTool {
    private final CollegeDao collegeDao;
    private final GetUUID getUUID;

    @Autowired
    public CollegeIdentifyTool(CollegeDao collegeDao, GetUUID getUUID) {
        this.collegeDao = collegeDao;
        this.getUUID = getUUID;
    }

    //无条件搜索学院
    public List<College> findAllCollege(){
        return collegeDao.findAll();
    }

    //根据ID搜索学院
    public College findCollegeById(String collegeId){
        return collegeDao.findCollegeById(collegeId);
    }

    //根据名称搜索学院
    public College findCollegeByName(String collegeName){
        return collegeDao.findCollegeByName(collegeName);
    }

    //新增一个学院
    public void createNewCollege(College college){
        String collegeUUID = getUUID.getCollegeUUID();
        collegeDao.createNewCollege(collegeUUID,college.getCollegeName(),college.getCollegeMaster());
    }

    //修改学院名称
    public void changeCollegeName(College college){
        collegeDao.changeCollegeName(college.getCollegeName(), college.getCollegeId());
    }
}
