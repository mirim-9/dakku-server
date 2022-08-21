package com.mirim9.dakku.mapper;

import com.mirim9.dakku.dto.MemberDto;
import com.mirim9.dakku.entity.Member;
import com.mirim9.dakku.entity.Member.MemberBuilder;
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
public class MemberMapperImpl implements MemberMapper {

    @Override
    public Member toEntity(MemberDto dto) {
        if ( dto == null ) {
            return null;
        }

        MemberBuilder member = Member.builder();

        member.nickname( dto.getNickname() );
        member.email( dto.getEmail() );
        member.password( dto.getPassword() );
        List<String> list = dto.getRoles();
        if ( list != null ) {
            member.roles( new ArrayList<String>( list ) );
        }

        return member.build();
    }

    @Override
    public MemberDto toDto(Member entity) {
        if ( entity == null ) {
            return null;
        }

        MemberDto memberDto = new MemberDto();

        memberDto.setCreateDateTime( entity.getCreateDateTime() );
        memberDto.setModifyDateTime( entity.getModifyDateTime() );
        memberDto.setMemberId( entity.getMemberId() );
        memberDto.setNickname( entity.getNickname() );
        memberDto.setEmail( entity.getEmail() );
        memberDto.setPassword( entity.getPassword() );
        List<String> list = entity.getRoles();
        if ( list != null ) {
            memberDto.setRoles( new ArrayList<String>( list ) );
        }

        return memberDto;
    }

    @Override
    public List<Member> toEntity(List<MemberDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Member> list = new ArrayList<Member>( dtoList.size() );
        for ( MemberDto memberDto : dtoList ) {
            list.add( toEntity( memberDto ) );
        }

        return list;
    }

    @Override
    public List<MemberDto> toDto(List<Member> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<MemberDto> list = new ArrayList<MemberDto>( entityList.size() );
        for ( Member member : entityList ) {
            list.add( memberToMemberDto( member ) );
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
}
