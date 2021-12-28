package top.twip.managementsystemtrainingplan.dao;

import org.apache.ibatis.annotations.*;
import top.twip.managementsystemtrainingplan.entity.Situation;

import java.util.List;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/28 9:01
 */
@Mapper
public interface SituationDao {
    @Select("select * from situation")
    @Results(id = "situation",
            value = {
                    @Result(column = "situation_id",property = "situationId"),
                    @Result(column = "user_id",property = "userId"),
                    @Result(column = "sourse_id",property = "sourseId"),
                    @Result(column = "state",property = "state")
            })
    List<Situation> findAll();


    //根据ID删除situation
    @Delete("delete from situation where situation_id=#{situationId}")
    @ResultMap(value = "situation")
    void deleteSituationById(String situationId);


    //根据ID搜索situation
    @Select("select * from situation where situation_id=#{situationId}")
    @ResultMap(value = "situation")
    Situation findSituationById(String situationId);


    //根据学生ID搜索记录
    @Select("select * from situation where user_id=#{userId}")
    @ResultMap(value = "situation")
    List<Situation> findSituationByUserId(String userId);


    //根据课程ID搜索记录
    @Select("select * from situation where sourse_id=#{sourseId}")
    @ResultMap(value = "situation")
    List<Situation> findSituationBySourseId(String sourseId);


    //增加一个situation
    @Insert("insert into situation (situation_id,user_id,sourse_id,state)values(#{situationId},#{userId},#{sourseId},#{state})")
    @ResultMap(value = "situation")
    void createNewSituation(String situationId,String userId,String sourseId,String state);


    //修改situation状态state
    @Update("update mark set state=#{state} where situation_id=#{situationId}")
    @ResultMap(value = "mark")
    void changeMarkResult(String state,String situationId);
}
