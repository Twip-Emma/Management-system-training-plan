package top.twip.managementsystemtrainingplan.entity;

import lombok.Data;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/27 17:27
 */
@Data
public class User {
    private String userId;
    private String userName;
    private String userSex;
    private String userType;
    private Integer userStage;
    private Integer userMark;
    private String userState;
    private String userCard;
    private String userPass;
}
