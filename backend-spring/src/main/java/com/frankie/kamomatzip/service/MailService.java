package com.frankie.kamomatzip.service;

import com.frankie.kamomatzip.dto.response.EmailVerificationResponse;
import com.frankie.kamomatzip.enums.ExceptionCode;
import com.frankie.kamomatzip.exception.BusinessLogicException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class MailService {

    private final JavaMailSender emailSender;

    // 이메일 전송
    public void sendEmail(String toEmail, String title, String text)
    {
        SimpleMailMessage emailForm = createEmailForm(toEmail, title, text);
        
        try {
            emailSender.send(emailForm);
        } catch (RuntimeException e) {
            log.debug("MailService.sendEmail exception occur toEmail: {}, title: {}, text: {}", toEmail, title, text);
            throw new IllegalArgumentException("이메일 전송 에러");
        }
    }

    // 발신할 이메일 데이터 세팅
    private SimpleMailMessage createEmailForm(String toEmail, String title, String text)
    {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(toEmail);
        message.setSubject(title);
        message.setText(text);

        return message;
    }

    public void sendCodeToEmail(String email)
    {
        //handleDuplicatedEmail
        String title = "카모 맛집 이메일 인증 번호";
        String authCode = createCode();

        sendEmail(email,title,authCode);
        //authCode Redis에 저장
    }

    private String createCode()
    {
        int lenth = 6;
        try {
            Random random = SecureRandom.getInstanceStrong();
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < lenth; i++) {
                builder.append(random.nextInt(10));
            }
            return builder.toString();
        } catch (NoSuchAlgorithmException e) {
            log.info("메일 인증 알고리즘 관련 오류가 발생했습니다.");
            throw new RuntimeException(e);
        }
    }

    public EmailVerificationResponse verifiedCode(String email, String authCode)
    {
        //compare value with redis
        return new EmailVerificationResponse();
    }
}