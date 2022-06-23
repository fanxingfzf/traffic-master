package com.msb.api.commons;

/**
 * 每次请求都返回这个
 */
public class ResponseResult<T> {

    //当前相应的状态码
    String resultCode;
    //当前相应的信息
    String resultMsg;
    //具体的结果
    T result;

    public ResponseResult(String resultCode) {
        this.resultCode = resultCode;
    }

    public ResponseResult(String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    public ResponseResult(String resultCode, String resultMsg, T result) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
        this.result = result;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
