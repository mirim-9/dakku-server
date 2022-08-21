package com.mirim9.dakku.controller;

import com.mirim9.dakku.config.JwtTokenProvider;
import com.mirim9.dakku.dto.MemberDto;
import com.mirim9.dakku.entity.Member;
import com.mirim9.dakku.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/members")
@RequiredArgsConstructor
@Slf4j
public class MemberContoller {

    private final JwtTokenProvider jwtTokenProvider;
    private final MemberService memberService;

    @PostMapping
    public ResponseEntity saveMember(@RequestBody MemberDto memberDto){
        return ResponseEntity.ok(memberService.saveMember(memberDto));
    }

    @PostMapping("/login")
    public String login(@RequestBody MemberDto memberDto) {
        log.info("user email = {}", memberDto.getEmail());

        Member member = (Member) memberService.loadUserByUsername(memberDto.getEmail());

        return jwtTokenProvider.createToken(member.getUsername(), member.getRoles());
    }

}
