package com.xyy.order.util;

import java.io.Serializable;

/**
 *
 * @author yangjunguo
 * @date 21/5/26
 * 统一的响应对象
 */

public class ResponseMsg<T> implements Serializable {

    private int code;

    private String msg;

    private T data = null;

    public ResponseMsg(int code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public ResponseMsg(int code, String msg, T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static ResponseMsg success(){
        return new ResponseMsg(CodeConstant.SUCCESS, CodeConstant.SUCCESS_DESC);
    }

    public static ResponseMsg fail(){
        return new ResponseMsg(CodeConstant.FAIL, CodeConstant.FAIL_DESC);
    }

    public static ResponseMsg fail(int code, String msg){
        return new ResponseMsg(code, msg);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
