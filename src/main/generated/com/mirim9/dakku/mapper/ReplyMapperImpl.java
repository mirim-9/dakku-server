package com.mirim9.dakku.mapper;

import com.mirim9.dakku.dto.DiaryDto;
import com.mirim9.dakku.dto.HeartDto;
import com.mirim9.dakku.dto.MemberDto;
import com.mirim9.dakku.dto.ReplyDto;
import com.mirim9.dakku.dto.ReplyDto.ReplyDtoBuilder;
import com.mirim9.dakku.entity.Diary;
import com.mirim9.dakku.entity.Heart;
import com.mirim9.dakku.entity.Member;
import com.mirim9.dakku.entity.Reply;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-17T23:46:21+0900",
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
        replyDto.diary( diaryToDiaryDto( entity.getDiary() ) );
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
        heartDto.setDiary( diaryToDiaryDto( heart.getDiary() ) );

        return heartDto;
    }

    protected List<HeartDto> heartListToHeartDtoList(List<Heart> list) {
        if ( list == null ) {
            return null;
        }

        List<HeartDto> list1 = new ArrayList<HeartDto>( list.size() );
        for ( Heart heart : list ) {
            list1.add( heartToHeartDto( heart ) );
        }

        return list1;
    }

    protected DiaryDto diaryToDiaryDto(Diary diary) {
        if ( diary == null ) {
            return null;
        }

        DiaryDto diaryDto = new DiaryDto();

        diaryDto.setCreateDateTime( diary.getCreateDateTime() );
        diaryDto.setModifyDateTime( diary.getModifyDateTime() );
        diaryDto.setDiaryId( diary.getDiaryId() );
        diaryDto.setTitle( diary.getTitle() );
        diaryDto.setFileS3Url( diary.getFileS3Url() );
        diaryDto.setFileS3Name( diary.getFileS3Name() );
        diaryDto.setMember( memberToMemberDto( diary.getMember() ) );
        diaryDto.setReplyList( toDto( diary.getReplyList() ) );
        diaryDto.setHeartList( heartListToHeartDtoList( diary.getHeartList() ) );

        return diaryDto;
    }

    protected ReplyDto replyToReplyDto(Reply reply) {
        if ( reply == null ) {
            return null;
        }

        ReplyDtoBuilder replyDto = ReplyDto.builder();

        replyDto.replyId( reply.getReplyId() );
        replyDto.content( reply.getContent() );
        replyDto.depth( reply.getDepth() );
        replyDto.diary( diaryToDiaryDto( reply.getDiary() ) );
        replyDto.member( memberToMemberDto( reply.getMember() ) );

        return replyDto.build();
    }
}
