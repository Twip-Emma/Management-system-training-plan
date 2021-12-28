package top.twip.managementsystemtrainingplan.service.loginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.twip.managementsystemtrainingplan.entity.User;
import top.twip.managementsystemtrainingplan.utils.identify.UserIdentify;
import top.twip.managementsystemtrainingplan.utils.result.WebResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/28 10:18
 */
@Service
public class LoginService {
    private UserIdentify userIdentify;

    @Autowired
    public LoginService(UserIdentify userIdentify) {
        this.userIdentify = userIdentify;
    }

    //登录用户
    public WebResult userLogin(User user){
        Boolean aBoolean = userIdentify.checkUserPass(user.getUserCard(), user.getUserPass());
        if(aBoolean){
            User userByCard = userIdentify.findUserByCard(user.getUserCard());
            WebResult result = new WebResult(10000,"登录成功");
            result.setData(userByCard);
            return result;
        }else {
            return new WebResult(40000,"登录失败，请检查账号或密码");
        }
    }
}
