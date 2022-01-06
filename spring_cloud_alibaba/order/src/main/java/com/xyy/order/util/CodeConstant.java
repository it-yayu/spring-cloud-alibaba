package com.xyy.order.util;

/**
 * @author v-baihaitao
 */
public class CodeConstant {

    /**
     * 选择处置状态
     */
    public static final Integer ZERO=0;
    public static final Integer ONE=1;
    public static final Integer TWO=2;
    public static final Integer THREE=3;

    /**
     * 推送授权码
     */
    public static final String USERNAME = "ZCAdmin";
    public static final String PASSWORD = "ZCt832Ac";
    public static final String AUTHENTICATIONCODE = "ZCykVAE58Z692J";

    /**
     * 成功
     */
    public static final int SUCCESS = 200;
    public static final String SUCCESS_DESC = "操作成功！";
    public static final String NAME_EXIST = "名称已存在！";
    public static final String URL_EXIST = "资产地址已存在！";
    public static final String EMAIL_EXIST = "邮箱已经存在！";

    /**
     * 失败
     */
    public static final int FAIL = 0;

    static final String FAIL_DESC = "操作失败！";

    public static final String NO_USER = "此用户不存在！";

    public static final String USER_DISABLE = "此用户已被禁用!";

    public static final String PASS_NO_COMPARE = "新旧密码不匹配！";

    public static final String PARAM_ERROR = "参数错误或为空！";

    public static final String USER_OR_PASSWORD_ERROR = "用户名或密码不正确";

    public static final int SYS_ERROR_CODE = 500;
    public static final String SYS_ERROR_DESC = "系统错误，请稍后再试！";

    public static final String CODE_NO_NULL = "验证码不能为空！";

    public static final String INITIAL_PASSWORD = "您的密码为初始密码,请及时修改！";

    public static final String LOGIN_SUCCESS = "登录成功！";

    /**
     * 系统管理员编号(人)
     */
    public static final int SYSTEM_MANAGE_CODE = 1;

    /**
     * 审计员编号(人)
     */
    public static final int AUDITOR = 2;


    public static final int NO_URL = 401;

    public static final String NO_URL_DESC = "请求路径错误或没有此功能路径访问权限！";

    public static final String NO_VIOLATION_FOR_30_DAY = "连续30天内无违规";
    /**
     * 角色赋权错误
     */
    public static final int ROLE_PERMISSION_NOT_MODIFICATION = 10009;
    public static final String ROLE_PERMISSION_NOT_MODIFICATION_DESC = "初始角色权限不能被减少！";
    public static final String ROLE_PERMISSION_NOT_CHANGE_MODIFICATION_DESC = "初始角色不能删除！";

    /**
     * 邮箱短信相关
     */
    public static final String MAILBOX_VERIFICATION_CODE = "邮箱验证码";

    public static final String MAIL_FROM = "yangyc0512@163.com";

    /**
     * 用户/企业注册 审核驳回与通过
     */
    public static final String CHECK_SUCCESS = "【众测平台】用户注册审核通过";

    public static final String CHECK_FAIL = "【众测平台】用户注册审核驳回";

    public static final String STOP_PROJECT = "【360众测】项目暂停通知";

    public static final String RECOVERY_PROJECT = "【360众测】项目恢复通知";


    /**
     * 违规处置
     */
    public static final String NOTICE_VIOLATION = "违规处置邮件通知";


    /**
     * token
     */
    public static final String TOKEN = "f2344615c5de7214b8116903a07eb09e";

    /**
     * 用户被删除
     */
    public static final int USER_ID_IS_NULL = 10001;

    /**
     * 用户ID不存在
     */
    private static final int USER_ID_NOT_EXIST = 10002;

    /**
     * 用户权限错误
     */
    private static final int USER_RIGHTS_ERROR = 10003;

    /**
     * 用户登录密码不对
     */
    private static final int USER_PASSWORD_ERROR = 10004;

    /**
     * 用户未登录
     */
    public static final int USER_NOT_LOGIN_ERROR = 10005;

    /**
     * 用户状态错误
     */
    private static final int USER_DELETE_ERROR = 10006;

    /**
     * 用户被禁用
     */
    public static final int USER_DISABLE_CODE = 10007;

    /**
     * 用户权限被修改
     */
    public static final int USER_PERMISSION_UPDATE = 10008;

    /**
     * 用户数据权限为空
     */
    public static final int USER_PERMISSION_IS_NULL = 10010;

    /**
     * 用户注销
     */
    public static final int USER_CANCELLATION = 10011;

    /**
     * 输入参数不符合要求
     */
    private static final int APPLY_FILE_UPLOAD_FILL = 30001;

    /**
     * 输入身份证信息错误
     */
    private static final int APPLY_APPLYINFO_FILL_ID = 30002;

    /**
     * 输入配偶身份证信息错误
     */
    private static final int APPLY_APPLYINFO_FILL_SPOUSEID = 30003;

    /**
     * 输入手机号信息错误
     */
    private static final int APPLY_APPLYINFO_FILL_PHONE = 30004;

    /**
     * 输入配偶手机号信息错误
     */
    private static final int APPLY_APPLYINFO_FILL_SPOUSEPHONE = 30005;

    /**
     * 输入备注信息
     */
    private static final int APPLY_FILE_UPLOAD_FILL_FAILURE_REMARK = 30006;

    /**
     * 文件不存在
     */
    private static final int APPLY_FILE_DELETE_FILL_FAILURE = 30007;

    /**
     * 文件类型错误
     */
    private static final int APPLY_FILE_UPLOAD_FILL_FILETYE = 30008;
    /**
     * 验证码错误
     */
    public static final int CODE_ERROR_CODE = 30009;

    /**
     * 密码不一致
     */
    public static final int TWO_PASSWORD_NOT_MATCH = 30010;


    public static final int WAIT_CHECK = 40001;

    /**
     * 身份证格式有误
     */
    public static final int ID_NUMBER = 30011;

    /**
     * 不能进行实名认证
     */
    public static final int NO_NUMBER = 30012;

    /**
     * 身份证已存在
     */
    public static final int NUM_EXIST = 30013;

    /**
     * 第三方实名认证用完
     */
    public static final int FINISH = 30014;


    /**
     * 文件类型
     */
    public static String TYPE_RAR = "RAR";
    public static String TYPE_ZIP = "ZIP";
    public static String TYPE_DOC = "DOC";
    public static String TYPE_DOCX = "DOCX";
    public static String TYPE_PDF = "PDF";
    public static String TYPE_JPG = "JPG";
    public static String TYPE_LIC = "LIC";
    public static String TYPE_PNG = "PNG";

    /**
     * 审核
     */
    public static String WAIT_CHECK_CODE = "0";
    public static String CHECK_SUCCESS_CODE = "1";
    public static String CHECK_FAIL_CODE = "2";


    /**
     * 白帽企业用户标识
     */
    public static final String SECURITY_USER = "28a59bff2e214b5d8ca8fdfa4d57792e";
    public static final String ENTERPRISE_USER = "759892a3f5f04351a91ed257ac52a51d";

    /**
     * token过期时间
     */
    public static final int TOKEN_OUT_TIME = 6;
    public static final String TOKEN_TIME_FLAG="flag";

    /**
     * 短信相关配置
     */
    public static final String SEND_MSG_API_CODE="9ebf907484b043dcae131a9a20e20ea2";
    public static final String MSG_SIGNATURE="【众测平台】";

    /**
     * 前后台验证码标记
     */
    public static final String BACK_CODE_FLAG="back_";
    public static final String FRONT_CODE_FLAG="front_";

    /**
     * 安全员实名认证标识
     */
    public static final String REAL_NAME_FLAG="realName_mobile_";
    public static final String REAL_NAME_TODAY_KEY="todayKey_";

    public static final String REG_CAPTCHA_FLAG="reg_captcha_flag";
    /**
     * 发送短信标识
     */
    public static final String REG_FLAG="1";
    public static final String RESET_PASS_FLAG="2";

    /**
     * 更换手机号
     */
    public static final String CHANGE_MOBILE_FLAG="change_mobile_";
    public static final String CHANGE_MOBILE_TODAY_KEY="change_mobile_key_";
    public static final String CHANGE_MOBILE_ENTERPRISE_FLAG="change_mobile_enterprise_";
    public static final String CHANGE_MOBILE_ENTERPRISE_TODAY_KEY="change_mobile_enterprise_key_";

    /**
     * 注册
     */
    public static final String REG_NAME_FLAG="reg_name_flag_";
    public static final String REG_NAME_TODAY_PHONE="reg_name_today_phone_";

    /**
     * 重置密码
     */
    public static final String RESET_NAME_FLAG="reset_name_flag_";
    public static final String RESET_NAME_BACK_FLAG="reset_name_back_flag_";
    public static final String RESET_NAME_TODAY_PHONE="reset_name_today_phone_";

    /**
     * 更换银行卡
     */
    public static final String CHANGE_BANK_CARD_FLAG="change_bank_card_flag_";
    public static final String CHANGE_BANK_CARD_TODAY_KEY="change_bank_card_today_key_";





    public static String getResultDescByResultCode(int code) {

        switch (code) {
            case SUCCESS:
                return "恭喜，您的操作已成功";
            case FAIL:
                return "操作失败";

            case USER_ID_IS_NULL:
                return "用户ID为空";
            case USER_ID_NOT_EXIST:
                return "用户ID不存在";
            case USER_RIGHTS_ERROR:
                return "用户权限不足";
            case USER_PASSWORD_ERROR:
                return "密码错误";
            case USER_NOT_LOGIN_ERROR:
                return "您尚未登录，请先登录";
            case USER_DELETE_ERROR:
                return "用户已被删除";

            case APPLY_FILE_UPLOAD_FILL:
                return "输入参数不符合要求";
            case APPLY_APPLYINFO_FILL_ID:
                return "输入身份证信息错误";
            case APPLY_APPLYINFO_FILL_SPOUSEID:
                return "输入配偶身份证信息错误";
            case APPLY_APPLYINFO_FILL_PHONE:
                return "输入手机号信息错误";
            case APPLY_APPLYINFO_FILL_SPOUSEPHONE:
                return "输入配偶手机号信息错误";
            case APPLY_FILE_UPLOAD_FILL_FAILURE_REMARK:
                return "输入备注信息";
            case APPLY_FILE_DELETE_FILL_FAILURE:
                return "文件不存在";
            case APPLY_FILE_UPLOAD_FILL_FILETYE:
                return "文件类型错误";
            case CODE_ERROR_CODE:
                return "图形验证码错误";
            case TWO_PASSWORD_NOT_MATCH:
                return "您两次输入的密码不一致";

            default:
                return "";
        }
    }
}
