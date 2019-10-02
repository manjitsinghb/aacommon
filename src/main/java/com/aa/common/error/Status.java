package com.aa.common.error;

public class Status {
    private final StatusCode statusCode;
    private final String statusMessage;

    public Status(StatusCode statusCode, String statusMessage) {
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
    }

    public StatusCode getStatusCode() {
        return statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }
}
