package com.mirim9.dakku.mapper;

import com.mirim9.dakku.dto.MemberDto;
import com.mirim9.dakku.entity.Member;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", config = EntityMapper.class)
public interface MemberMapper extends EntityMapper<MemberDto, Member> {
}