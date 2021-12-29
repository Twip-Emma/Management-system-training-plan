package top.twip.managementsystemtrainingplan.utils.identify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 10:07
 */
@Component
public class MarkIdentify {
    private final MarkIdentifyTool markIdentifyTool;

    @Autowired
    public MarkIdentify(MarkIdentifyTool markIdentifyTool) {
        this.markIdentifyTool = markIdentifyTool;
    }
}
