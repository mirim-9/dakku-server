package com.mirim9.dakku.mapper;

import com.mirim9.dakku.dto.DiaryDto;
import com.mirim9.dakku.entity.Diary;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", config = EntityMapper.class)
public interface DiaryMapper extends EntityMapper<DiaryDto, Diary> {
}
