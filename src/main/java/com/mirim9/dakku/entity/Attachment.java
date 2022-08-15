package com.mirim9.dakku.entity;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Getter
public class Attachment extends BaseEntity{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long attachmentId;

    @NotBlank
    private String name;

    @NotBlank
    private String fileS3Url;

    @NotBlank
    private String fileS3Name;

    private Member member;
}
