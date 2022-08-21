package com.mirim9.dakku.mapper;

import com.mirim9.dakku.dto.MemberDto;
import com.mirim9.dakku.dto.ReplyDto;
import com.mirim9.dakku.dto.ReplyDto.ReplyDtoBuilder;
import com.mirim9.dakku.entity.Member;
import com.mirim9.dakku.entity.Reply;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-21T23:47:57+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.1 (Oracle Corporation)"
)
@Component
public class ReplyMapperImpl implements ReplyMapper {

    @Override
    public Reply toEntity(ReplyDto dto) {
        if ( dto == null ) {
            return null;
        }

        Reply reply = new Reply();

        return reply;
    }

    @Override
    public ReplyDto toDto(Reply entity) {
        if ( entity == null ) {
            return null;
        }

        ReplyDtoBuilder replyDto = ReplyDto.builder();

        replyDto.replyId( entity.getReplyId() );
        replyDto.content( entity.getContent() );
        replyDto.depth( entity.getDepth() );
        replyDto.member( memberToMemberDto( entity.getMember() ) );

        return replyDto.build();
    }

    @Override
    public List<Reply> toEntity(List<ReplyDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Reply> list = new ArrayList<Reply>( dtoList.size() );
        for ( ReplyDto replyDto : dtoList ) {
            list.add( toEntity( replyDto ) );
        }

        return list;
    }

    @Override
    public List<ReplyDto> toDto(List<Reply> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ReplyDto> list = new ArrayList<ReplyDto>( entityList.size() );
        for ( Reply reply : entityList ) {
            list.add( replyToReplyDto( reply ) );
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

    protected ReplyDto replyToReplyDto(Reply reply) {
        if ( reply == null ) {
            return null;
        }

        ReplyDtoBuilder replyDto = ReplyDto.builder();

        replyDto.replyId( reply.getReplyId() );
        replyDto.content( reply.getContent() );
        replyDto.depth( reply.getDepth() );
        replyDto.member( memberToMemberDto( reply.getMember() ) );

        return replyDto.build();
    }
}
