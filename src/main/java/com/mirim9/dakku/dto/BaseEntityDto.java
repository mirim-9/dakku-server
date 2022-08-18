package com.mirim9.dakku.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BaseEntityDto {

    //    private String createdBy;
    private LocalDateTime createDateTime;

    //    private String modifiedBy;
    private LocalDateTime modifyDateTime;
}
