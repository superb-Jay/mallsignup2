package com.example.mallsignup2.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tn_member")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member {


    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "id")
    private String password;

    @Column(name = "id")
    private String name;

    @Column(name = "id")
    private String age;

    @Column(name = "id")
    private String phone;

    @Column(name = "id")
    private String adrress;



}
