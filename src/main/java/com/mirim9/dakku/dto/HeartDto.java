package com.mirim9.dakku.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HeartDto extends BaseEntityDto {

    private Long heartId;

    private MemberDto member;
}
