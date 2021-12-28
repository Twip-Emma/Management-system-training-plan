package top.twip.managementsystemtrainingplan.controller.login;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import top.twip.managementsystemtrainingplan.entity.User;
import top.twip.managementsystemtrainingplan.service.loginService.LoginService;
import top.twip.managementsystemtrainingplan.utils.result.WebResult;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/28 10:07
 */
@RestController(value = "/login")
public class LoginController {
    private LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping(value = "/checkUser")
    public WebResult createNewUser(@RequestBody String webData){
        User user = JSONObject.parseObject(webData, User.class);
        Integer code = loginService.userLogin(user);
        if(code == 10000){
            return new WebResult(10000,"登录成功！");
        }else{
            return new WebResult(40000,"登录失败，请检查账号或密码是否正确");
        }
    }
}
