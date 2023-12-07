package com.fastcampus.sns.controller.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

// 회원가입할 때 RequestBody로 받아오는 데이터로 사용할 class

@Getter
@AllArgsConstructor
public class UserJoinRequest {

    private String userName;
    private String password;

}
