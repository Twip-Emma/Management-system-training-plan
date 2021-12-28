package top.twip.managementsystemtrainingplan.utils.tool;

import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/27 15:51
 */
@Component
public class PasswordEncoder {
    //传入明文-加密
    public String encode(CharSequence rawPassword) {
        return DigestUtils.md5DigestAsHex(rawPassword.toString().getBytes());
    }

    //传入明文和密文-判断是否对应
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encodedPassword.equals(DigestUtils.md5DigestAsHex(rawPassword.toString().getBytes()));
    }
}
