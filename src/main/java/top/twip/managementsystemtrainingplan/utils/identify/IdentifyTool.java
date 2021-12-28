package top.twip.managementsystemtrainingplan.utils.identify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.twip.managementsystemtrainingplan.dao.UserDao;
import top.twip.managementsystemtrainingplan.entity.User;
import top.twip.managementsystemtrainingplan.utils.tool.PasswordEncoder;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/28 10:41
 */
@Component
public class IdentifyTool {
    private UserDao userDao;

    @Autowired
    public IdentifyTool(UserDao userDao) {
        this.userDao = userDao;
    }

    //根据ID搜索用户
    public User findUserById(String userId){
        return userDao.findUserById(userId);
    }

    //根据名称搜索用户
    public User findUserByName(String userName){
        return userDao.findUserByName(userName);
    }

    //根据账号查询密码
    public String findPassByCard(String userCard){
        User user = userDao.findUserByCard(userCard);
        return user.getUserPass();
    }

    //新建用户
    public void createNewUser(User user){
        userDao.createNewUser(user.getUserId(),user.getUserName(),user.getUserSex(),user.getUserType(),user.getUserStage(),
        user.getUserMark(),user.getUserState(),user.getUserCard(),user.getUserPass());
    }
}
