package com.frankie.kamomatzip.dto.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class EmailVerificationResponse
{
    boolean isVerified;
    String email;

}
