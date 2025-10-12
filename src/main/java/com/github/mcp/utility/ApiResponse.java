package com.github.mcp.utility;

public class ApiResponse <T>{
    private String message;
    private T data;
    private String status;

    public ApiResponse(String message, T data, String status) {
        this.message = message;
        this.data = data;
        this.status=status;

    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }



}
