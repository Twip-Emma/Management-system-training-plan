package top.twip.managementsystemtrainingplan.entity;

import lombok.Data;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/27 17:24
 */
@Data
public class Sourse {
    private String sourseId;
    private String sourseName;
    private Integer mark;
    private Integer theoryTime;
    private Integer testTime;
    private Integer fieldTime;
    private Integer termTime;
    private String collegeId;
    private String moreText;
}
