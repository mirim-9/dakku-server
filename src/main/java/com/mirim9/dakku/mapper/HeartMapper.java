package com.mirim9.dakku.mapper;

import com.mirim9.dakku.dto.HeartDto;
import com.mirim9.dakku.entity.Heart;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", config = EntityMapper.class)
public interface HeartMapper extends EntityMapper<HeartDto, Heart> {
}
