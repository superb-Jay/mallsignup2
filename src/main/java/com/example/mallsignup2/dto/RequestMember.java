package com.example.mallsignup2.dto;

import com.example.mallsignup2.entity.Member;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RequestMember {

    private String userId;
    private String password;
    private String name;
    private String age;
    private String phone;
    private String address;

    public Member toEntity() {
        return Member.builder()
                .id(userId)
                .password(password)
                .name(name)
                .age(Integer.parseInt(age))
                .phone(phone)
                .address(address)
                .build();
    }





}
