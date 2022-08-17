package com.mirim9.dakku.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto extends BaseEntityDto{
    private Long memberId;

    private String nickname;

    private String email;

    private String password;

    private List<DiaryDto> diaryList = new ArrayList<>();

}
