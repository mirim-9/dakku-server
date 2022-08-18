package com.mirim9.dakku.mapper;

import com.mirim9.dakku.dto.DiaryDto;
import com.mirim9.dakku.dto.HeartDto;
import com.mirim9.dakku.dto.ReplyDto;
import com.mirim9.dakku.entity.Diary;
import com.mirim9.dakku.entity.Heart;
import com.mirim9.dakku.entity.Reply;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", config = EntityMapper.class)
public interface DiaryMapper extends EntityMapper<DiaryDto, Diary> {
    Heart map(HeartDto value);

    Reply map(ReplyDto value);

    HeartDto mapDto(Heart heart);

    ReplyDto mapDto(Reply reply);

}
