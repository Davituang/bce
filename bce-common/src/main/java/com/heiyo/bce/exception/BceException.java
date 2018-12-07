package com.heiyo.bce.exception;

import com.heiyo.bce.enums.BceError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BceException extends RuntimeException {

    private static final long serialVersionUID = -2289391342117039412L;

    private Logger logger = LoggerFactory.getLogger(BceException.class);

    private String code;

    private String message;

    private String solution;

    public BceException(String message, BceError error, Throwable cause) {
        super(cause);
        this.code = error.getCode();
        this.message = message;
        this.solution = "";
    }

    public BceException(BceError error){
        this.code = error.getCode();
        this.message = error.getMessage();
        this.solution = error.getSolution();
    }

    public BceException(BceError error,Throwable cause){
        super(cause);
        this.code = error.getCode();
        this.message = error.getMessage();
        this.solution = error.getSolution();
    }
}
