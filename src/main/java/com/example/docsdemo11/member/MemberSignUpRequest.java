package com.example.docsdemo11.member;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.Getter;

@Getter
public class MemberSignUpRequest {

    @Email
    @Size(max = 30)
    private String email;

    @NotEmpty
    @Size(max = 10)
    private String name;


    public Member toEntity() {
        return new Member(email, name);
    }
}