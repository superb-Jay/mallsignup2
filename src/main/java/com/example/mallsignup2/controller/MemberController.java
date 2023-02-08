package com.example.mallsignup2.controller;


import com.example.mallsignup2.dto.RequestMember;
import com.example.mallsignup2.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;


    @PostMapping("/signup")
    public String insertMember(RequestMember requestMember) {
        return memberService.insertMember(requestMember);

    }
}
