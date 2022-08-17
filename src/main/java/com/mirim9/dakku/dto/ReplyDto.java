package com.mirim9.dakku.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReplyDto extends BaseEntityDto {
    private Long replyId;

    private String content;

    private int depth;

    private DiaryDto diary;

    private MemberDto member;
}
