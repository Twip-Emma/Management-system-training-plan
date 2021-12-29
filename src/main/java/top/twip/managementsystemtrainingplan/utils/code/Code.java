package top.twip.managementsystemtrainingplan.utils.code;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/29 17:16
 */
public enum Code {
    success{
        public Integer getCode(){ return 10000; }
        public String getMessage(){ return "请求成功"; }
    },
    fail{
        public Integer getCode(){ return 40000; }
        public String getMessage(){
            return "请求失败";
        }
    },
    successPlus{
        public Integer getCode(){ return 10001; }
        public String getMessage(){return "请求成功，但是出现部分异常";}
    }
}
