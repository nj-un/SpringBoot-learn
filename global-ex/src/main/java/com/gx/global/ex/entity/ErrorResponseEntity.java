package com.gx.global.ex.entity;

/**
 * @author: gaoxu
 * @date: 2018/9/18
 */
public class ErrorResponseEntity {
    private int code;
    private String message;

    public ErrorResponseEntity() {
    }

    public ErrorResponseEntity(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
