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
public class DiaryDto extends BaseEntityDto{
    private Long diaryId;

    private String title;

    private String fileS3Url;

    private String fileS3Name;

    private MemberDto member;

    private List<ReplyDto> replyList = new ArrayList<>();

    private List<HeartDto> heartList = new ArrayList<>();
}
