package com.frankie.kamomatzip;

import com.frankie.kamomatzip.service.MailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class LoginServiceTest
{

    @Autowired
    MailService mailService;

    @Test
    void 메일_전송_테스트()
    {
        List<String> strings = List.of("gudals113@gmail.com","doyun0887@gmail.com", "jaguar6244@gmail.com", "larcane97@gmail.com", "alittlekitten@gmail.com");
        for (String string : strings)
        {
            mailService.sendEmail(string,"아아 마이크 테스트","아아 마이크 테스트 원 투 원 투");
        }

    }
}
