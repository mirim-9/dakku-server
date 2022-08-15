package com.mirim9.dakku.service;

import com.mirim9.dakku.dto.MemberDto;
import com.mirim9.dakku.mapper.MemberMapper;
import com.mirim9.dakku.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    private final MemberMapper memberMapper;

    public List<MemberDto> findAllMemberList() {
        return memberMapper.toDto(memberRepository.findAll());
    }
}
