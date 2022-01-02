package top.twip.managementsystemtrainingplan.utils.identify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.twip.managementsystemtrainingplan.dao.UserDao;
import top.twip.managementsystemtrainingplan.entity.User;
import top.twip.managementsystemtrainingplan.utils.tool.GetUUID;
import top.twip.managementsystemtrainingplan.utils.tool.PasswordEncoder;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/28 10:41
 */
@Component
public class UserIdentifyTool {
    private final UserDao userDao;
    private final PasswordEncoder passwordEncoder;
    private final GetUUID getUUID;

    @Autowired
    public UserIdentifyTool(UserDao userDao, PasswordEncoder passwordEncoder,GetUUID getUUID) {
        this.userDao = userDao;
        this.passwordEncoder = passwordEncoder;
        this.getUUID = getUUID;
    }

    //根据ID搜索用户
    public User findUserById(String userId){
        return userDao.findUserById(userId);
    }

    //根据名称搜索用户
    public User findUserByName(String userName){
        return userDao.findUserByName(userName);
    }

    //根据账号查询用户
    public User findUserByCard(String userCard){
        return userDao.findUserByCard(userCard);
    }

    //根据账号查询密码
    public String findPassByCard(String userCard){
        User user = userDao.findUserByCard(userCard);
        if(user != null){
            return user.getUserPass();
        }else{
            return null;
        }
    }

    //新建用户
    public void createNewUser(User user){
        String encodePass = passwordEncoder.encode(user.getUserPass());
        String userUUID = getUUID.getUserUUID();
        userDao.createNewUser(userUUID,user.getUserName(),user.getUserSex(),user.getUserType(),user.getUserStage(),
        user.getUserState(),user.getUserCard(),encodePass);
    }
}
