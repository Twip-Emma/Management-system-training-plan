package top.twip.managementsystemtrainingplan.dao;

import org.apache.ibatis.annotations.*;
import top.twip.managementsystemtrainingplan.entity.Mark;

import java.util.List;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/28 8:46
 */
@Mapper
public interface MarkDao {
    @Select("select * from mark")
    @Results(id = "mark",
            value = {
                    @Result(column = "user_id",property = "userId"),
                    @Result(column = "sourse_id",property = "sourseId"),
                    @Result(column = "result",property = "result")
            })
    List<Mark> findAll();


    //根据用户ID和课程ID删除mark
    @Delete("delete from mark where user_id=#{userId} and sourse_id=#{sourseId}")
    @ResultMap(value = "mark")
    void deleteMarkById(String userId,String sourseId);


    //根据用户ID搜索mark
    @Select("select * from mark where user_id=#{userId}")
    @ResultMap(value = "mark")
    List<Mark> findMarkByUserId(String userId);


    //根据课程ID搜索全部学生成绩
    @Select("select * from mark where sourse_id=#{sourseId}")
    @ResultMap(value = "mark")
    List<Mark> findMarkBySourseId(String sourseId);


    //增加一个mark
    @Insert("insert into mark (user_id,sourse_id,result)values(#{userId},#{sourseId},#{result})")
    @ResultMap(value = "mark")
    void createNewMark(String userId,String sourseId,String result);


    //修改mark成绩
    @Update("update mark set result=#{result} where user_id=#{userId} and sourse_id=#{sourseId}")
    @ResultMap(value = "mark")
    void changeMarkResult(String result,String userId,String sourseId);
}
