package com.mirim9.dakku.mapper;

import com.mirim9.dakku.dto.AttachmentDto;
import com.mirim9.dakku.entity.Attachment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", config = EntityMapper.class)
public interface AttachmentMapper extends EntityMapper<AttachmentDto, Attachment> {
}
