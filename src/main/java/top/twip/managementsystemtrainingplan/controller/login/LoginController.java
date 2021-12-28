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

    @PostMapping(value = "/newUser")
    public WebResult createNewUser(@RequestBody String webData){
        User user = JSONObject.parseObject(webData, User.class);
        Integer code = loginService.createNewUser(user);
        if(code == 10000) {
            return new WebResult(10000, "成功创建");
        }else{
            return new WebResult(40000,"创建失败");
        }
    }
}
