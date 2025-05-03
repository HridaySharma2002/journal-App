//package com.hriday.journalApp.service;
//
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.*;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//
//@Disabled
//@SpringBootTest
//public class EmailServiceTests {
//
//    @Autowired
//    private EmailService emailService;
//
//    @MockBean
//    private JavaMailSender javaMailSender; // Mock the JavaMailSender
//
//    @Test
//    void testSendMail() {
//        String to = "gmail@gmail.com";
//        String subject = "Testing java mail sender";
//        String body = "Hi , How are you ?";
//
//        emailService.sendEmail(to, subject, body);
//
//        // Verify that the send method of the mock JavaMailSender was called
//        verify(javaMailSender, times(1)).send(any(SimpleMailMessage.class));
//    }
//
//}