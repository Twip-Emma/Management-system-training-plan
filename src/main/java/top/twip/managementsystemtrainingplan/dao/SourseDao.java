package top.twip.managementsystemtrainingplan.dao;

import org.apache.ibatis.annotations.*;
import top.twip.managementsystemtrainingplan.entity.Sourse;
import top.twip.managementsystemtrainingplan.entity.Sourse;

import java.util.List;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/28 9:10
 */
@Mapper
public interface SourseDao {
    @Select("select * from sourse")
    @Results(id = "sourse",
            value = {
                    @Result(column = "sourse_id",property = "sourseId"),
                    @Result(column = "sourse_name",property = "sourseName"),
                    @Result(column = "mark",property = "mark"),
                    @Result(column = "theory_time",property = "theoryTime"),
                    @Result(column = "test_time",property = "testTime"),
                    @Result(column = "field_time",property = "fieldTime"),
                    @Result(column = "term_time",property = "termTime"),
                    @Result(column = "college",property = "collegeId"),
                    @Result(column = "more_text",property = "moreText")
            })
    List<Sourse> findAll();

    //根据ID删除sourse
    @Delete("delete from sourse where sourse_id=#{sourseId}")
    @ResultMap(value = "sourse")
    void deleteSourseById(String sourseId);

    //根据ID搜索sourse
    @Select("select * from sourse where sourse_id=#{sourseId}")
    @ResultMap(value = "sourse")
    Sourse findSourseById(String sourseId);

    //根据名称搜索sourse
    @Select("select * from sourse where sourse_name=#{sourseName}")
    @ResultMap(value = "sourse")
    Sourse findSourseByName(String sourseName);

    //根据college搜索sourse列表
    @Select("select * from sourse where college=#{collegeId}")
    @ResultMap(value = "sourse")
    List<Sourse> findSourseByCollege(String collegeId);

    //增加一个sourse
    @Insert("insert into situation (sourse_id,sourse_name,mark,theory_time,test_time,field_time,term_time,college,more_text)" +
            "values(#{sourseId},#{sourseName},#{mark},#{theoryTime},#{testTime},#{fieldTime},#{termTime},#{collegeId},#{moreText})")
    @ResultMap(value = "sourse")
    void createNewSourse(String sourseId,String sourseName,Integer mark,Integer theoryTime,Integer testTime,
                            Integer fieldTime,Integer termTime,String collegeId,String moreText);
}
