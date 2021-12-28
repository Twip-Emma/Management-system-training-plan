package top.twip.managementsystemtrainingplan.dao;

import org.apache.ibatis.annotations.*;
import top.twip.managementsystemtrainingplan.entity.College;

import java.util.List;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/27 17:35
 */
@Mapper
public interface CollegeDao {
    @Select("select * from college")
    @Results(id = "college",
            value = {
                    @Result(column = "college_id",property = "collegeId"),
                    @Result(column = "college_name",property = "collegeName"),
                    @Result(column = "college_master",property = "collegeMaster")
    })
    List<College> findAll();


    //根据ID删除college
    @Delete("delete from college where college_id=#{collegeId}")
    @ResultMap(value = "college")
    void deleteCollegeById(String collegeId);


    //根据ID搜索college
    @Select("select * from college where college_id=#{collegeId}")
    @ResultMap(value = "college")
    College findCollegeById(String collegeId);


    //根据名称搜索college
    @Select("select * from college where college_name=#{collegeName}")
    @ResultMap(value = "college")
    College findCollegeByName(String collegeName);


    //增加一个college
    @Insert("insert into college (college_id,college_name,college_master)values(#{collegeId},#{collegeName},#{collegeMaster})")
    @ResultMap(value = "college")
    void createNewCollege(String collegeId,String collegeName,String collegeMaster);


    //修改college名称
    @Update("update college set college_name=#{collegeName} where college_id=#{collegeId}")
    @ResultMap(value = "college")
    void changeCollegeName(String collegeName,String collegeId);
}
