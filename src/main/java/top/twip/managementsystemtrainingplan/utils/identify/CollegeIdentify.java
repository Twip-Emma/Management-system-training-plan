package top.twip.managementsystemtrainingplan.utils.identify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 10:05
 */
@Component
public class CollegeIdentify {
    private final CollegeIdentifyTool collegeIdentifyTool;

    @Autowired
    public CollegeIdentify(CollegeIdentifyTool collegeIdentifyTool) {
        this.collegeIdentifyTool = collegeIdentifyTool;
    }
}
