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
public class LoginService {
    private LoginIdentify loginIdentify;

    @Autowired
    public LoginService(LoginIdentify loginIdentify) {
        this.loginIdentify = loginIdentify;
    }

    //登录用户
    public Integer userLogin(User user){
        Boolean aBoolean = loginIdentify.checkUserPass(user.getUserCard(), user.getUserPass());
        if(aBoolean){
            return 10000;
        }else {
            return 40000;
        }
    }
}
