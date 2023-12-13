package com.frankie.kamomatzip.exception;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BusinessLogicException extends Throwable
{
    private String msg;
    public BusinessLogicException(String msg)
    {
        this.msg = msg;
    }
}
