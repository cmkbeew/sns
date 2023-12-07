package com.fastcampus.sns.service;

import com.fastcampus.sns.controller.model.User;
import com.fastcampus.sns.controller.model.entity.UserEntity;
import com.fastcampus.sns.exception.SnsApplicationException;
import com.fastcampus.sns.repository.UserEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserEntityRepository userEntityRepository;

    // TODO: implement
    public User join(String userName, String password) {
        // userName 중복체크
        Optional<UserEntity> userEntity = userEntityRepository.findByUserName(userName);

        // 회원가입 진행 = user 등록
//        userEntityRepository.save();

        return new User();
    }

    // JWT를 이용할 때 로그인 성공 시 그에 맞는 토큰을 반환해주기 위해 String 타입으로 작성
    // TODO: implement
    public String login(String userName, String password) {
        // 회원가입 여부 체크
        UserEntity userEntity = userEntityRepository.findByUserName(userName).orElseThrow(() -> new SnsApplicationException());

        // 비밀번호 체크
        if (!userEntity.getPassword().equals(password)) {
            throw new SnsApplicationException();
        }

        // 토큰 생성

        return "";
    }
}
