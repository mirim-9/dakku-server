package com.mirim9.dakku.mapper;

import com.mirim9.dakku.dto.HeartDto;
import com.mirim9.dakku.dto.MemberDto;
import com.mirim9.dakku.entity.Heart;
import com.mirim9.dakku.entity.Member;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-21T23:47:58+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.1 (Oracle Corporation)"
)
@Component
public class HeartMapperImpl implements HeartMapper {

    @Override
    public Heart toEntity(HeartDto dto) {
        if ( dto == null ) {
            return null;
        }

        Heart heart = new Heart();

        return heart;
    }

    @Override
    public HeartDto toDto(Heart entity) {
        if ( entity == null ) {
            return null;
        }

        HeartDto heartDto = new HeartDto();

        heartDto.setCreateDateTime( entity.getCreateDateTime() );
        heartDto.setModifyDateTime( entity.getModifyDateTime() );
        heartDto.setHeartId( entity.getHeartId() );
        heartDto.setMember( memberToMemberDto( entity.getMember() ) );

        return heartDto;
    }

    @Override
    public List<Heart> toEntity(List<HeartDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Heart> list = new ArrayList<Heart>( dtoList.size() );
        for ( HeartDto heartDto : dtoList ) {
            list.add( toEntity( heartDto ) );
        }

        return list;
    }

    @Override
    public List<HeartDto> toDto(List<Heart> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<HeartDto> list = new ArrayList<HeartDto>( entityList.size() );
        for ( Heart heart : entityList ) {
            list.add( heartToHeartDto( heart ) );
        }

        return list;
    }

    protected MemberDto memberToMemberDto(Member member) {
        if ( member == null ) {
            return null;
        }

        MemberDto memberDto = new MemberDto();

        memberDto.setCreateDateTime( member.getCreateDateTime() );
        memberDto.setModifyDateTime( member.getModifyDateTime() );
        memberDto.setMemberId( member.getMemberId() );
        memberDto.setNickname( member.getNickname() );
        memberDto.setEmail( member.getEmail() );
        memberDto.setPassword( member.getPassword() );
        List<String> list = member.getRoles();
        if ( list != null ) {
            memberDto.setRoles( new ArrayList<String>( list ) );
        }

        return memberDto;
    }

    protected HeartDto heartToHeartDto(Heart heart) {
        if ( heart == null ) {
            return null;
        }

        HeartDto heartDto = new HeartDto();

        heartDto.setCreateDateTime( heart.getCreateDateTime() );
        heartDto.setModifyDateTime( heart.getModifyDateTime() );
        heartDto.setHeartId( heart.getHeartId() );
        heartDto.setMember( memberToMemberDto( heart.getMember() ) );

        return heartDto;
    }
}
