package com.example.fisconft.common;

import com.example.fisconft.common.base.BaseResultInterface;

/**
 * @Author LiYunYan
 * @Date： 2021/12/8
 * @Description: 相应结果枚举
 */
public enum ResponseEnum implements BaseResultInterface {
    SUCCESS(200, "成功!"),
    SERVER_BUSY(500, "服务器繁忙"),
    BIZ_ERROR(408, "业务异常"),
    SEND_CODE_ERROR(40110,"验证码发送错误"),
    PARAM_ERROR(40111, "参数格式错误"),
    UNKONW_ERROR(40112, "未知异常"),
    CREATE_ACCOUNT_ERROR(40113, "创建账户错误"),
    SAVE_ACCOUNT_KEY_ERROR(40114, "保存账户错误"),
    AUTH_ERROR(40115, "权限错误"),
    PERMISSION_ERROR(40119, "当前账号无权限"),
    CONTRACT_INIT_ERROR(40116, "合约初始化错误"),
    CONTRACT_CALL_ERROR(40117, "合约调用失败"),
    LOGIN_FAIL(40118, "登录失败");


    /*错误码*/
    private final int resultCode;

    /*错误信息*/
    private final String resultMsg;

    ResponseEnum(int resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    @Override
    public int getResultCode() {
        return resultCode;
    }

    @Override
    public String getResultMsg() {
        return resultMsg;
    }
}
