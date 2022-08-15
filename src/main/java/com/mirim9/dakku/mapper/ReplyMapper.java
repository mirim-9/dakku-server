package com.mirim9.dakku.mapper;

import com.mirim9.dakku.dto.ReplyDto;
import com.mirim9.dakku.entity.Reply;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", config = EntityMapper.class)
public interface ReplyMapper extends EntityMapper<ReplyDto, Reply> {
}
