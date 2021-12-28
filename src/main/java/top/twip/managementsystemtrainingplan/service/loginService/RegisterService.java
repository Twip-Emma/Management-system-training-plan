package top.twip.managementsystemtrainingplan.service.loginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.twip.managementsystemtrainingplan.entity.User;
import top.twip.managementsystemtrainingplan.utils.identify.LoginIdentify;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/28 10:18
 */
@Service
public class RegisterService {
    private LoginIdentify loginIdentify;

    @Autowired
    public RegisterService(LoginIdentify loginIdentify) {
        this.loginIdentify = loginIdentify;
    }

    //创建用户，返回状态码
    public Integer createNewUser(User user){
        Boolean create = loginIdentify.checkUserCreate(user.getUserCard());
        if(create){
            loginIdentify.createNewUser(user);
            return 10000;
        }else {
            return 40000;
        }
    }
}
