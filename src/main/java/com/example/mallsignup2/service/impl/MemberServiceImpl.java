package com.example.mallsignup2.service.impl;

import com.example.mallsignup2.dto.RequestMember;
import com.example.mallsignup2.dto.ResponseMember;
import com.example.mallsignup2.repository.MemberRepository;
import com.example.mallsignup2.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public ResponseMember insertMember(RequestMember requestMember) {

        try {
            memberRepository.save(requestMember.toEntity());
        }catch (Exception e) {
            return ResponseMember.builder()
                    .code("error")
                    .content(e.getMessage())
                    .build();
        }
        return ResponseMember.builder()
                .code("success")
                .build();
    }
}
