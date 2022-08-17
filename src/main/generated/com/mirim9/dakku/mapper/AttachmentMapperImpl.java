package com.mirim9.dakku.mapper;

import com.mirim9.dakku.dto.AttachmentDto;
import com.mirim9.dakku.dto.MemberDto;
import com.mirim9.dakku.entity.Attachment;
import com.mirim9.dakku.entity.Member;
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
public class AttachmentMapperImpl implements AttachmentMapper {

    @Override
    public Attachment toEntity(AttachmentDto dto) {
        if ( dto == null ) {
            return null;
        }

        Attachment attachment = new Attachment();

        return attachment;
    }

    @Override
    public AttachmentDto toDto(Attachment entity) {
        if ( entity == null ) {
            return null;
        }

        AttachmentDto attachmentDto = new AttachmentDto();

        attachmentDto.setCreateDateTime( entity.getCreateDateTime() );
        attachmentDto.setModifyDateTime( entity.getModifyDateTime() );
        attachmentDto.setAttachmentId( entity.getAttachmentId() );
        attachmentDto.setName( entity.getName() );
        attachmentDto.setFileS3Url( entity.getFileS3Url() );
        attachmentDto.setFileS3Name( entity.getFileS3Name() );
        attachmentDto.setMember( memberToMemberDto( entity.getMember() ) );

        return attachmentDto;
    }

    @Override
    public List<Attachment> toEntity(List<AttachmentDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Attachment> list = new ArrayList<Attachment>( dtoList.size() );
        for ( AttachmentDto attachmentDto : dtoList ) {
            list.add( toEntity( attachmentDto ) );
        }

        return list;
    }

    @Override
    public List<AttachmentDto> toDto(List<Attachment> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AttachmentDto> list = new ArrayList<AttachmentDto>( entityList.size() );
        for ( Attachment attachment : entityList ) {
            list.add( attachmentToAttachmentDto( attachment ) );
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

    protected AttachmentDto attachmentToAttachmentDto(Attachment attachment) {
        if ( attachment == null ) {
            return null;
        }

        AttachmentDto attachmentDto = new AttachmentDto();

        attachmentDto.setCreateDateTime( attachment.getCreateDateTime() );
        attachmentDto.setModifyDateTime( attachment.getModifyDateTime() );
        attachmentDto.setAttachmentId( attachment.getAttachmentId() );
        attachmentDto.setName( attachment.getName() );
        attachmentDto.setFileS3Url( attachment.getFileS3Url() );
        attachmentDto.setFileS3Name( attachment.getFileS3Name() );
        attachmentDto.setMember( memberToMemberDto( attachment.getMember() ) );

        return attachmentDto;
    }
}
