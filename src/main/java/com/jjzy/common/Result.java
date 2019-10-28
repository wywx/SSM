package com.jjzy.common;

/**
 * @Author wj
 * @Date 2019/10/28 18:50
 * Version 1.0
 * 这个是对结果集的封装
 */
public class Result<T> {
   private String message;
   private boolean success;
   private T data;

    /**
     * 失败
     * @param message
     */
    public Result(String message) {
        this.message = message;
        this.success = false;
    }

    /**
     * 有数据的成功
     * @param
     * @param data
     */
    public Result(T data) {
        this.success = true;
        this.data = data;
    }

    /**
     * 没有数据的成功
     * @return
     */
    public Result() {
        this.success = true;
    }



    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
