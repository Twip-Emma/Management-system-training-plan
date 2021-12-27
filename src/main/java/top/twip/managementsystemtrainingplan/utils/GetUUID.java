package top.twip.managementsystemtrainingplan.utils;

import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/27 15:48
 */
@Component
public class GetUUID {
    public String getUserUUID() {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        String uuidStr = str.replace("-", "user");
        return uuidStr;
    }

    public String getCollegeUUID() {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        String uuidStr = str.replace("-", "college");
        return uuidStr;
    }

    public String getSourseUUID() {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        String uuidStr = str.replace("-", "sourse");
        return uuidStr;
    }

    public String getSituationUUID() {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        String uuidStr = str.replace("-", "situation");
        return uuidStr;
    }

    public String getLogUUID() {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        String uuidStr = str.replace("-", "log");
        return uuidStr;
    }
}
