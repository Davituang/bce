package com.heiyo.bce.enums;

public enum BceError {
    ;

    // 错误码
    private String code;

    // 错误信息
    private String message;

    // 解决方案
    private String solution;

    BceError(String code, String message) {
        this.code = code;
        this.message = message;
        this.solution = "";
    }

    BceError(String code, String message, String solution) {
        this.code = code;
        this.message = message;
        this.solution = solution;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getSolution() {
        return solution;
    }
}
