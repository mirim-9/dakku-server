package com.mirim9.dakku.service;

import com.mirim9.dakku.repository.ReplyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReplyService {
    private static ReplyRepository replyRepository;
}
