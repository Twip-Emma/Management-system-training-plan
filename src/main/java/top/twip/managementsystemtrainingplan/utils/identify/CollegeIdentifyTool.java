package top.twip.managementsystemtrainingplan.utils.identify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.twip.managementsystemtrainingplan.dao.CollegeDao;
import top.twip.managementsystemtrainingplan.utils.tool.GetUUID;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 10:06
 */
@Component
public class CollegeIdentifyTool {
    private final CollegeDao collegeDao;
    private final GetUUID getUUID;

    @Autowired
    public CollegeIdentifyTool(CollegeDao collegeDao, GetUUID getUUID) {
        this.collegeDao = collegeDao;
        this.getUUID = getUUID;
    }
}
