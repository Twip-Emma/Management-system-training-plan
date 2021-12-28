package top.twip.managementsystemtrainingplan.utils.identify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.twip.managementsystemtrainingplan.dao.UserDao;
import top.twip.managementsystemtrainingplan.entity.User;
import top.twip.managementsystemtrainingplan.utils.tool.PasswordEncoder;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/28 10:40
 */
@Component
public class LoginIdentify{
    private IdentifyTool identifyTool;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public LoginIdentify(IdentifyTool identifyTool,PasswordEncoder passwordEncoder) {
        this.identifyTool = identifyTool;
        this.passwordEncoder = passwordEncoder;
    }

    //根据ID搜索User对象
    public User findUserById(String userId){
        return identifyTool.findUserById(userId);
    }

    //根据姓名搜索User对象
    public User findUserByName(String userName){
        return identifyTool.findUserByName(userName);
    }

    //判断某个姓名是否存在
    public Boolean checkUserByName(String userName){
        User user = identifyTool.findUserByName(userName);
        if(user != null){
            return true;//用户存在返回true
        }else{
            return false;//用户不存在返回false
        }
    }

    //判断某个ID是否存在
    public Boolean checkUserById(String userId){
        User user = identifyTool.findUserById(userId);
        if(user != null){
            return true;//用户存在返回true
        }else{
            return false;//用户不存在返回false
        }
    }

    //判断明文密文是否对应
    public Boolean checkUserPass(String userInputCard,String userInputPass){
        String pass = identifyTool.findPassByCard(userInputCard);
        if(pass != null){
            boolean checkRes = passwordEncoder.matches(userInputPass, pass);
            if(checkRes){
                return true;
            }else {
                return false;
            }
        }else{
            return false;
        }
    }

    //判断这个用户是否可以被创建
    public Boolean checkUserCreate(String userInputCard){
        String pass = identifyTool.findPassByCard(userInputCard);
        if(pass != null){
            return false;//用户存在，不允许重复创建
        }else{
            return true;//用户不存在，可以被创建
        }
    }

    //创建一个用户
    public void createNewUser(User user){
        identifyTool.createNewUser(user);
    }
}
