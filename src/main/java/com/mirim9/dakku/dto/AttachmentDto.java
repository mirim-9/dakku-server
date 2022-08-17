package com.mirim9.dakku.dto;

import com.mirim9.dakku.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AttachmentDto extends BaseEntityDto{

    private Long attachmentId;

    private String name;

    private String fileS3Url;

    private String fileS3Name;

    private MemberDto member;
}
