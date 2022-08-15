package com.mirim9.dakku.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DiaryDto extends BaseEntityDto{
    private Long diaryId;

    private String title;

    private String fileS3Url;

    private String fileS3Name;

    private MemberDto memberDto;

    private List<ReplyDto> replyDtoList;

    private List<HeartDto> heartDtoList;
}
