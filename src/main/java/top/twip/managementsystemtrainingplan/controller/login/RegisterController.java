package top.twip.managementsystemtrainingplan.controller.login;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.twip.managementsystemtrainingplan.entity.User;
import top.twip.managementsystemtrainingplan.service.loginService.LoginService;
import top.twip.managementsystemtrainingplan.service.loginService.RegisterService;
import top.twip.managementsystemtrainingplan.utils.result.WebResult;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/28 10:13
 */
@RestController
@RequestMapping(value = "/register")
public class RegisterController {
    private final RegisterService registerService;

    @Autowired
    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    @PostMapping(value = "/newUser")
    public WebResult<User> createNewUser(@RequestBody String webData){
        User user = JSONObject.parseObject(webData, User.class);
        Integer code = registerService.createNewUser(user);
        if(code == 10000) {
            return new WebResult<>(10000, "成功创建");
        }else{
            return new WebResult<>(40000,"创建失败");
        }
    }
}
