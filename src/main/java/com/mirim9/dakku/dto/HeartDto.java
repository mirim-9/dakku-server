package com.mirim9.dakku.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HeartDto extends BaseEntityDto{

    private Long heartId;

    private MemberDto memberDto;

    private DiaryDto diaryDto;
}
