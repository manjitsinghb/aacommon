package com.aa.common.register;

import com.aa.common.error.Status;

public class RegisterAdopterResponse {
    private Status status;

    public RegisterAdopterResponse(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }
}
