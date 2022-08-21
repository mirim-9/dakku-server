package com.mirim9.dakku.service;

import com.mirim9.dakku.dto.MemberDto;
import com.mirim9.dakku.entity.Member;
import com.mirim9.dakku.mapper.MemberMapper;
import com.mirim9.dakku.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService implements UserDetailsService {
    private final MemberRepository memberRepository;
    private final MemberMapper memberMapper;

    public List<MemberDto> findAllMemberList() {
        return memberMapper.toDto(memberRepository.findAll());
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return memberRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("사용자를 찾을 수 없습니다."));
    }

    public MemberDto saveMember(MemberDto memberDto){
        Member member = memberRepository.save(memberMapper.toEntity(memberDto));
        return memberMapper.toDto(member);
    }
}
