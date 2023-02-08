package com.example.mallsignup2.service;

import com.example.mallsignup2.dto.RequestMember;
import com.example.mallsignup2.dto.ResponseMember;

public interface MemberService {

    ResponseMember insertMember(RequestMember requestMember);
}
