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
        heartDto.setDiary( diaryToDiaryDto( entity.getDiary() ) );

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
        replyDto.diary( diaryToDiaryDto( reply.getDiary() ) );
        replyDto.member( memberToMemberDto( reply.getMember() ) );

        return replyDto.build();
    }

    protected List<ReplyDto> replyListToReplyDtoList(List<Reply> list) {
        if ( list == null ) {
            return null;
        }

        List<ReplyDto> list1 = new ArrayList<ReplyDto>( list.size() );
        for ( Reply reply : list ) {
            list1.add( replyToReplyDto( reply ) );
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
        diaryDto.setReplyList( replyListToReplyDtoList( diary.getReplyList() ) );
        diaryDto.setHeartList( toDto( diary.getHeartList() ) );

        return diaryDto;
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
}
