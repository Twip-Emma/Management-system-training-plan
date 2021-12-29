package top.twip.managementsystemtrainingplan.utils.identify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.twip.managementsystemtrainingplan.dao.MarkDao;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 10:07
 */
@Component
public class MarkIdentifyTool {
    private final MarkDao markDao;

    @Autowired
    public MarkIdentifyTool(MarkDao markDao) {
        this.markDao = markDao;
    }
}
