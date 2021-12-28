package top.twip.managementsystemtrainingplan.dao;

import org.apache.ibatis.annotations.*;
import top.twip.managementsystemtrainingplan.entity.College;
import top.twip.managementsystemtrainingplan.entity.Situation;
import top.twip.managementsystemtrainingplan.entity.User;

import java.util.List;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/28 9:29
 */
@Mapper
public interface UserDao {
    @Select("select * from user")
    @Results(id = "user",
            value = {
                    @Result(column = "user_id",property = "userId"),
                    @Result(column = "user_name",property = "userName"),
                    @Result(column = "user_sex",property = "userSex"),
                    @Result(column = "user_type",property = "userType"),
                    @Result(column = "user_stage",property = "userStage"),
                    @Result(column = "user_mark",property = "userMark"),
                    @Result(column = "user_state",property = "userState"),
                    @Result(column = "user_card",property = "userCard"),
                    @Result(column = "user_pass",property = "userPass")
            })
    List<User> findAll();

    //根据ID删除user
    @Delete("delete from user where user_id=#{userId}")
    @ResultMap(value = "user")
    void deleteUserById(String userId);

    //增加一个user
    @Insert("insert into user (user_id,user_name,user_sex,user_type,user_stage,user_mark,user_state,user_card,user_pass)" +
            "values(#{userId},#{userName},#{userSex},#{userType},#{userStage},#{userMark},#{userMark},#{userCard},#{userPass})")
    @ResultMap(value = "user")
    void createNewUser(String userId,String userName,String userSex,String userType,Integer userStage,
                         Integer userMark,String userState,String userCard,String userPass);

    //根据ID搜索user
    @Select("select * from user where user_id=#{userId}")
    @ResultMap(value = "user")
    User findUserById(String userId);

    //根据名称搜索user
    @Select("select * from user where user_name=#{userName}")
    @ResultMap(value = "user")
    User findUserByName(String userName);

    //根据账号搜索user
    @Select("select * from user where user_card=#{userCard}")
    @ResultMap(value = "user")
    User findUserByCard(String userCard);
}
