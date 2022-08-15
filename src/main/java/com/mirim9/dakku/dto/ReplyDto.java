package com.mirim9.dakku.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReplyDto extends BaseEntityDto {
    private Long replyId;

    private String content;

    private int depth;

    private DiaryDto diaryDto;

    private MemberDto memberDto;
}
