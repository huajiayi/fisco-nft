package com.example.fisconft.exception;

import com.example.fisconft.common.ResponseEnum;
import com.example.fisconft.common.base.BaseResultInterface;
import lombok.Data;

/**
 * @Author LiYunYan
 * @Date： 2021/12/8
 * @Description: 链异常
 */
@Data
public class ChainException extends RuntimeException {

    private int errorCode;

    private String errorMsg;

    public ChainException() {
        super();
    }

    public ChainException(BaseResultInterface baseResultInterface) {
        super(baseResultInterface.getResultMsg());
        this.errorCode = baseResultInterface.getResultCode();
        this.errorMsg = baseResultInterface.getResultMsg();
    }

    public ChainException(String errorMsg) {
        super(errorMsg);
        this.errorCode = ResponseEnum.CONTRACT_CALL_ERROR.getResultCode();
        this.errorMsg = errorMsg;
    }

    public ChainException(BaseResultInterface baseResultInterface, String errorMsg) {
        super(errorMsg);
        this.errorCode = baseResultInterface.getResultCode();
        this.errorMsg = errorMsg;
    }


}
