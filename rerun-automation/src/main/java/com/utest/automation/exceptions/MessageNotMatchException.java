package com.utest.automation.exceptions;

public class MessageNotMatchException extends AssertionError {

    public MessageNotMatchException(String message, Throwable cause) {
        super(message, cause);
    }
}
