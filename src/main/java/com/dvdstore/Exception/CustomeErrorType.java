package com.dvdstore.Exception;

public class CustomeErrorType {

    private String errorMessage;

    public CustomeErrorType(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage()
    {
        return errorMessage;
    }
}
