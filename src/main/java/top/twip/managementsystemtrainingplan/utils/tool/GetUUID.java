package top.twip.managementsystemtrainingplan.utils.tool;

import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/27 15:48
 */
@Component
public class GetUUID {
    //获取用户唯一id
    public String getUserUUID() {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        String uuidStr = str.replace("-", "user");
        return uuidStr;
    }

    //获取学院唯一id
    public String getCollegeUUID() {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        String uuidStr = str.replace("-", "college");
        return uuidStr;
    }

    //获取课程唯一id
    public String getSourseUUID() {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        String uuidStr = str.replace("-", "sourse");
        return uuidStr;
    }

    //获取选课状态唯一id
    public String getSituationUUID() {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        String uuidStr = str.replace("-", "situation");
        return uuidStr;
    }

    //获取日志唯一id
    public String getLogUUID() {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        String uuidStr = str.replace("-", "log");
        return uuidStr;
    }
}
