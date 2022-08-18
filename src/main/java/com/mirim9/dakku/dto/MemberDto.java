package com.mirim9.dakku.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto extends BaseEntityDto {
    private Long memberId;

    private String nickname;

    private String email;

    private String password;
}
