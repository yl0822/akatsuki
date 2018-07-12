package comic.naruto.akatsuki;

/**
 * @author 杨龙 [long.yl]
 * @since 2018/7/12
 *
 * 校验异常集
 */
public enum CheckExceptionEnum {

    NULL(0, "未知"),
    SUCCESS(200, "成功"),
    NOT_LOGIN(301, "未登录"),
    NOT_AUTHORIZED(302, "未授权"),
    WRONG_PARAMS(400, "参数错误"),
    NO_RESOURCE(404, "资源不存在"),
    SYS_ERROR(500, "系统异常");

    CheckExceptionEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private int code;

    private String msg;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
