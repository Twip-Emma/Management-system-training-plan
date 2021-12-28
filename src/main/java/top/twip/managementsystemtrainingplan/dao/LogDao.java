package top.twip.managementsystemtrainingplan.dao;

import org.apache.ibatis.annotations.*;
import top.twip.managementsystemtrainingplan.entity.Log;

import java.util.List;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/28 8:35
 */
@Mapper
public interface LogDao {
    @Select("select * from log")
    @Results(id = "log",
            value = {
                    @Result(column = "log_id",property = "logId"),
                    @Result(column = "user_id",property = "userId"),
                    @Result(column = "sourse_id",property = "sourseId"),
                    @Result(column = "time_zone",property = "timeZone")
            })
    List<Log> findAll();


    //根据ID删除log
    @Delete("delete from log where log_id=#{logId}")
    @ResultMap(value = "log")
    void deleteLogById(String logId);


    //根据ID搜索log
    @Select("select * from log where log_id=#{logId}")
    @ResultMap(value = "log")
    Log findLogById(String logId);


    //根据学生ID搜索记录
    @Select("select * from log where user_id=#{userId}")
    @ResultMap(value = "log")
    List<Log> findLogByUserId(String userId);


    //根据课程ID搜索记录
    @Select("select * from log where sourse_id=#{sourseId}")
    @ResultMap(value = "log")
    List<Log> findLogBySourseId(String sourseId);


    //增加一个log
    @Insert("insert into log (log_id,user_id,sourse_id,time_zone)values(#{logId},#{userId},#{sourseId},#{timeZone})")
    @ResultMap(value = "log")
    void createNewLog(String logId,String userId,String sourseId,String timeZone);
}
