package top.twip.managementsystemtrainingplan.utils.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/28 10:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WebResult<T>{
    private Integer code;
    private String message;
    private T data;
    public WebResult(Integer code,String message){
        this(code,message,null);
    }
}
