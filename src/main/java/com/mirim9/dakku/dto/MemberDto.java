package com.mirim9.dakku.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MemberDto extends BaseEntityDto{
    private Long memberId;

    private String nickname;

    private String email;

    private String password;

    private List<DiaryDto> diaryDtoList;

}
