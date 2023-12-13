package com.frankie.kamomatzip.service;

import com.frankie.kamomatzip.exception.BusinessLogicException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class MailAuthService
{
    private static final String AUTH_CODE_PREFIX = "AuthCode ";
    private final MailService mailService;
//    private final MemberRepository memberRepository;
//    private final RedisService redisService;


//    @Value("${spring.mail.auth-code-expiration-millis}")
//    private long authCodeExpirationMillis;
//
//    public void sendCodeToEmail(String toEmail) {
//        this.checkDuplicatedEmail(toEmail);
//        String title = "Travel with me 이메일 인증 번호";
//        String authCode = this.createCode();
//        mailService.sendEmail(toEmail, title, authCode);
//        // 이메일 인증 요청 시 인증 번호 Redis에 저장 ( key = "AuthCode " + Email / value = AuthCode )
//        redisService.setValues(AUTH_CODE_PREFIX + toEmail,
//                               authCode, Duration.ofMillis(this.authCodeExpirationMillis));
//    }
//
//    private void checkDuplicatedEmail(String email) {
//        Optional<Member> member = memberRepository.findByEmail(email);
//        if (member.isPresent()) {
//            log.debug("MemberServiceImpl.checkDuplicatedEmail exception occur email: {}", email);
//            throw new BusinessLogicException(ExceptionCode.MEMBER_EXISTS);
//        }
//    }
//
//    private String createCode() {
//        int lenth = 6;
//        try {
//            Random random = SecureRandom.getInstanceStrong();
//            StringBuilder builder = new StringBuilder();
//            for (int i = 0; i < lenth; i++) {
//                builder.append(random.nextInt(10));
//            }
//            return builder.toString();
//        } catch (NoSuchAlgorithmException e) {
//            log.debug("MemberService.createCode() exception occur");
//            throw new BusinessLogicException(ExceptionCode.NO_SUCH_ALGORITHM);
//        }
//    }
//
//    public EmailVerificationResult verifiedCode(String email, String authCode) {
//        this.checkDuplicatedEmail(email);
//        String redisAuthCode = redisService.getValues(AUTH_CODE_PREFIX + email);
//        boolean authResult = redisService.checkExistsValue(redisAuthCode) && redisAuthCode.equals(authCode);
//
//        return EmailVerificationResult.of(authResult);
//    }
}
