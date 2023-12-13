package com.frankie.kamomatzip.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@Getter
public enum ExceptionCode
{
    NO_SUCH_ALGORITHM("M001","해당 알고리즘은 메일 인증에서 사용할 수 없습니다.");

    private final String code;
    private final String msg;
}
