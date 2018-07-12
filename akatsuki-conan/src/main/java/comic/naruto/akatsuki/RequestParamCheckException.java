package comic.naruto.akatsuki;

/**
 * @author 杨龙 [long.yl]
 * @since 2018/7/12
 */
public class RequestParamCheckException extends RuntimeException {

    private static final long serialVersionUID = -4687901755830401336L;
    /**
     * 返回码
     */
    private int code;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 详细信息
     */
    private String detail;

    public RequestParamCheckException(CheckExceptionEnum exceptionEnum){
        this.code = exceptionEnum.getCode();
        this.msg = exceptionEnum.getMsg();
    }

    public RequestParamCheckException appendDetail(String detail){
        this.detail = detail;
        return this;
    }
}
