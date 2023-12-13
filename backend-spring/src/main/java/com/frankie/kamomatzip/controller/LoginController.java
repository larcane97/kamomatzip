package com.frankie.kamomatzip.controller;

import com.frankie.kamomatzip.dto.response.EmailVerificationResponse;
import com.frankie.kamomatzip.service.MailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/login")
@RequiredArgsConstructor
@Slf4j
public class LoginController
{

    private final MailService mailService;

    @PostMapping("/email/{email}")
    public ResponseEntity sendMessage(@RequestParam("email") String email)
    {
        mailService.sendCodeToEmail(email);
        return new ResponseEntity<>(HttpStatus.OK);
    }

        @GetMapping("/emails/verifications")
        public ResponseEntity verificationEmail(@RequestParam("email") String email, @RequestParam("code") String authCode)
        {
            EmailVerificationResponse response = mailService.verifiedCode(email, authCode);

            return new ResponseEntity<>(HttpStatus.OK);
        }

}